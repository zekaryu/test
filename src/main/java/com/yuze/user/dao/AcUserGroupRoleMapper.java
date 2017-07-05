package com.yuze.user.dao;

import com.yuze.user.model.AcUserGroupRole;
import com.yuze.user.model.AcUserGroupRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcUserGroupRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user_group_role
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    long countByExample(AcUserGroupRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user_group_role
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    int deleteByExample(AcUserGroupRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user_group_role
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user_group_role
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    int insert(AcUserGroupRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user_group_role
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    int insertSelective(AcUserGroupRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user_group_role
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    List<AcUserGroupRole> selectByExample(AcUserGroupRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user_group_role
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    AcUserGroupRole selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user_group_role
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    int updateByExampleSelective(@Param("record") AcUserGroupRole record, @Param("example") AcUserGroupRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user_group_role
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    int updateByExample(@Param("record") AcUserGroupRole record, @Param("example") AcUserGroupRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user_group_role
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    int updateByPrimaryKeySelective(AcUserGroupRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user_group_role
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    int updateByPrimaryKey(AcUserGroupRole record);
}