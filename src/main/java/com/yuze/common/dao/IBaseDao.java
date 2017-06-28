package com.yuze.common.dao;

import com.github.pagehelper.Page;

import java.util.Map;


/**
 * @param <E>
 */
public interface IBaseDao<E> {

    //插入
    Page<E> selectByCondition(Map<String, Object> map);

}
