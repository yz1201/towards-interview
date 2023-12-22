package cn.dbdj1201.interview.test;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @Author: yz1201
 * @Date: 2023/3/29 10:17
 */
@Slf4j
public class Test20230329 {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5);

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        int len = 11;
        for (int i = 0; i < len; i++) {
            executorService.submit(() -> {
                if (semaphore.tryAcquire())
                    log.info("  hello");
                try {
                    TimeUnit.MILLISECONDS.sleep(1000);
                    log.info("free");
                    semaphore.release();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        executorService.shutdown();
    }
}
