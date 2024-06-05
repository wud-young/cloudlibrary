package com.cafuc.domain;

public class Permissions {
    private String aPermissions;

    @Override
    public String toString() {
        return "Permissions{" +
                ", aPermissions='" + aPermissions + '\'' +
                '}';
    }


    public String getaPermissions() {
        return aPermissions;
    }

    public void setaPermissions(String aPermissions) {
        this.aPermissions = aPermissions;
    }
}
