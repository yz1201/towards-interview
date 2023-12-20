package cn.dbdj1201.interview.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: yz1201
 * @Date: 2023/12/20 9:27
 */
@Slf4j
public class T20231220 {

    static ReentrantLock lock = new ReentrantLock();
    static Condition oddCondition = lock.newCondition();
    static Condition evenCondition = lock.newCondition();
    static int len = 100;

    static Thread EvenThread = new Thread(() -> {
        for (int i = 2; i <= len; i = i + 2) {
            lock.lock();
            log.info("cur - {}", i);
            oddCondition.signal();
            try {
                if (i != 100) {
                    evenCondition.await();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    });

    static Thread OddThread = new Thread(() -> {
        for (int i = 1; i <= len; i = i + 2) {
            lock.lock();
            log.info("cur - {}", i);
            evenCondition.signal();
            try {
                if (i != 99) {
                    oddCondition.await();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    });

    public static void main(String[] args) throws InterruptedException {
        OddThread.start();
        TimeUnit.MILLISECONDS.sleep(10);
        EvenThread.start();
    }
}
