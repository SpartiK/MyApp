package lesson16;

import store.HeavyBox;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<HeavyBox> list = new ArrayList<>();

        list.add(new HeavyBox(400));
        list.add(new HeavyBox(600));
        list.add(new HeavyBox(200));
        list.add(new HeavyBox(100));
        list.add(new HeavyBox(700));
        List<HeavyBox> heavyBoxes = findHeavyBoxes(list);
        System.out.println(list);
        System.out.println(heavyBoxes);
    }

    private static List<HeavyBox> findHeavyBoxes(List<HeavyBox>list){
        List<HeavyBox> result = new ArrayList<>();
        Iterator<HeavyBox> iterator = list.iterator();
        while(iterator.hasNext()){
            HeavyBox box = iterator.next();
            if( box.weight>300){
                iterator.remove();
                result.add(box);
            }
        }
        return result;
    }
}
