package cn.dbdj1201.interview.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author: yz1201
 * @Date: 2022/6/28 16:53
 */
@Slf4j
public class TestMain2022062804 {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        AtomicReference<Object> atomicReference= new AtomicReference<>();
        CountDownLatch countDownLatch = new CountDownLatch(1);

        Runnable producer = () -> {
//            Object object=new Object();
            String object ="test obj";
            atomicReference.set(object);
            log.info("produced {}",object);
            countDownLatch.countDown();
        };

        Runnable consumer = () -> {
            try {
                countDownLatch.await();
                Object object = atomicReference.get();
                log.info("consumed {}",object);
            } catch (InterruptedException ex) {
                log.error(ex.getMessage(),ex);
            }
        };

        executor.submit(producer);
        executor.submit(consumer);

        System.out.println(executor.awaitTermination(5000, TimeUnit.MILLISECONDS));
        executor.shutdown();
    }

}
