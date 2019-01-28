package store;

public class Box {
    public int weight;

    public Box(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Box{" +
                "weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        HeavyBox heavyBox = new HeavyBox(22);
        Box box = new Box(22);
    }
}
