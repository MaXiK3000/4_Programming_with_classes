package com.simple_classes_and_objects.task5;

public class Test {

    public static void main(String[] args) {
        Counter defaultCounter = new Counter();
        Counter randomCounter = new Counter(-5, 5);
        Counter counter = new Counter(-5, 5, 3);
        System.out.println(defaultCounter);
        System.out.println(randomCounter);
        System.out.println(counter);
        counter.increaseCount();
        counter.increaseCount();
        System.out.println("Текущее значение счетчика: " + counter.getCount() + "\n");
        counter.increaseCount();
        System.out.println("Текущее значение счетчика: " + counter.getCount() + "\n");
        counter.decreaseCount();
        counter.decreaseCount();
        counter.decreaseCount();
        counter.decreaseCount();
        System.out.println("Текущее значение счетчика: " + counter.getCount() + "\n");
    }
}
