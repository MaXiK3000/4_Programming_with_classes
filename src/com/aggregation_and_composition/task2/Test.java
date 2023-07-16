package com.aggregation_and_composition.task2;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Car car = new Car("Renault", "Vel Satis", "hatchback", engine, 2002, 85, 60, wheels);
        car.printTitle();
        car.driveCar();
        car.refuelCar(10);
        car.replaceWheel(newWheel, 2);
        System.out.println('\n' + car.toString());
    }

    private static Wheel[] createArrWheels(Wheel wheel) {
        Wheel[] wheelsArr = new Wheel[4];
        Arrays.fill(wheelsArr, wheel);
        return wheelsArr;
    }

    private static final Wheel[] wheels = createArrWheels(new Wheel(255, 55, 'R', 17, "winter"));
    private static final Engine engine = new Engine(2200, "ДТ", 9.1, 150);
    private static final Wheel newWheel = new Wheel(265, 45, 'R', 17, "winter");

}
