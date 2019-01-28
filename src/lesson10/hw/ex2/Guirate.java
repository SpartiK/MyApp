package lesson10.hw.ex2;

import java.util.Objects;

public class Guirate implements Instruments {
    int numberOfStrings;

    public Guirate(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струнн = " + numberOfStrings);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guirate guirate = (Guirate) o;
        return numberOfStrings == guirate.numberOfStrings;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfStrings);
    }

    public static void main(String[] args) {
        Instruments [] instruments = new Instruments[3];
        instruments [0] = new Guirate(6);
        instruments [1] = new Drums("Big");
        instruments [2] = new Trumpet(10);
        for (Instruments a:instruments) {
            a.play();

        }

    }
}
