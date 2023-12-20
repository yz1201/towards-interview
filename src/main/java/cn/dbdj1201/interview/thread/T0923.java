package cn.dbdj1201.interview.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @Author: yz1201
 * @Date: 2023/12/19 15:10
 */
@Slf4j
public class T0923 {

    static final Object lock = new Object();

    static int len = 100;

    static Thread EvenThread = new Thread(() -> {
        synchronized (lock){
            for (int i = 2; i <= len; i = i + 2) {
//                System.out.print(i);
                log.info("cur - {}", i);
                lock.notifyAll();
                try {
                    if (i != 100){
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    });

    static Thread OddThread = new Thread(() -> {
        synchronized (lock){
            for (int i = 1; i <= len; i = i + 2) {
//                System.out.print(i);
                log.info("cur - {}", i);
                lock.notifyAll();
                try {
                    if (i != 99){
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    });

    public static void main(String[] args) throws InterruptedException {
//        log.info("game start!");
//        Semaphore semaphore = new Semaphore(2);
//        Thread thread1 = new Thread(() -> {
//
//            log.info("");
//        });
        OddThread.start();
        TimeUnit.MILLISECONDS.sleep(10);
        EvenThread.start();

    }


}
