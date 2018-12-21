package animal;

public class Horse extends Animal {
    String color;

    public Horse(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Игого");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Лошадь ест " + food);
    }

    @Override
    public String toString() {
        return "Horse";
    }

    public String getType() {
        return "Cat";
    }

}
