package lesson10.hw.ex2;

import java.util.Objects;

public class Trumpet implements Instruments {
    double diametr;

    public Trumpet(double diametr) {
        this.diametr = diametr;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    @Override
    public void play() {
        System.out.println("Играют труба с диаметром " + diametr);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trumpet trumpet = (Trumpet) o;
        return Double.compare(trumpet.diametr, diametr) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diametr);
    }
}
