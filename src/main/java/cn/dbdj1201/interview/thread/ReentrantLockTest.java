package cn.dbdj1201.interview.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: yz1201
 * @Date: 2022/1/6 21:45
 */
public class ReentrantLockTest extends Thread {

    private static final ReentrantLock lock = new ReentrantLock(false);

    @Override
    public void run() {
        int len = 10;
        for (int i = 0; i < len; i++) {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " achieve lock " + i);
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        ReentrantLockTest test = new ReentrantLockTest();
        new Thread(test).start();
        new Thread(test).start();
    }
}
