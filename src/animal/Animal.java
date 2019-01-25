package animal;

public class Animal {
     String food, location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {

    }

    public void eat() {

    }

    public void sleap(Animal animal) {
        System.out.println(animal + " Спит");


    }
}
