package com.aggregation_and_composition.task2;

public class Car {
    private String carBrand;
    private String model;
    private String type;
    private Engine engine;
    private int productionYear;
    private int volumeTank;
    private int fuelLevel;
    private Wheel[] wheel;

    public Car() {
    }

    public Car(String carBrand, String model, String type, Engine engine, int productionYear, int volumeTank,
               int fuelLevel, Wheel[] wheel) {
        this.carBrand = carBrand;
        this.model = model;
        this.type = type;
        this.engine = engine;
        this.productionYear = productionYear;
        this.volumeTank = volumeTank;
        this.fuelLevel = fuelLevel;
        this.wheel = wheel;
    }

    public void driveCar() {
        engine.startEngine();
        System.out.println("Машина едет.");
    }

    public void refuelCar(int amountFuel) {
        if (fuelLevel == volumeTank) {
            System.out.println("Топливный бак полный, заправка не требуется.");
        } else if (amountFuel <= (volumeTank - fuelLevel)) {
            System.out.println("Заправить " + amountFuel + " л. '" + this.engine.getFuel() + "'.");
            this.fuelLevel = fuelLevel + amountFuel;
        } else if (amountFuel > (volumeTank - fuelLevel) && (volumeTank - fuelLevel) > 0) {
            System.out.println("Заправить " + (volumeTank - fuelLevel) + " л. '" + this.engine.getFuel() +
                    "' до полного бака, остаток " + (amountFuel - (volumeTank - fuelLevel)) +
                    " л. залить в канистру.");
            this.fuelLevel = volumeTank;
        } else {
            System.out.println("Бак переполнен - датчик уровня топлива неисправен.");
        }
    }

    public void printTitle() {
        System.out.println("Марка автомобиля: " + this.carBrand + " " + this.model);
    }

    public void replaceWheel(Wheel newWheel, int wheelNumber) {
        if (wheelNumber <= this.wheel.length) {
            System.out.println("Заменить колесо №" + wheelNumber + " - \"" + this.wheel[wheelNumber - 1].toString() +
                    "\" на колесо \"" + newWheel.toString() + '\"');
            for (int i = 0; i < this.wheel.length; i++) {
                this.wheel[wheelNumber - 1] = newWheel;
            }
        } else {
            System.out.println("Колесо с номером " + wheelNumber + " не существует, невозможно произвести замену.");
        }
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheel() {
        return wheel;
    }

    public void setWheel(Wheel[] wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wheel.length; i++) {
            sb.append(i + 1).append(" - ").append(wheel[i].toString()).append(", ");
        }
        return "Автомобиль: " +
                "\nмарка автомобиля: '" + carBrand + '\'' +
                "\nмодель: '" + model + '\'' +
                "\nтип кузова: '" + type + '\'' +
                "\nгод выпуска: " + productionYear + " г.в." +
                "\nобъем топливного бака: " + volumeTank + " л." +
                "\nуровень топлива в баке: " + fuelLevel + " л." +
                "\nДвигатель: " + engine.toString() +
                "\nколичество колес = " + wheel.length +
                ": " + sb.substring(0, sb.length() - 2);
    }
}
