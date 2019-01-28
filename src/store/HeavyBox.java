package store;

public class HeavyBox extends Box {
    public HeavyBox(int weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                "} " + super.toString();
    }
}
