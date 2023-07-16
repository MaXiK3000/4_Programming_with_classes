package com.simple_classes_and_objects.task5;

public class Counter {
    int count, begin, end;

    public Counter() {
        this.begin = 0;
        this.end = 0;
        this.count = 0;
    }

    public Counter(int begin, int end) {
        this.begin = begin;
        this.end = end;
        this.count = (int) (Math.random() * ((end - begin) + 1)) + begin;
    }

    public Counter(int begin, int end, int count) {
        this.begin = begin;
        this.end = end;
        this.count = count;
    }

    public void increaseCount() {
        if (count >= begin && count < end) count++;
    }

    public void decreaseCount() {
        if (count > begin && count <= end) count--;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Начало диапозона счетчика: " + begin
                + "\nКонец диапозона счетчика: " + end
                + "\nТекущее значение счетчика: " + count + "\n";
    }
}
