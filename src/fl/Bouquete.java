package fl;

import java.util.Arrays;

public class Bouquete {
    private Flower[] flowers;
    private static int countBouquete;
    private static int countFlowers = 0;

    public Bouquete(Flower[] flowers) {
        this.flowers = flowers;
    }

    public Bouquete() {

    }

    public void getCountBouquete() {
        System.out.println("Количество проданных букетов - " + countBouquete);
    }

    public void getCountFlowers() {
        System.out.println("Количество проданных цветков" + countFlowers);
    }

    public void setBouquete(Flower... arr) {
        countBouquete++;
        countFlowers += arr.length;
        this.flowers = new Flower[arr.length];
        /*for (int i = 0; i < arr.length; i++) {
            flowers[i] = arr[i];

        }*/
        System.arraycopy(arr, 0, flowers, 0, arr.length);

    }

    public void getCostBouquete() {
        double sum = 0;
        for (Flower flower : flowers) {
            sum += flower.cost;

        }
        System.out.println("Цена букета=" + sum);

    }

    @Override
    public String toString() {
        return "Букет из " + flowers.length +
                " цветов " + Arrays.toString(flowers);
    }
}
