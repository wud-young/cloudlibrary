package com.cafuc.domain;

public class Permissions {
    private int P_id;
    private String aPermissions;

    @Override
    public String toString() {
        return "'" + aPermissions + '\''
                ;
    }


    public String getaPermissions() {
        return aPermissions;
    }
    public void setaPermissions(String aPermissions) {
        this.aPermissions = aPermissions;
    }
    public int getP_id() {
        return P_id;
    }
    public void setP_id(int p_id) {
        P_id = p_id;
    }

}
