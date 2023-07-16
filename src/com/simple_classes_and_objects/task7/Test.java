package com.simple_classes_and_objects.task7;

public class Test {

    public static void main(String[] args) {
        Triangle triangle = new Triangle().createTriangle();
        System.out.println(triangle);
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());
        System.out.println("Площадь треугольника: " + triangle.getSquare());
        System.out.print("Точки пересечения меридиан: x = " + triangle.getCoordinatePointMeridian()[0] + ", y = " + triangle.getCoordinatePointMeridian()[1]);
    }
}
