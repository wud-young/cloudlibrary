package com.cafuc.domain;

public class User {
    private int U_id;
    private String U_name;
    private String U_email;
    private String U_password;
    private Permissions U_Permissions;

    public String getRole(){
        return this.U_Permissions.getaPermissions();
    }
    @Override
    public String toString() {
        return "User{" +
                "U_id=" + U_id +
                ", U_name='" + U_name + '\'' +
                ", U_email='" + U_email + '\'' +
                ", U_password='" + U_password + '\'' +
                ", U_Permissions=" + U_Permissions +
                '}';
    }

    public int getU_id() {
        return U_id;
    }

    public void setU_id(int u_id) {
        U_id = u_id;
    }

    public String getU_name() {
        return U_name;
    }

    public void setU_name(String u_name) {
        U_name = u_name;
    }

    public String getU_email() {
        return U_email;
    }

    public void setU_email(String u_email) {
        U_email = u_email;
    }

    public String getU_password() {
        return U_password;
    }

    public void setU_password(String u_password) {
        U_password = u_password;
    }

    public Permissions getU_Permissions() {
        return U_Permissions;
    }

    public void setU_Permissions(Permissions u_Permissions) {
        U_Permissions = u_Permissions;
    }
}
