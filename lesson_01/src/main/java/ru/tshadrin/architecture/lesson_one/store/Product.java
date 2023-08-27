package ru.tshadrin.architecture.lesson_one.store;

public class Product {
    private static int counter = 100;

    private int id;
    private String name;
    private double price;
    private String category;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    {
        id = ++counter;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
