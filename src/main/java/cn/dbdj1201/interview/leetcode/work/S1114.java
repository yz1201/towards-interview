package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: yz1201
 * @Date: 2024/3/26 9:50
 */
@Slf4j
public class S1114 {
    private final CountDownLatch firstDone;
    private final CountDownLatch secondDone;

    public S1114() {
        firstDone = new CountDownLatch(1);
        secondDone = new CountDownLatch(1);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        firstDone.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        firstDone.await();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        secondDone.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        secondDone.await();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("11111");
        System.out.println(sb);
        sb.deleteCharAt(sb.indexOf("1"));
        System.out.println(sb);
//        sb.deleteCharAt(sb.indexOf("2"));
//        System.out.println(sb);

        String s = "1234556";
        System.out.println(s.contains("1、2、3"));
    }
}
