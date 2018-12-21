package fl;

public class Tulip extends Flower {
    public Tulip(String producingCounty, int shelfLife, double cost) {
        super(producingCounty, shelfLife, cost);
    }

    @Override
    public String toString() {
        return "Тюльпан " +
                "producingCounty='" + producingCounty + '\'' +
                ", shelfLife=" + shelfLife +
                ", cost=" + cost;
    }
}
