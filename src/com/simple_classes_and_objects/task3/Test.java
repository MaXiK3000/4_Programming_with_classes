package com.simple_classes_and_objects.task3;

public class Test {

    public static void main(String[] args) {
        Student[] studentArr = {
                new Student("Агапитов", "Максим", 1, new int[]{9, 9, 9, 9, 9}),
                new Student("Жак", "Артём", 2, new int[]{7, 9, 9, 10, 9}),
                new Student("Ковалевский", "Павел", 3, new int[]{10, 9, 10, 9, 9}),
                new Student("Комисарова", "Дарья", 4, new int[]{6, 8, 6, 9, 7}),
                new Student("Антонова", "Татьяна", 5, new int[]{10, 10, 10, 10, 10}),
                new Student("Маханьков", "Степан", 6, new int[]{5, 7, 5, 4, 9}),
                new Student("Шабаниц", "Кирилл", 7, new int[]{4, 6, 5, 4, 7}),
                new Student("Анисимов", "Алексей", 8, new int[]{7, 8, 6, 9, 7}),
                new Student("Тарасевич", "Алина", 9, new int[]{9, 9, 9, 10, 9}),
                new Student("Панкрат", "Максим", 10, new int[]{9, 8, 9, 9, 7})};
        System.out.println("Список студентов, имеющие оценки, равные только 9 или 10:");
        for (Student student : studentArr) {
            if (student.isProgressNineOrTen()) {
                System.out.println(student.getSurname() + " " + student.getGroupNumber());
            }
        }
    }
}
