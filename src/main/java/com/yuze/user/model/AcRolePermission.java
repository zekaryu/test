package com.yuze.user.model;

import java.util.Date;

public class AcRolePermission {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_role_permission.id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_role_permission.role_id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    private Long roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_role_permission.permission_id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    private Long permissionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_role_permission.gmt_create
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_role_permission.gmt_modified
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_role_permission.id
     *
     * @return the value of ac_role_permission.id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_role_permission.id
     *
     * @param id the value for ac_role_permission.id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_role_permission.role_id
     *
     * @return the value of ac_role_permission.role_id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_role_permission.role_id
     *
     * @param roleId the value for ac_role_permission.role_id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_role_permission.permission_id
     *
     * @return the value of ac_role_permission.permission_id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public Long getPermissionId() {
        return permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_role_permission.permission_id
     *
     * @param permissionId the value for ac_role_permission.permission_id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_role_permission.gmt_create
     *
     * @return the value of ac_role_permission.gmt_create
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_role_permission.gmt_create
     *
     * @param gmtCreate the value for ac_role_permission.gmt_create
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_role_permission.gmt_modified
     *
     * @return the value of ac_role_permission.gmt_modified
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_role_permission.gmt_modified
     *
     * @param gmtModified the value for ac_role_permission.gmt_modified
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_permission
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
        sb.append(", roleId=").append(roleId);
        sb.append(", permissionId=").append(permissionId);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_permission
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
        AcRolePermission other = (AcRolePermission) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getPermissionId() == null ? other.getPermissionId() == null : this.getPermissionId().equals(other.getPermissionId()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_permission
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getPermissionId() == null) ? 0 : getPermissionId().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        return result;
    }
}