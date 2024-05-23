package com.cafuc.domain;

public class Category {
    private int EC_id;
    private String EC_name;
    private String EC_remark;

    @Override
    public String toString() {
        return "Category{" +
                "EC_id=" + EC_id +
                ", EC_name='" + EC_name + '\'' +
                ", EC_remark='" + EC_remark + '\'' +
                '}';
    }

    public int getEC_id() {
        return EC_id;
    }

    public void setEC_id(int EC_id) {
        this.EC_id = EC_id;
    }

    public String getEC_name() {
        return EC_name;
    }

    public void setEC_name(String EC_name) {
        this.EC_name = EC_name;
    }

    public String getEC_remark() {
        return EC_remark;
    }

    public void setEC_remark(String EC_remark) {
        this.EC_remark = EC_remark;
    }
}
