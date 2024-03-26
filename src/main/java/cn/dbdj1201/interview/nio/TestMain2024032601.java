package cn.dbdj1201.interview.nio;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @Author: yz1201
 * @Date: 2024/3/26 15:23
 */
@Slf4j
public class TestMain2024032601 {

    private static Semaphore semaphore = new Semaphore(2);

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        int times = 5;
        for (int i = 0; i < times; i++) {
            executorService.execute(() -> {
                try {
                    semaphore.acquire();
                    log.info("try ");
                    TimeUnit.SECONDS.sleep(2);
                    semaphore.release();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        executorService.shutdown();
    }
}
