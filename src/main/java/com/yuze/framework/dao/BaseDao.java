package com.yuze.framework.dao;

/**
 * Created by yuze on 2017/7/6. All rights reserved.
 */
public interface BaseDao<Model, PK> {
    //增
    int insertSelective(Model record);
    //删
    int deleteByPrimaryKey(PK id);
    //改
    int updateByPrimaryKeySelective(Model model);
    //查
    Model selectByPrimaryKey(PK id);
}
