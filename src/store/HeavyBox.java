package store;

public class HeavyBox extends Box implements Comparable<HeavyBox> {
    public HeavyBox(int weight) {
        super(weight);
    }


    @Override
    public int compareTo(HeavyBox o) {
        return this.weight - o.weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                "} " + super.toString();
    }
}
