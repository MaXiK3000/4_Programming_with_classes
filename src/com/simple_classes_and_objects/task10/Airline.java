package com.simple_classes_and_objects.task10;

import java.util.Calendar;

public class Airline {
    private String destination;
    private int flightNumber;
    private String aircraftType;
    private Calendar departureTime;
    private String[] daysOfTheWeek;

    public Airline() {
    }

    public Airline(String destination, int flightNumber, String aircraftType, Calendar departureTime, String[] daysOfTheWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.daysOfTheWeek = daysOfTheWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public Calendar getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Calendar departureTime) {
        this.departureTime = departureTime;
    }

    public String[] getDaysOfTheWeek() {
        return daysOfTheWeek;
    }

    public void setDaysOfTheWeek(String[] daysOfTheWeek) {
        this.daysOfTheWeek = daysOfTheWeek;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Авиалиния: " +
                "пункт назначения - " + destination +
                ", номер рейса - " + flightNumber +
                ", тип самолета - " + aircraftType +
                ", время вылета - " + departureTime.get(Calendar.HOUR_OF_DAY) + ":" + departureTime.get(Calendar.MINUTE) +
                ", дни недели - [");
        for (int i = 0; i < daysOfTheWeek.length; i++) {
            if (i == (daysOfTheWeek.length - 1)) result.append(daysOfTheWeek[i]).append("].\n");
            else result.append(daysOfTheWeek[i]).append(", ");

        }
        return result.toString();
    }
}
