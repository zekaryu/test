package com.yuze.user.service;

import com.yuze.framework.service.BaseService;
import com.yuze.user.model.AcRole;
import com.yuze.user.model.AcRoleExample;

import java.util.List;

/**
* AcRoleService接口
* Created by yuze on 2017/7/7.
*/
public interface AcRoleService extends BaseService<AcRole, AcRoleExample, Integer> {
    /**
     * 通过用户id 查询用户 拥有的角色
     */
    List<AcRole> selectRoleByUserId(Long userId);
}