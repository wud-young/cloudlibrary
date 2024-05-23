package com.cafuc.domain;

public class Equipment {
    private int E_id;
    private String E_name;
    private Category E_Category;
    private Status e_Status;
    private Manager E_Manager;
    private String E_type;

    @Override
    public String toString() {
        return "Equipment{" +
                "E_id=" + E_id +
                ", E_name='" + E_name + '\'' +
                ", E_Category=" + E_Category +
                ", E_Status=" + e_Status +
                ", E_Manager=" + E_Manager +
                ", E_type='" + E_type + '\'' +
                '}';
    }

    public int getE_id() {
        return E_id;
    }

    public void setE_id(int e_id) {
        E_id = e_id;
    }

    public String getE_name() {
        return E_name;
    }

    public void setE_name(String e_name) {
        E_name = e_name;
    }

    public Category getE_Category() {
        return E_Category;
    }

    public void setE_Category(Category e_Category) {
        E_Category = e_Category;
    }

    public Status getE_Type() {
        return e_Status;
    }

    public void setE_Type(Status e_Status) {
        this.e_Status = e_Status;
    }

    public Manager getE_Manager() {
        return E_Manager;
    }

    public void setE_Manager(Manager e_Manager) {
        E_Manager = e_Manager;
    }

    public String getE_type() {
        return E_type;
    }

    public void setE_type(String e_type) {
        E_type = e_type;
    }
}
