package com.simple_classes_and_objects.task2;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Test2 t2 = new Test2();
        int a, b;
        System.out.println("Пременные по умолчанию: a = " + t2.getA() + "; b = " + t2.getB());
        System.out.print("Введите первую переменную: ");
        a = in.nextInt();
        System.out.print("Введите вторую переменную: ");
        b = in.nextInt();
        t2 = new Test2(a, b);
        System.out.print("Заданные переменные: a = " + t2.getA() + "; b = " + t2.getB());
    }
}
