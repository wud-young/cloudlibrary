package com.cafuc.domain;

public class Status {
    private int ES_id;
    private String ES_name;


    @Override
    public String toString() {
        return "Status{" +
                "ES_id=" + ES_id +
                ", ES_name='" + ES_name + '\''
                ;
    }

    public int getES_id() {
        return ES_id;
    }

    public void setES_id(int ES_id) {
        this.ES_id = ES_id;
    }

    public String getES_name() {
        return ES_name;
    }

    public void setES_name(String ES_name) {
        this.ES_name = ES_name;
    }

}
