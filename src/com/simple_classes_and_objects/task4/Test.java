package com.simple_classes_and_objects.task4;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Train> trains = Arrays.asList(
                new Train("Витебск", 4, new GregorianCalendar(2023, Calendar.JULY, 20, 13, 35)),
                new Train("Гродно", 1, new GregorianCalendar(2023, Calendar.JUNE, 2, 14, 12)),
                new Train("Минск", 3, new GregorianCalendar(2023, Calendar.AUGUST, 20, 1, 10)),
                new Train("Могилёв", 5, new GregorianCalendar(2023, Calendar.JUNE, 13, 10, 15)),
                new Train("Минск", 2, new GregorianCalendar(2023, Calendar.JULY, 23, 19, 50)));
        System.out.println("Отсортированный список поездов по номеру:");
        trains.stream()
                .sorted(Comparator.comparing(Train::getTrainNumber))
                .forEach(System.out::println);
        System.out.print("\nВведите номер поезда о котором вы хотите узнать информацию: ");
        int trainNumber = in.nextInt(), index = -1;
        for (int i = 0; i < trains.size(); i++) {
            if (trains.get(i).getTrainNumber() == trainNumber) index = i;
        }
        if (index == -1) {
            System.out.println("Поезд с таким номером не был найден");
        } else {
            System.out.println(trains.get(index));
        }
        System.out.println("\nОтсортированный список поездов по пункту назначения/время прибытия:");
        trains.stream()
                .sorted(Comparator.comparing(Train::getDestinationName)
                        .thenComparing(Train::getDepartureTime))
                .forEach(System.out::println);
    }
}
