package com.yuze.user.service;

import com.yuze.framework.service.BaseService;
import com.yuze.user.model.AcPermission;
import com.yuze.user.model.AcPermissionExample;

import java.util.List;

/**
* AcPermissionService接口
* Created by yuze on 2017/7/7.
*/
public interface AcPermissionService extends BaseService<AcPermission, AcPermissionExample, Integer> {
    /**
     * 通过角色id 查询角色 拥有的权限
     */
    List<AcPermission> selectPermissionsByRoleId(Long roleId);
}