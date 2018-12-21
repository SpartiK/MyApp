package fl;

public class Sunflower extends Flower {
    public Sunflower(String producingCounty, int shelfLife, double cost) {
        super(producingCounty, shelfLife, cost);
    }

    @Override
    public String toString() {
        return "Подсолнух " +
                "producingCounty='" + producingCounty + '\'' +
                ", shelfLife=" + shelfLife +
                ", cost=" + cost;
    }
}

