package cn.dbdj1201.interview.test.examples;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Author: yz1201
 * @Date: 2023/1/4 15:35
 */
@Slf4j
public class CountDownLatchDemo {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        executorService.submit()
        int period =2;
        for (int i = 0; i < period; i++) {
            executorService.submit(() -> {
                try {
                    log.info("start " + countDownLatch.getCount());
                    TimeUnit.MILLISECONDS.sleep(5000);
                    countDownLatch.countDown();
//                    log.info("end " + countDownLatch.getCount());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        try {
            log.info("主线程" + Thread.currentThread().getName() + "等待子线程执行完成...");
            countDownLatch.await();//阻塞当前线程，直到计数器的值为0
            log.info("主线程" + Thread.currentThread().getName() + "开始执行...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        executorService.shutdown();
    }

    class LatchTest implements Runnable {
        private CountDownLatch lock;


        @Override
        public void run() {

        }
    }
}
