package com.bsoft.auth.key;

import java.io.Serializable;

public class RolePersonPKey implements Serializable {
    private Integer roleId;
    private String personId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }
}
