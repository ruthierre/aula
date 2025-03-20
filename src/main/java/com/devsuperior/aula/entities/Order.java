package com.devsuperior.aula.entities;

public class Order {
    private int code; 
    private double basic;
    private double discount;

    public Order(int code, double basic, double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        if (basic < 0.0) {
            throw new IllegalArgumentException("Basic must be positive");
        }
        this.basic = basic;
    }

    public double getDiscount() {      
        return discount;
    }

    public void setDiscount(double discount) {
        if (discount > basic) {
            throw new IllegalArgumentException("Discount can't be greater than basic value");
        }
        if (discount < 0.0) {
            throw new IllegalArgumentException("Discount can't be negative");
        }
        this.discount = discount;
    }

    

}
