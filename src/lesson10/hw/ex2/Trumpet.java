package lesson10.hw.ex2;

public class Trumpet implements Instruments {
    double diametr;

    public Trumpet(double diametr) {
        this.diametr = diametr;
    }

    @Override
    public void play() {
        System.out.println("Играют труба с диаметром " + diametr);
    }
}
