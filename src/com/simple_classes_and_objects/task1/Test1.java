package com.simple_classes_and_objects.task1;

public class Test1 {

    private int a, b;

    public Test1() {

    }

    public void print() {
        System.out.println("Первая переменная: " + a + "; Вторая переменная: " + b);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    public int max() {
        return Math.max(a, b);
    }
}
