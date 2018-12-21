package com.company.vehicles;

import com.company.deteils.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    double speed;

    public SportCar(String carBrand, String carClass, int weight, Engine engine, Driver driver, double speed) {
        super(carBrand, carClass, weight, engine, driver);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }


}
