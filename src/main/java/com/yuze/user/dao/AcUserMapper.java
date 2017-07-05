package com.yuze.user.dao;

import com.yuze.user.model.AcUser;
import com.yuze.user.model.AcUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    long countByExample(AcUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    int deleteByExample(AcUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    int insert(AcUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    int insertSelective(AcUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    List<AcUser> selectByExample(AcUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    AcUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    int updateByExampleSelective(@Param("record") AcUser record, @Param("example") AcUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    int updateByExample(@Param("record") AcUser record, @Param("example") AcUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    int updateByPrimaryKeySelective(AcUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    int updateByPrimaryKey(AcUser record);
}