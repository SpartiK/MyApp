package lesson16;

import java.sql.SQLOutput;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Toy> map = new TreeMap<>(Collections.reverseOrder());
        map.put("Кукла",new Toy("Кукла",45));
        map.put("Кубик",new Toy("Кубик",67));
        map.put("Машинка",new Toy("Машинка",23));
        map.put("Конструктор",new Toy("Конструктор",89));

        printKeys(map);
        printValues(map);
        printEntries(map);

    }

    private static void printEntries(Map<String, Toy> map) {
        Set<Map.Entry<String,Toy>> entrySet = map.entrySet();
        for (Map.Entry<String,Toy> entry: entrySet){
            System.out.println("Key "+ entry.getKey());
            System.out.println("Value"+ entry.getValue());
        }
    }

    private static void printValues(Map<String, Toy> map) {
        Collection<Toy> values = map.values();
        System.out.println(values);
}

    private static void printKeys(Map<String, Toy> map) {
        Set<String> keys = map.keySet();
        System.out.println(keys);
    }
}
