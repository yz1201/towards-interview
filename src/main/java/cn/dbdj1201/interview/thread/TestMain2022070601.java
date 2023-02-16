package cn.dbdj1201.interview.thread;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Author: yz1201
 * @Date: 2022/7/6 10:53
 */
@Slf4j
public class TestMain2022070601 {

    public static void main(String[] args) {
        List<Integer> strArr = new ArrayList<>();
        int size = 1000000;
        for (int i = 0; i < size; i++) {
            strArr.add(i);
        }

//        int index = 0;
//        while (index < strArr.size()) {
//            if (strArr.get(index) % 2 == 0) {
//                strArr.remove(index);
//            } else {
//                index++;
//            }
//        }

        System.out.println(strArr.size());

        ExecutorService pool = Executors.newCachedThreadPool();
        Future<Long> submit = pool.submit(() -> {
            TimeInterval timer = DateUtil.timer();
            strArr.removeIf(num -> num % 2 == 0);
            long interval = timer.interval();
            log.info("ans {}", interval);
            return interval;
        });

        try {
            log.info("res - {}", submit.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        pool.shutdown();
    }
}
