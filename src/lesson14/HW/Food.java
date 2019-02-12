package lesson14.HW;

public class Food {
    public void prepare(Cookable c) {
        c.cook();
    }
    public static void main(String[] args) {
        Cookable cookable = new Cookable() {
            @Override
            public void cook() {
                System.out.println("Готовлю");
            }
        };

        Food food = new Food();

        food.prepare(cookable);
    }
}

