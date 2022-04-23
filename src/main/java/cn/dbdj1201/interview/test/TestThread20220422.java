package cn.dbdj1201.interview.test;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/**
 * @Author: yz1201
 * @Date: 2022/4/22 16:45
 */
@Slf4j
public class TestThread20220422 {

    private static Map<String, Object> lock = new ConcurrentHashMap<>();

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(100);

//        executorService.execute(()->{
//            System.out.println(Thread.currentThread().getName() + "--00");
////           synchronized (lock){
////               System.out.println(Thread.currentThread().getName() +"--01");
////               lock.put("key1",1);
////               System.out.println(Thread.currentThread().getName() +"--02");
////           }
//        });
//        executorService.submit(()->{
//            System.out.println(Thread.currentThread().getName() + "--00");
////           synchronized (lock){
////               System.out.println(Thread.currentThread().getName() +"--01");
////               lock.put("key1",1);
////               System.out.println(Thread.currentThread().getName() +"--02");
////           }
//        });
//        System.out.println(Thread.currentThread().getName()+"--03");

        int len = 1;
        for (int i = 0; i < len; i++) {
            synchronized (lock) {
//                System.out.println(Thread.currentThread().getName() +"--01");
                int finalI = i;
                executorService.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + "--start");
                    lock.put("key-" + finalI, finalI);
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "--end");
                });
            }


        }
        executorService.shutdown();
//        TimeUnit.SECONDS.sleep(10);
//        System.out.println(lock);
    }
}
