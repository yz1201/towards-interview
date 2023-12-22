package cn.dbdj1201.interview.thread;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: yz1201
 * @Date: 2023/12/20 14:44
 */
@Slf4j
public class AlternatePrintTest2 {
    public static void main(String[] args) throws InterruptedException {
        AwaitSignal awaitSignal = new AwaitSignal(20000);
        Condition a_condition = awaitSignal.newCondition();
        Condition b_condition = awaitSignal.newCondition();
        Condition c_condition = awaitSignal.newCondition();
        new Thread(() -> awaitSignal.printV1("a", a_condition, b_condition), "Thread-a").start();
        new Thread(() -> awaitSignal.printV1("b", b_condition, c_condition), "Thread-b").start();
        new Thread(() -> awaitSignal.printV1("c", c_condition, a_condition), "Thread-c").start();
        System.out.println("开始...");
        Thread.sleep(10);
        awaitSignal.lock();
        try {
            a_condition.signal();  // 首先唤醒a线程
        } finally {
            awaitSignal.unlock();
//            log.info("counter : {}", awaitSignal.getCounter());
        }
    }
}

@Slf4j
@Data
class AwaitSignal extends ReentrantLock {
    private final int loopNumber;
    private int counter = 0;

    public AwaitSignal(int loopNumber) {
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
        try {
            lock();
            for (int i = 0; i < loopNumber; i++) {
                try {
                    current.await();
                    System.out.print(str);
//                    log.info("str - " + str);
                    counter++;
                    // 唤醒下一间休息室
                    next.signal();
                    log.info("counter : {}", this.getCounter());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            unlock();
        }
    }


    /**
     * print
     *
     * @param str     打印的内容
     * @param current 进入那间休息室
     * @param next    下一间休息室
     */
    public void printV1(String str, Condition current, Condition next) {
        for (int i = 0; i < loopNumber; i++) {
            lock();
            try {
                try {
                    current.await();
                    System.out.print(str);
//                    log.info("str - " + str);
                    counter++;
                    // 唤醒下一间休息室
                    next.signal();
                    log.info("counter : {}", this.getCounter());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } finally {
                unlock();
            }
        }
    }

}
