package lesson10.hw.ex2;

public class Guirate implements Instruments {
    int numberOfStrings;

    public Guirate(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струнн = " + numberOfStrings);
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
