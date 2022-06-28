package cn.dbdj1201.interview.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Author: yz1201
 * @Date: 2022/6/28 16:22
 */
@Slf4j
public class TestMain2022062802 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        int len = 5;
        for (int i = 0; i < len; i++) {
            executorService.execute(() -> {
                log.info("start");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            });
        }
        executorService.shutdown();
    }
}
