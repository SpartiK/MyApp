package lesson16;

import lesson14.User;
import store.HeavyBox;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DequeDemo {
    public static void main(String[] args) {
        Queue<HeavyBox> queue = new ArrayDeque<>();
        queue.offer(new HeavyBox(5));
        queue.offer(new HeavyBox(2));
        queue.offer(new HeavyBox(11));
        queue.offer(new HeavyBox(8));

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
