package com.simple_classes_and_objects.task9;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        BookArray books = new BookArray(Arrays.asList(
                new Book(idGenerator(), "Собачье сердце", "Булгаков М. А.", "Мир книг", 1984, 288, 8.54, "твердый"),
                new Book(idGenerator(), "Мастер и Маргарита", "Булгаков М. А.", "Остров книг", 1966, 420, 15.94, "мягкий"),
                new Book(idGenerator(), "Война и мир", "Толстой Л. Н.", "Остров книг", 1865, 1300, 18.72, "твердый"),
                new Book(idGenerator(), "Преступление и наказание", "Достоевский Ф.М.", "Мир книг", 1866, 592, 9.09, "мягкий")));
        System.out.println("Список: \n" + books);
        String author = "Булгаков М. А.";
        System.out.println("Список книг автора " + author + ": \n" + books.getListByAuthor(author));
        String publishingHouse = "Остров книг";
        System.out.println("Список книг издания " + publishingHouse + ": \n" + books.getBooksByPublishingHouse(publishingHouse));
        int year = 1900;
        System.out.print("Список книг, выпущенных после " + year + " года: \n" + books.getBooksByPublicationYear(year));
    }

    private static long idGenerator() {
        return (long) (Math.random() * 1000);
    }
}
