package com.cafuc.domain;

public class Department {
    private int D_id;
    private String D_name;
    private String D_Tel;
    private String D_Manager;
    private String D_Address;

    @Override
    public String toString() {
        return "Department{" +
                "D_id=" + D_id +
                ", D_name='" + D_name + '\'' +
                ", D_Tel='" + D_Tel + '\'' +
                ", D_Manager='" + D_Manager + '\'' +
                ", D_Address='" + D_Address + '\'' +
                '}';
    }

    public int getD_id() {
        return D_id;
    }

    public void setD_id(int d_id) {
        D_id = d_id;
    }

    public String getD_name() {
        return D_name;
    }

    public void setD_name(String d_name) {
        D_name = d_name;
    }

    public String getD_Tel() {
        return D_Tel;
    }

    public void setD_Tel(String d_Tel) {
        D_Tel = d_Tel;
    }

    public String getD_Manager() {
        return D_Manager;
    }

    public void setD_Manager(String d_Manager) {
        D_Manager = d_Manager;
    }

    public String getD_Address() {
        return D_Address;
    }

    public void setD_Address(String d_Address) {
        D_Address = d_Address;
    }
}
