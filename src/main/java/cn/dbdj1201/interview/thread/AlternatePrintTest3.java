package cn.dbdj1201.interview.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: yz1201
 * @Date: 2023/12/20 14:44
 */
public class AlternatePrintTest3 {
    public static void main(String[] args) throws InterruptedException {
        AwaitSignalV1 awaitSignalV1 = new AwaitSignalV1(200);
        Condition a_condition = awaitSignalV1.newCondition();
        Condition b_condition = awaitSignalV1.newCondition();
        Condition c_condition = awaitSignalV1.newCondition();
        new Thread(() -> awaitSignalV1.print("a", a_condition, b_condition), "Thread-a").start();
        new Thread(() -> awaitSignalV1.print("b", b_condition, c_condition), "Thread-b").start();
        new Thread(() -> awaitSignalV1.print("c", c_condition, a_condition), "Thread-c").start();
        System.out.println("开始...");
        Thread.sleep(10);
        awaitSignalV1.lock();
        try {
            a_condition.signal();  // 首先唤醒a线程
        } finally {
            awaitSignalV1.unlock();
        }
    }
}

class AwaitSignalV1 extends ReentrantLock {
    private final int loopNumber;
    private int counter = 0;

    public AwaitSignalV1(int loopNumber) {
        this.loopNumber = loopNumber;
    }

    /**
     * print
     *
     * @param str     打印的内容
     * @param current 进入那间休息室
     * @param next    下一间休息室
     */
    public void print(String str, Condition current, Condition next) {
        for (int i = 0; i < loopNumber; i++) {
            lock();
            try {
                try {
                    current.await();
                    System.out.print(Thread.currentThread().getName() + "- " + str + " - ");
                    counter++;
                    // 唤醒下一间休息室
                    next.signalAll();
                    System.out.println(counter);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } finally {
                unlock();
            }
        }
    }
}
