package com.company.composition;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int gty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name,  Author[] authors, double price, int gty) {
        this.name = name;
        this.price = price;
        this.authors = authors;
        this.gty = gty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getGty() {
        return gty;
    }

    public void setGty(int gty) {
        this.gty = gty;
    }

    public String getAuthorsNames(){
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", gty=" + gty +
                '}';
    }
}
