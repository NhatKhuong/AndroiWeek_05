package com.example.androi_week05;

import java.io.Serializable;

public class Goods implements Serializable {

    private String name;
    private String description;
    private double price;
    private int img;


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getImg() {
        return img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public Goods(String name, String description, double price, int img) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.img = img;
    }

    public Goods() {
    }
}
