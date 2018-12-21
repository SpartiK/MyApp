package com.company.vehicles;

import com.company.deteils.Engine;
import com.company.professions.Driver;
import lesson7.Person;

public class Car {
    String carBrand, carClass;
    int weight;
    Engine engine;
    Driver driver;

    public Car(String carBrand, String carClass, int weight, Engine engine, Driver driver) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
        this.driver = driver;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    @Override
    public String toString() {
        return "Машина '" +
                carBrand + '\'' +
                ", Тип = '" + carClass + '\'' +
                ", Вес = " + weight +
                ", Двигатель = " + engine +
                ", Водитель = " + driver;
    }

    public static void main(String[] args) {
        Engine engine = new Engine(100, "Mazda");
        Driver driver = new Driver("Nikita", 21, 3);
        Car car = new Car("Mazda", "Sedan", 1420, engine, driver);
        System.out.println(car.toString());
    }
}
