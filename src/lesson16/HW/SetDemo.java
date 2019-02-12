package lesson16.HW;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        set2.add(3);
        set2.add(4);

        set3.add(4);
        set3.add(6);
       System.out.println(intersect(set1,set2,set3));
        //System.out.println(union(set1,set3));
    }

    static Set<?> intersect(Set<?>... set) {
        Set result = new HashSet<>();

        for (int i = 0;i<set.length;i++){
            if (i==0){
          result = set[0];
            }
            result.retainAll(set[i]);
        }
        return result;
    }
    static Set<?> union(Set<?> ... set){
        Set result = new HashSet<>();
        for (Set s: set){
            result.addAll(s);
        }
        return result;
    }
}
