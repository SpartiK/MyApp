package lesson10.hw.ex2;

public class Drums implements Instruments {
    String size;

    public Drums(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играют барабаны с размером " + size);
    }
}
