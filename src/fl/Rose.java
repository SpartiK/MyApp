package fl;

public class Rose extends Flower {

    public Rose() {
    }

    public Rose(String producingCounty, int shelfLife, double cost) {
        super(producingCounty, shelfLife, cost);
    }

    @Override
    public String toString() {
        return "Роза" +
                " producingCounty='" + producingCounty + '\'' +
                ", shelfLife=" + shelfLife +
                ", cost=" + cost;
    }
}
