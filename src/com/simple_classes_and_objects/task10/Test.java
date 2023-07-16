package com.simple_classes_and_objects.task10;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test {

    public static void main(String[] args) {
        AirlineArray airlines = new AirlineArray(Arrays.asList(
                new Airline("Витебск", flightNumberGenerator(), "транспортный", timeGenerator(), new String[]{"суббота", "воскресенье"}),
                new Airline("Гродно", flightNumberGenerator(), "для пассажиров", timeGenerator(), new String[]{"понедельник", "вторник", "среда"}),
                new Airline("Витебск", flightNumberGenerator(), "сельскохозяйственных нужд", timeGenerator(), new String[]{"среда", "четверг"})));
        System.out.println("Список: \n" + airlines);
        String destination = "Витебск";
        System.out.println("Список рейсов с пунктом назначения " + destination + ": \n" + airlines.getAirlinesByDestination(destination));
        String dayOfTheWeek = "среда";
        System.out.println("Список рейсов с вылетом в " + dayOfTheWeek + ": \n" + airlines.getAirlinesByDayOfTheWeek(dayOfTheWeek));
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.HOUR_OF_DAY, 4);
        calendar.set(Calendar.MINUTE, 20);
        System.out.println("Список рейсов с вылетом в " + dayOfTheWeek + " и позже "
                + calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE)
                + ": \n" + airlines.getAirlinesByDayOfTheWeekAndDepartureTime(dayOfTheWeek, calendar));
    }

    private static int flightNumberGenerator() {
        return (int) (Math.random() * 100);
    }

    private static Calendar timeGenerator() {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.HOUR_OF_DAY, (int) (Math.random() * 11));
        calendar.set(Calendar.MINUTE, (int) (Math.random() * 59));
        return calendar;
    }
}
