package lesson10;

import java.util.Objects;

public class Magazine implements Printable {
String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public void print() {
        System.out.println("Print magazine"+getName());

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(name, magazine.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void printMagazines(Printable[] printables){
        for (Printable printable:printables) {
            if (printable instanceof Magazine) {
                System.out.println(((Magazine) printable).getName());
            }
        }
    }
}
