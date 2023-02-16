package cn.dbdj1201.interview.test.examples;

import cn.hutool.log.Log;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

/**
 * @Author: yz1201
 * @Date: 2023/1/4 14:55
 */
@Slf4j
public class SemephoreDemo {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(5);

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        int runs = 10;
        for (int i = 0; i < runs; i++) {
            executorService.execute(() -> {
                try {
                    semaphore.acquire();
//                    System.out.println(Thread.currentThread().getName() + "begin");
                    log.info(Thread.currentThread().getName() + "begin");

                    TimeUnit.MILLISECONDS.sleep(5000);

                    semaphore.release();
//                    System.out.println(Thread.currentThread().getName() + "end");
                    log.info(Thread.currentThread().getName() + "end");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        executorService.shutdown();
        if (executorService.isTerminated())
            System.out.println("gg");
    }

    @SneakyThrows
    private void test(){

    }
}
