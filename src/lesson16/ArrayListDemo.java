package lesson16;

import store.HeavyBox;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<HeavyBox> list = new ArrayList<>();
        list.add(new HeavyBox(1));
        list.add(new HeavyBox(2));
        list.add(new HeavyBox(3));
        list.add(new HeavyBox(4));
        System.out.println(list);
        for (HeavyBox hb:list
             ) {
            System.out.println(hb);

        }
        HeavyBox box2 = list.get(0);
        box2.weight+=1;
        for (HeavyBox hb:list
        ) {
            System.out.println(hb);

        }
        list.remove(list.size()-1);
        System.out.println("Size " + list.size());
        list.clear();
        System.out.println(list);
    }


}
