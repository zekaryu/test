package com.yuze.user.model;

import java.util.Date;

public class AcUserGroupUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_user_group_user.id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_user_group_user.gmt_create
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_user_group_user.gmt_modified
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_user_group_user.user_group_id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    private Long userGroupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_user_group_user.user_id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    private Long userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_user_group_user.id
     *
     * @return the value of ac_user_group_user.id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_user_group_user.id
     *
     * @param id the value for ac_user_group_user.id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_user_group_user.gmt_create
     *
     * @return the value of ac_user_group_user.gmt_create
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_user_group_user.gmt_create
     *
     * @param gmtCreate the value for ac_user_group_user.gmt_create
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_user_group_user.gmt_modified
     *
     * @return the value of ac_user_group_user.gmt_modified
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_user_group_user.gmt_modified
     *
     * @param gmtModified the value for ac_user_group_user.gmt_modified
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_user_group_user.user_group_id
     *
     * @return the value of ac_user_group_user.user_group_id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public Long getUserGroupId() {
        return userGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_user_group_user.user_group_id
     *
     * @param userGroupId the value for ac_user_group_user.user_group_id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public void setUserGroupId(Long userGroupId) {
        this.userGroupId = userGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_user_group_user.user_id
     *
     * @return the value of ac_user_group_user.user_id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_user_group_user.user_id
     *
     * @param userId the value for ac_user_group_user.user_id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user_group_user
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", userGroupId=").append(userGroupId);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user_group_user
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AcUserGroupUser other = (AcUserGroupUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getUserGroupId() == null ? other.getUserGroupId() == null : this.getUserGroupId().equals(other.getUserGroupId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user_group_user
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        result = prime * result + ((getUserGroupId() == null) ? 0 : getUserGroupId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return result;
    }
}