package lesson16;

import store.HeavyBox;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        SortedSet<HeavyBox> set = new TreeSet<>();
        set.add(new HeavyBox(15));
        set.add(new HeavyBox(1));
        set.add(new HeavyBox(11));
        set.add(new HeavyBox(7));
        set.add(new HeavyBox(9));
        set.add(new HeavyBox(3));
        set.forEach(box -> System.out.println(box.weight));


        /*for (HeavyBox hb:set) {
            System.out.println(hb.weight);

        }*/
    }
}
