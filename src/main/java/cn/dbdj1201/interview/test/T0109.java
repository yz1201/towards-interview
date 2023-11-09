package cn.dbdj1201.interview.test;

import cn.dbdj1201.interview.leetcode.work.simple.Q0109;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author: yz1201
 * @Date: 2022/9/30 15:23
 */
@Slf4j
public class T0109 {

    public static void main(String[] args) {

        Q0109 q0109 = new Q0109();

//        System.out.println(q0109.isFlipedStringV1("abc", "cab"));

        List<Integer> testArr = new CopyOnWriteArrayList<>();
        List<Integer> testArr1 = new CopyOnWriteArrayList<>();

        testArr.add(10);
        testArr.add(100);
        testArr.add(1000);
        testArr.add(1000);
        testArr.add(100000);

        int times = 5;
        for (int i = 0; i < times; i++) {
            testArr1.add(i + 20);
        }
        System.out.println(testArr);
        System.out.println(testArr.removeAll(testArr1));
        System.out.println(testArr);

    }
}
