package com.simple_classes_and_objects.task8;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        CustomerArray customers = new CustomerArray(Arrays.asList(
                new Customer(idGenerator(), "Логвинов", "Павел", "Николаевич", "пр-т Строителей 10", creditCardNumberGenerator(), bankAccountNumberGenerator()),
                new Customer(idGenerator(), "Куплинов", "Дмитрий", "Андреевич", "ул. Правды 15-3", creditCardNumberGenerator(), bankAccountNumberGenerator()),
                new Customer(idGenerator(), "Мокано", "Марин", "Алексеевич", "ул. Фрунзе 111", creditCardNumberGenerator(), bankAccountNumberGenerator()),
                new Customer(idGenerator(), "Агапитов", "Максим", "Николаевич", "ул. Смоленское 50", creditCardNumberGenerator(), bankAccountNumberGenerator())));
        System.out.println("Список: \n" + customers);
        System.out.println("Сортировка по алфавиту: \n" + customers.sortAlphabetically());
        System.out.print("Сортировка по номеру карты в заданном диапозоне: \n" + customers.sortCreditCardNumberInRange(5000000000000000L, 8000000000000000L));
    }

    private static long idGenerator() {
        return (long) (Math.random() * 1000);
    }

    private static long creditCardNumberGenerator() {
        return (long) (Math.random() * 9999999999999999L);
    }

    private static long bankAccountNumberGenerator() {
        return (long) (Math.random() * 999999);
    }
}

