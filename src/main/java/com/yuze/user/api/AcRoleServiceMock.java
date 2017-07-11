package com.yuze.user.api;

import com.yuze.framework.service.BaseServiceMock;
import com.yuze.user.dao.AcRoleMapper;
import com.yuze.user.model.AcRole;
import com.yuze.user.model.AcRoleExample;
import com.yuze.user.service.AcRoleService;

import java.util.List;

/**
* 降级实现AcRoleService接口
* Created by yuze on 2017/7/7.
*/
public class AcRoleServiceMock extends BaseServiceMock<AcRoleMapper, AcRole, AcRoleExample, Integer> implements AcRoleService {

    @Override
    public List<AcRole> selectRoleByUserId(Long userId) {
        return null;
    }
}
