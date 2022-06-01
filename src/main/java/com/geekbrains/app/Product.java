package com.geekbrains.app;

public class Product {
        int id;
    String title;
    double cost;

    public Product(int id, String title, double cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getCost() {
        return cost;
    }

    public void printProduct(){
        return;
    }
}
