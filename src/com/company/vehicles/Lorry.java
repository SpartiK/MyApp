package com.company.vehicles;

import com.company.deteils.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    int carrying;

    public Lorry(String carBrand, String carClass, int weight, Engine engine, Driver driver, int carrying) {
        super(carBrand, carClass, weight, engine, driver);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }
}
