package code.okt19.A8_javacollection;

import org.junit.jupiter.api.Test;

import java.util.*;

public class QueueTest {
    @Test
    void testQueue() {
        Queue<String> stringQueue = new ArrayDeque<>();
        stringQueue.offer("Dias");
        stringQueue.offer("Nur");
        stringQueue.offer("Ramadhan");
        stringQueue.offer("Code");
        stringQueue.offer("Okt 19");

        for (String next = stringQueue.poll(); next != null; next = stringQueue.poll()){
            System.out.println(next);
        }

        System.out.println(stringQueue.size());
    }

    @Test
    void testDeque() {
        Deque<String> stack = new LinkedList<>();
        stack.offerLast("Dias");
        stack.offerLast("Nur");
        stack.offerLast("Ramadhan");
        stack.offerLast("Code");
        stack.offerLast("Okt19");

        for (String value : stack) {
            System.out.println(value);
        }
        System.out.println("===== TUMPUKAN ======");
        for (var next = stack.pollLast(); next != null; next = stack.pollLast()){
            System.out.println(next);
        }

    }
}
