package animal;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {
    String favoriteToy;

    public Dog(String food, String location) {
        super(food, location);
    }

    public Dog(String food, String location, String favoriteToy) {
        super(food, location);
        this.favoriteToy = favoriteToy;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Гав-Гав");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Собакак ест " + food);
    }

    @Override
    public String toString() {
        return "Dog";
    }

    public String getType() {
        return "Dog";
    }

}
