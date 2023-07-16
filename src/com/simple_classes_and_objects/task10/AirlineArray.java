package com.simple_classes_and_objects.task10;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class AirlineArray {
    private List<Airline> airlines;

    public AirlineArray() {
    }

    public AirlineArray(List<Airline> airlines) {
        this.airlines = airlines;
    }

    public List<Airline> getAirlinesByDestination(String destination) {
        List<Airline> airlines = new ArrayList<>();
        for (Airline airline : this.airlines) {
            if (airline.getDestination().equalsIgnoreCase(destination)) {
                airlines.add(airline);
            }
        }
        return airlines;
    }

    public List<Airline> getAirlinesByDayOfTheWeek(String dayOfTheWeek) {
        List<Airline> airlines = new ArrayList<>();
        for (Airline airline : this.airlines) {
            for (int i = 0; i < airline.getDaysOfTheWeek().length; i++) {
                if (airline.getDaysOfTheWeek()[i].equalsIgnoreCase(dayOfTheWeek)) {
                    airlines.add(airline);
                }
            }
        }
        return airlines;
    }

    public List<Airline> getAirlinesByDayOfTheWeekAndDepartureTime(String dayOfTheWeek, Calendar departureTime) {
        AirlineArray airlineArray = new AirlineArray(this.airlines);
        List<Airline> airlines = airlineArray.getAirlinesByDayOfTheWeek(dayOfTheWeek);
        List<Airline> result = new ArrayList<>();
        for (Airline airline : airlines) {
            if (airline.getDepartureTime().get(Calendar.HOUR_OF_DAY) > departureTime.get(Calendar.HOUR_OF_DAY)) {
                result.add(airline);
            } else if (airline.getDepartureTime().get(Calendar.HOUR_OF_DAY) == departureTime.get(Calendar.HOUR_OF_DAY)) {
                if (airline.getDepartureTime().get(Calendar.MINUTE) > departureTime.get(Calendar.MINUTE)) {
                    result.add(airline);
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return airlines + "";
    }
}
