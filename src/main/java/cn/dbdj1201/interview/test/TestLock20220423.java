package cn.dbdj1201.interview.test;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Author: yz1201
 * @Date: 2022/4/23 16:30
 */
@Slf4j
public class TestLock20220423 {
    private static Map<String, Object> lock = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        int len = 100;
        for (int i = 0; i < len; i++) {
            executorService.execute(new Task());
        }

        if (!executorService.isShutdown()) {
            executorService.shutdown();
            System.out.println(Thread.currentThread().getName()+" --- " + lock);
        }


//        executorService.execute(new Task());
//        executorService.execute(new Task());
    }

    static class Task implements Runnable{
        @Override
        public void run() {
            synchronized (lock){
                System.out.println(Thread.currentThread().getName()+"start");
                try {
                    lock.put(Thread.currentThread().getName(),Thread.currentThread());
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"end");
            }
        }
    }
}
