package com.simple_classes_and_objects.task6;

public class Time {
    private int hours, minutes, seconds;

    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Time(int hours, int minutes, int seconds) {
        if (hours < 0) this.hours = 0;
        else this.hours = hours;
        if (minutes >= 60 || minutes < 0) this.minutes = 0;
        else this.minutes = minutes;
        if (seconds >= 60 || seconds < 0) this.seconds = 0;
        else this.seconds = seconds;
    }

    private void check() {
        while (seconds >= 60) {
            seconds -= 60;
            minutes++;
        }
        while (minutes >= 60) {
            minutes -= 60;
            hours++;
        }
    }

    public void setTime(int hours, int minutes, int seconds) {
        this.seconds += seconds;
        this.minutes += minutes;
        check();
        this.hours += hours;
    }

    @Override
    public String toString() {
        return "Время: " + hours + "ч:" + minutes + "м:" + seconds + "с";
    }
}
