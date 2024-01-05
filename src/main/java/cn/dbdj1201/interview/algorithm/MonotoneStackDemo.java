package cn.dbdj1201.interview.algorithm;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: yz1201
 * @Date: 2024/1/4 14:29
 */
@Slf4j
public class MonotoneStackDemo {

    public static void main(String[] args) {
        int[] nums = {5, 3, 2, 1, 0};
        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(1);
        deque.push(2);
        System.out.println(deque.peek());
        System.out.println(deque.pop());
        System.out.println(deque.pop());
        for (int num : nums) {
            while (!deque.isEmpty() && num <= deque.peek()) {
                deque.pop();
            }
            deque.push(num);
        }


        System.out.println(deque.peek());
        System.out.println(deque);

    }


}
