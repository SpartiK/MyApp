package com.company.professions;

import lesson7.Person;

public class Driver extends Person {
    int driverAge;

    public Driver(String fullName, int age, int driverAge) {
        super(fullName, age);
        this.driverAge = driverAge;
    }


    public int getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(int driverAge) {
        this.driverAge = driverAge;
    }

    @Override
    public String toString() {
        return super.toString() +
                " со стажем вождения " + driverAge + " лет";
    }
}
