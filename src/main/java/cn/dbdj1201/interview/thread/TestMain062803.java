package cn.dbdj1201.interview.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Author: yz1201
 * @Date: 2022/6/28 16:37
 */
@Slf4j
public class TestMain062803 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        int len = 10;
        for (int i = 0; i < len; i++) {
            executorService.submit(()->{
               log.info("start");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                log.info("end");
            });
        }
        executorService.shutdown();
    }
}
