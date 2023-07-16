package com.simple_classes_and_objects.task3;

public class Student {

    private String surname, name;
    private int groupNumber;
    private int[] progress;

    public Student() {

    }

    public Student(String surname, String name, int groupNumber, int[] progress) {
        this.surname = surname;
        this.name = name;
        this.groupNumber = groupNumber;
        this.progress = progress;
    }

    public boolean isProgressNineOrTen() {
        for (int i : this.progress) {
            if (i < 9 || i > 10) return false;
        }
        return true;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getProgress() {
        return progress;
    }

    public void setProgress(int[] progress) {
        this.progress = progress;
    }
}
