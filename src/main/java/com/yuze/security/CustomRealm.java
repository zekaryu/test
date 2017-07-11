package com.yuze.security;

import com.yuze.user.model.AcPermission;
import com.yuze.user.model.AcRole;
import com.yuze.user.model.AcUserAuth;
import com.yuze.user.model.AcUserSpec;
import com.yuze.user.service.AcPermissionService;
import com.yuze.user.service.AcRoleService;
import com.yuze.user.service.AcUserService;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by yuze on 2017/7/5. All rights reserved.
 */
public class CustomRealm extends AuthorizingRealm {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AcUserService userService;

    @Autowired
    private AcRoleService roleService;

    @Autowired
    private AcPermissionService permissionService;

    /**
     * 为当前登录的Subject授予角色和权限
     * @see 经测试:本例中该方法的调用时机为需授权资源被访问时
     * @see 经测试:并且每次访问需授权资源时都会执行该方法中的逻辑,这表明本例中默认并未启用AuthorizationCache
     * @see 个人感觉若使用了Spring3.1开始提供的ConcurrentMapCache支持,则可灵活决定是否启用AuthorizationCache
     * @see 比如说这里从数据库获取权限信息时,先去访问Spring3.1提供的缓存,而不使用Shior提供的AuthorizationCache
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取当前登录的用户名,等价于(String)principals.fromRealm(this.getName()).iterator().next()
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        String username = String.valueOf(principalCollection.getPrimaryPrincipal());

        final AcUserSpec userSpec = userService.selectByUsername(username);
        final List<AcRole> roles = roleService.selectRoleByUserId(userSpec.getUser().getId());
        for (AcRole role : roles) {
            //添加角色
            logger.info(String.valueOf(role));
            authorizationInfo.addRole(role.getName());

            final List<AcPermission> permissions = permissionService.selectPermissionsByRoleId(role.getId());
            for (AcPermission permission : permissions) {
                //添加权限
                logger.info(String.valueOf(permission));
                authorizationInfo.addStringPermission(permission.getCode());
            }
        }
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = String.valueOf(authenticationToken.getPrincipal());
        String password = new String((char[]) authenticationToken.getCredentials());
        //通过数据库验证
        AcUserAuth userAuth = new AcUserAuth();
        userAuth.setIdentifier(username);
        userAuth.setCredential(password);
        final AcUserAuth authentication = userService.authentication(userAuth);
        if (authentication == null) {
            throw new AuthenticationException("用户名密码错误");
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(username, password, getName());
        return authenticationInfo;
    }
}
