package cn.dbdj1201.interview.nio;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Author: yz1201
 * @Date: 2024/3/26 15:33
 */
@Slf4j
public class TestMain2024032602 {

    private static CountDownLatch countDownLatch = new CountDownLatch(2);

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            executorService.execute(()->{
                log.info("do sth");
                try {
                    TimeUnit.SECONDS.sleep(2);
                    log.info("finish");
                    countDownLatch.countDown();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        countDownLatch.await();
        log.info("that's over");
    }
}
