package lesson10.hw.ex2;

import java.util.Objects;

public class Drums implements Instruments {
    String size;

    public Drums(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играют барабаны с размером " + size);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drums drums = (Drums) o;
        return Objects.equals(size, drums.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }
}
