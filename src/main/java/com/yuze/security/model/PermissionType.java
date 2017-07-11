package com.yuze.security.model;

/**
 * 权限标识配置类, <br>
 * 与 permission 权限表 中的 code 字段 相对应 <br>
 * 使用:
 *
 * <pre>
 * &#064;RequiresPermissions(value = PermissionConfig.USER_CREATE)
 * public String create() {
 *     return &quot;拥有user:create权限,能访问&quot;;
 * }
 * </pre>
 * Created by yuze on 2017/7/7. All rights reserved.
 */
public class PermissionType {
    /**
     * 用户新增权限 标识
     */
    public static final String USER_CREATE = "user:create";

    /**
     * 用户删除权限 标识
     */
    public static final String USER_DELETE = "user:delete";

    /**
     * 添加更多...
     */
}
