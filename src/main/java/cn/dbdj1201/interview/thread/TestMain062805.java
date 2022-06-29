package cn.dbdj1201.interview.thread;

import cn.dbdj1201.interview.leetcode.work.Codec;
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
        int len = 10;
        Codec codec = new Codec();
        String encode = codec.encode("https://leetcode.com/problems/design-tinyurl");
        log.info("task start {}", encode);
        for (int i = 0; i < len; i++) {
            scheduledExecutorService.schedule(() -> {
                String decode = codec.decode(encode);
                log.info("decode {}", decode);
            }, 2, TimeUnit.SECONDS);
        }
        scheduledExecutorService.shutdown();
    }
}
