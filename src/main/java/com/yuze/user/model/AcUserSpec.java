package com.yuze.user.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yuze on 2017/7/7. All rights reserved.
 */
public class AcUserSpec implements Serializable {

    private String id;
    private AcUser user;
    private List<AcUserAuth> userAuths;
    private AcUserInfo userInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AcUser getUser() {
        return user;
    }

    public void setUser(AcUser user) {
        this.user = user;
    }

    public List<AcUserAuth> getUserAuths() {
        return userAuths;
    }

    public void setUserAuths(List<AcUserAuth> userAuths) {
        this.userAuths = userAuths;
    }

    public AcUserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(AcUserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcUserSpec that = (AcUserSpec) o;

        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        if (userAuths != null ? !userAuths.equals(that.userAuths) : that.userAuths != null)
            return false;
        return userInfo != null ? userInfo.equals(that.userInfo) : that.userInfo == null;
    }

    @Override
    public int hashCode() {
        int result = user != null ? user.hashCode() : 0;
        result = 31 * result + (userAuths != null ? userAuths.hashCode() : 0);
        result = 31 * result + (userInfo != null ? userInfo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AcUserSpec{" +
                "user=" + user +
                ", userAuths=" + userAuths +
                ", userInfo=" + userInfo +
                '}';
    }
}
