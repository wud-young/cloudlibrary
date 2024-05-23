package com.cafuc.domain;

public class PurchaseContract {
    private int P_id;
    private int P_number;
    private Equipment P_Equipment;
    private String P_date;
    private float P_price;
    private String P_sale;
    private Supplier P_Supplier;
    private String P_name;

    @Override
    public String toString() {
        return "PurchaseContract{" +
                "P_id=" + P_id +
                ", P_number=" + P_number +
                ", P_Equipment=" + P_Equipment +
                ", P_date='" + P_date + '\'' +
                ", P_price=" + P_price +
                ", P_sale='" + P_sale + '\'' +
                ", P_Supplier=" + P_Supplier +
                ", P_name='" + P_name + '\'' +
                '}';
    }

    public int getP_id() {
        return P_id;
    }

    public void setP_id(int p_id) {
        P_id = p_id;
    }

    public int getP_number() {
        return P_number;
    }

    public void setP_number(int p_number) {
        P_number = p_number;
    }

    public Equipment getP_Equipment() {
        return P_Equipment;
    }

    public void setP_Equipment(Equipment p_Equipment) {
        P_Equipment = p_Equipment;
    }

    public String getP_date() {
        return P_date;
    }

    public void setP_date(String p_date) {
        P_date = p_date;
    }

    public float getP_price() {
        return P_price;
    }

    public void setP_price(float p_price) {
        P_price = p_price;
    }

    public String getP_sale() {
        return P_sale;
    }

    public void setP_sale(String p_sale) {
        P_sale = p_sale;
    }

    public Supplier getP_Supplier() {
        return P_Supplier;
    }

    public void setP_Supplier(Supplier p_Supplier) {
        P_Supplier = p_Supplier;
    }

    public String getP_name() {
        return P_name;
    }

    public void setP_name(String p_name) {
        P_name = p_name;
    }
}
