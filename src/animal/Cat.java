package animal;

public class Cat extends Animal {
    String petName;

    public Cat(String food, String location, String petName) {
        super(food, location);
        this.petName = petName;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Мяу-Мяу");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Кошка ест " + food);
    }

    @Override
    public String toString() {
        return "Cat";
    }

    public String getType() {
        return "Cat";
    }
}
