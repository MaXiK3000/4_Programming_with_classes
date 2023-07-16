package com.simple_classes_and_objects.task7;

import java.util.Arrays;

public class Triangle {
    private int line1, line2, line3;

    public Triangle() {
    }

    public Triangle(int line1, int line2, int line3) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        if (!check()) {
            System.out.print("Треугольник построен неверно");
            System.exit(1);
        }
    }

    private boolean check() {
        return (line1 + line2) > line3 && (line1 + line3) > line2 && (line2 + line3) > line1;
    }

    public Triangle createTriangle() {
        boolean result = true;
        int[] tempSideArray = new int[3];
        while (result) {
            int tempSideA = (int) (Math.random() * 100) + 1;
            int tempSideB = (int) (Math.random() * 100) + 1;
            int tempSideC = (int) (Math.random() * 100) + 1;
            if ((tempSideA + tempSideB) > tempSideC && (tempSideA + tempSideC) > tempSideB && (tempSideB + tempSideC) > tempSideA) {
                tempSideArray = new int[]{tempSideA, tempSideB, tempSideC};
                result = false;
            }
        }
        return new Triangle(tempSideArray[2], tempSideArray[1], tempSideArray[0]);
    }

    public double getSquare() {
        double halfPerimeter = (double) getPerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - line1) * (halfPerimeter - line2) * (halfPerimeter - line3));
    }

    public int getPerimeter() {
        return line1 + line2 + line3;
    }

    public double[] getCoordinatePointMeridian() {
        double medianA = Math.sqrt((2 * Math.pow(line2, 2)) + (2 * Math.pow(line3, 2)) - Math.pow(line1, 2)) / 2;
        double medianB = Math.sqrt((2 * Math.pow(line1, 2)) + (2 * Math.pow(line3, 2)) - Math.pow(line2, 2)) / 2;
        double halfPerimeter = ((2 * medianB / 3) + (medianA / 3) + ((double) line1 / 2)) / 2;
        double coordinateY = 2 * Math.sqrt(halfPerimeter * (halfPerimeter - (2 * medianB / 3)) * (halfPerimeter - (medianA / 3)) + (halfPerimeter - (double) line1 / 2)) /
                ((double) line1 / 2);
        double coordinateX = Math.sqrt((2 * Math.pow(medianB, 2) / 3) - Math.pow(coordinateY, 2));
        return new double[]{coordinateX, coordinateY};
    }

    @Override
    public String toString() {
        return "Стороны треугольника: " + line1 + ", " + line2 + ", " + line3;
    }
}
