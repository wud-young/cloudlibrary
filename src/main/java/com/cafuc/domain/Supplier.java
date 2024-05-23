package com.cafuc.domain;

public class Supplier {
    private int S_id;
    private String S_name;
    private String S_address;
    private String S_tel;
    private String S_manager;

    @Override
    public String toString() {
        return "Supplier{" +
                "S_id=" + S_id +
                ", S_name='" + S_name + '\'' +
                ", S_address='" + S_address + '\'' +
                ", S_tel='" + S_tel + '\'' +
                ", S_manager='" + S_manager + '\'' +
                '}';
    }

    public int getS_id() {
        return S_id;
    }

    public void setS_id(int s_id) {
        S_id = s_id;
    }

    public String getS_name() {
        return S_name;
    }

    public void setS_name(String s_name) {
        S_name = s_name;
    }

    public String getS_address() {
        return S_address;
    }

    public void setS_address(String s_address) {
        S_address = s_address;
    }

    public String getS_tel() {
        return S_tel;
    }

    public void setS_tel(String s_tel) {
        S_tel = s_tel;
    }

    public String getS_manager() {
        return S_manager;
    }

    public void setS_manager(String s_manager) {
        S_manager = s_manager;
    }
}
