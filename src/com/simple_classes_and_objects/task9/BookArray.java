package com.simple_classes_and_objects.task9;

import java.util.ArrayList;
import java.util.List;

public class BookArray {
    private List<Book> books;

    public BookArray() {
    }

    public BookArray(List<Book> books) {
        this.books = books;
    }

    public List<Book> getListByAuthor(String author) {
        List<Book> books = new ArrayList<>();
        for (Book book : this.books) {
            if (book.getAuthor().equalsIgnoreCase(author)) books.add(book);
        }
        return books;
    }

    public List<Book> getBooksByPublishingHouse(String publishingHouse) {
        List<Book> books = new ArrayList<>();
        for (Book book : this.books) {
            if (book.getPublishingHouse().equalsIgnoreCase(publishingHouse))
                books.add(book);
        }
        return books;
    }

    public List<Book> getBooksByPublicationYear(int publicationYear) {
        List<Book> books = new ArrayList<>();
        for (Book book : this.books) {
            if (book.getPublicationYear() > publicationYear)
                books.add(book);
        }
        return books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return books + "";
    }
}
