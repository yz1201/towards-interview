package cn.dbdj1201.interview.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayDeque;

/**
 * @Author: yz1201
 * @Date: 2022/7/25 16:03
 */
@Slf4j
public class TestMain2022072501 {

    public static void main(String[] args) {

        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.offer("1");
        deque.offer("2");
        deque.offer("3");
        deque.offer("4");
        deque.addFirst("5");
        System.out.println(deque);
        System.out.println(deque.poll());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
//        System.out.println(deque.poll());
//        System.out.println(deque.poll());
    }
}
