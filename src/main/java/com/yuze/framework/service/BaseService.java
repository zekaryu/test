package com.yuze.framework.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by yuze on 2017/7/3. All rights reserved.
 */
public interface BaseService<Model, Example, PK> {
    int countByExample(Example example);

    int deleteByExample(Example example);

    int deleteByPrimaryKey(PK key);

    int insert(Model model);

    int insertSelective(Model model);

    List<Model> selectByExampleWithBLOBs(Example example);

    List<Model> selectByExample(Example example);

    List<Model> selectByExampleWithBLOBsForStartPage(Example example, Integer pageNum, Integer pageSize);

    List<Model> selectByExampleForStartPage(Example example, Integer pageNum, Integer pageSize);

    List<Model> selectByExampleWithBLOBsForOffsetPage(Example example, Integer offset, Integer limit);

    List<Model> selectByExampleForOffsetPage(Example example, Integer offset, Integer limit);

    Model selectFirstByExample(Example example);

    Model selectFirstByExampleWithBLOBs(Example example);

    Model selectByPrimaryKey(PK key);

    int updateByExampleSelective(@Param("model") Model model, @Param("example") Example example);

    int updateByExampleWithBLOBs(@Param("model") Model model, @Param("example") Example example);

    int updateByExample(@Param("model") Model model, @Param("example") Example example);

    int updateByPrimaryKeySelective(Model model);

    int updateByPrimaryKeyWithBLOBs(Model model);

    int updateByPrimaryKey(Model model);

    int deleteByPrimaryKeys(String ids);

    void initMapper();
}
