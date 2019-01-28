package lesson15;

import store.HeavyBox;

import javax.sql.rowset.Predicate;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<HeavyBox> consumer1 = box -> System.out.println("Отгрузили ящик с весом " + box.weight);

        Consumer<HeavyBox> consumer2 = box -> System.out.println("Отгрузили ящик с весом"+ box.weight);
        Consumer<HeavyBox> consumer3 = box -> System.out.println("Отправляем ящик с весом"+ box.weight);
        consumer2.andThen(consumer3).accept(new HeavyBox(1));

    }
}
