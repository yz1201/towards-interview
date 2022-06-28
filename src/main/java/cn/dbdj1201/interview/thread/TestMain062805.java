package cn.dbdj1201.interview.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author: yz1201
 * @Date: 2022/6/28 17:35
 */
@Slf4j
public class TestMain062805 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        int len = 5;
        log.info("start");
        for (int i = 0; i < len; i++) {
            scheduledExecutorService.schedule(() -> {
                log.info("task");
            }, 2, TimeUnit.SECONDS);
        }
        scheduledExecutorService.shutdown();
    }
}
