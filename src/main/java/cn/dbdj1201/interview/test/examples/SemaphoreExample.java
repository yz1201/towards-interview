package cn.dbdj1201.interview.test.examples;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Semaphore;

/**
 * @Author: yz1201
 * @Date: 2023/12/22 10:46
 */
@Slf4j
public class SemaphoreExample {

    public static void main(String[] args) {
        // 创建一个拥有3个许可证的Semaphore对象
        Semaphore semaphore = new Semaphore(3);

        // 创建3个线程，每个线程都会尝试获取一个许可证
        Thread thread1 = new Thread(() -> {
            try {
                semaphore.acquire(); // 获取一个许可证
                System.out.println("Thread 1 acquired the semaphore.");
                Thread.sleep(1000); // 模拟执行任务
                semaphore.release(); // 释放一个许可证
                System.out.println("Thread 1 released the semaphore.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                semaphore.acquire(); // 获取一个许可证
                System.out.println("Thread 2 acquired the semaphore.");
                Thread.sleep(1000); // 模拟执行任务
                semaphore.release(); // 释放一个许可证
                System.out.println("Thread 2 released the semaphore.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread3 = new Thread(() -> {
            try {
                semaphore.acquire(); // 获取一个许可证
                System.out.println("Thread 3 acquired the semaphore.");
                Thread.sleep(1000); // 模拟执行任务
                semaphore.release(); // 释放一个许可证
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
