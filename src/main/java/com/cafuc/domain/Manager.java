package com.cafuc.domain;

public class Manager {
    private int EM_id;
    private String EM_name;
    private int EM_tel;
    private String EM_sex;
    private String EM_age;
    private Department EM_Department;

    @Override
    public String toString() {
        return "Manager{" +
                "EM_id=" + EM_id +
                ", EM_name='" + EM_name + '\'' +
                ", EM_tel=" + EM_tel +
                ", EM_sex='" + EM_sex + '\'' +
                ", EM_age='" + EM_age + '\'' +
                ", EM_Department=" + EM_Department +
                '}';
    }

    public int getEM_id() {
        return EM_id;
    }

    public void setEM_id(int EM_id) {
        this.EM_id = EM_id;
    }

    public String getEM_name() {
        return EM_name;
    }

    public void setEM_name(String EM_name) {
        this.EM_name = EM_name;
    }

    public int getEM_tel() {
        return EM_tel;
    }

    public void setEM_tel(int EM_tel) {
        this.EM_tel = EM_tel;
    }

    public String getEM_sex() {
        return EM_sex;
    }

    public void setEM_sex(String EM_sex) {
        this.EM_sex = EM_sex;
    }

    public String getEM_age() {
        return EM_age;
    }

    public void setEM_age(String EM_age) {
        this.EM_age = EM_age;
    }

    public Department getEM_Department() {
        return EM_Department;
    }

    public void setEM_Department(Department EM_Department) {
        this.EM_Department = EM_Department;
    }
}
