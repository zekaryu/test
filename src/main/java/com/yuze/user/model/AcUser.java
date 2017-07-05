package com.yuze.user.model;

import java.util.Date;

public class AcUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_user.id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_user.is_deleted
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    private Byte isDeleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_user.is_active
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    private Byte isActive;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_user.gmt_create
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_user.gmt_modified
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_user.id
     *
     * @return the value of ac_user.id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_user.id
     *
     * @param id the value for ac_user.id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_user.is_deleted
     *
     * @return the value of ac_user.is_deleted
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_user.is_deleted
     *
     * @param isDeleted the value for ac_user.is_deleted
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_user.is_active
     *
     * @return the value of ac_user.is_active
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public Byte getIsActive() {
        return isActive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_user.is_active
     *
     * @param isActive the value for ac_user.is_active
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public void setIsActive(Byte isActive) {
        this.isActive = isActive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_user.gmt_create
     *
     * @return the value of ac_user.gmt_create
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_user.gmt_create
     *
     * @param gmtCreate the value for ac_user.gmt_create
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_user.gmt_modified
     *
     * @return the value of ac_user.gmt_modified
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_user.gmt_modified
     *
     * @param gmtModified the value for ac_user.gmt_modified
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
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
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", isActive=").append(isActive);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
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
        AcUser other = (AcUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()))
            && (this.getIsActive() == null ? other.getIsActive() == null : this.getIsActive().equals(other.getIsActive()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        result = prime * result + ((getIsActive() == null) ? 0 : getIsActive().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        return result;
    }
}