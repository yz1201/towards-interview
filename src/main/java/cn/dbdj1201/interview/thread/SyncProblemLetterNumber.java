package cn.dbdj1201.interview.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: yz1201
 * @Date: 2022/1/11 8:39
 */
public class SyncProblemLetterNumber {

    static int len = 26;
    static ReentrantLock lock = new ReentrantLock();
    static Condition letterCon = lock.newCondition();
    static Condition numberCon = lock.newCondition();
    static Thread letter = new Thread(() -> {
        for (int i = 0; i < len; i++) {
            try {
                lock.lock();
                System.out.print((char) ('A' + i));
                numberCon.signal();
                if (i != 25) {
                    letterCon.await();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    });

    static Thread number = new Thread(() -> {
        for (int i = 1; i <= len; i++) {
            try {
                lock.lock();
                System.out.print(i);
                letterCon.signal();
                if (i != 26) {
                    numberCon.await();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    });

    public static void main(String[] args) throws InterruptedException {
        letter.start();
        TimeUnit.MILLISECONDS.sleep(100);
        number.start();
    }
}
