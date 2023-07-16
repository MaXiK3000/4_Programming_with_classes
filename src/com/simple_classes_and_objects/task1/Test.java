package com.simple_classes_and_objects.task1;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Test1 t1 = new Test1();
        System.out.print("Введите первую переменную: ");
        t1.setA(in.nextInt());
        System.out.print("Введите вторую переменную: ");
        t1.setB(in.nextInt());
        t1.print();
        System.out.println("Сумма двух переменных: " + t1.sum());
        System.out.print("Максимальная переменная: " + t1.max());
    }
}
