package com.simple_classes_and_objects.task9;

import java.util.Calendar;

public class Book {
    private long id;
    private String title, author, publishingHouse, bindingType;
    private int publicationYear, numberOfPages;
    private double price;

    public Book() {
    }

    public Book(long id, String title, String author, String publishingHouse, int publicationYear, int numberOfPages, double price, String bindingType) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.publicationYear = publicationYear;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Книга: " +
                "id - " + id +
                ", название - " + title +
                ", автор - " + author +
                ", издательство - " + publishingHouse +
                ", год издания - " + publicationYear +
                ", количество страниц - " + numberOfPages +
                ", цена - " + price +
                ", тип переплета - " + bindingType + ".\n";
    }
}
