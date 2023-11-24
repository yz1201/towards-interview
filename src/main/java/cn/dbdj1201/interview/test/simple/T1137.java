package cn.dbdj1201.interview.test.simple;

import cn.dbdj1201.interview.leetcode.work.simple.S1137;
import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author: yz1201
 * @Date: 2023/11/23 15:05
 */
@Slf4j
public class T1137 {

    public static void main(String[] args) {
        S1137 s1137 = new S1137();
        log.info("res - {}", s1137.tribonacciCopy(5));

        PriorityQueue<Integer> deque = new PriorityQueue<>((a, b) -> b - a);
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        deque.offer(4);
        System.out.println(deque);

    }
}
