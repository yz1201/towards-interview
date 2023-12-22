package cn.dbdj1201.interview.test.examples;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @Author: yz1201
 * @Date: 2023/12/22 10:55
 */
public class SemaphoreExample1 {
    private static int counter = 0;
    private static final Semaphore semaphore = new Semaphore(3); // 控制同时访问计数器的线程数量
    private static final Object lock = new Object(); // 用于同步块的锁对象

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            try {
                semaphore.acquire(); // 获取许可证
                System.out.println("Thread 1 acquired the semaphore.");
                synchronized (lock) { // 同步块，确保对计数器的操作是原子的
                    TimeUnit.SECONDS.sleep(3);
                    counter++;
                }
                System.out.println("Counter value: " + counter);
                semaphore.release(); // 释放许可证
                System.out.println("Thread 1 released the semaphore.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                semaphore.acquire(); // 获取许可证
                System.out.println("Thread 2 acquired the semaphore.");
                synchronized (lock) { // 同步块，确保对计数器的操作是原子的
                    TimeUnit.SECONDS.sleep(3);
                    counter++;
                }
                System.out.println("Counter value: " + counter);
                semaphore.release(); // 释放许可证
                System.out.println("Thread 2 released the semaphore.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread3 = new Thread(() -> {
            try {
                semaphore.acquire(); // 获取许可证
                System.out.println("Thread 3 acquired the semaphore.");
                synchronized (lock) { // 同步块，确保对计数器的操作是原子的
                    TimeUnit.SECONDS.sleep(3);
                    counter++;
                }
                System.out.println("Counter value: " + counter);
                semaphore.release(); // 释放许可证
                System.out.println("Thread 3 released the semaphore.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // 启动线程
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
