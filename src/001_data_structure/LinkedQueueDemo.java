package simple_formal_data_structure;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(42);
        queue.add(-3);
        queue.add(17);
        System.out.println(queue.remove());
    }
}
