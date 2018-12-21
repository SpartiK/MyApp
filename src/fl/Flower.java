package fl;

public class Flower {
    String producingCounty;
    int shelfLife;
    double cost;


    public Flower(String producingCounty, int shelfLife, double cost) {
        this.producingCounty = producingCounty;
        this.shelfLife = shelfLife;
        this.cost = cost;
    }

    public Flower() {
    }

    public String getProducingCounty() {
        return producingCounty;
    }

    public void setProducingCounty(String producingCounty) {
        this.producingCounty = producingCounty;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    @Override
    public String toString() {
        return "Цветок" +
                "producingCounty='" + producingCounty + '\'' +
                ", shelfLife=" + shelfLife +
                ", cost=" + cost;
    }

    public static void main(String[] args) {
        Flower rose1 = new Rose("Ukraine", 10, 45);
        Flower rose2 = new Rose("Rome", 10, 45);
        Flower tulip = new Tulip("Ukraine", 5, 30);
        Flower sunflower = new Sunflower("Ukraine", 25, 10);

        Bouquete bouquete1 = new Bouquete();
        Bouquete bouquete2 = new Bouquete();
        Bouquete bouquete3 = new Bouquete();

        bouquete1.setBouquete(rose1, rose2, tulip, sunflower);
        bouquete2.setBouquete(rose1, rose2, tulip, sunflower, rose1, tulip);
        bouquete3.setBouquete(sunflower, sunflower, sunflower, sunflower, tulip, rose1);

        bouquete1.getCostBouquete();
        bouquete2.getCostBouquete();
        bouquete3.getCostBouquete();

        System.out.println(bouquete1.toString());
        System.out.println(bouquete2.toString());
        System.out.println(bouquete3.toString());

        bouquete1.getCountBouquete();
        bouquete1.getCountFlowers();

    }


}