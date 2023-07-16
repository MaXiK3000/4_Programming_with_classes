package com.simple_classes_and_objects.task4;

import java.util.Calendar;

public class Train {
    private String destinationName;
    private int trainNumber;
    private Calendar departureTime;

    public Train() {
    }

    public Train(String destinationName, int trainNumber, Calendar departureTime) {
        this.destinationName = destinationName;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }



    @Override
    public String toString() {
        return "Пункт назначения: " + destinationName +
                "; Номер поезда: " + trainNumber +
                "; Время отправления: " + departureTime.getTime();
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public Calendar getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Calendar departureTime) {
        this.departureTime = departureTime;
    }
}
