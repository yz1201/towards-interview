package cn.dbdj1201.interview.thread;

import cn.hutool.Hutool;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;
import lombok.extern.slf4j.Slf4j;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2022/7/6 9:08
 */
@Slf4j
public class TestMain20220706 {
    public static void main(String[] args) {
        List<Integer> strArr1 = new ArrayList<>();
        List<Integer> strArr2 = new ArrayList<>();
        List<Integer> strArr3 = new ArrayList<>();
        int size = 1000000;
        for (int i = 0; i < size; i++) {
            strArr1.add(i);
            strArr2.add(i);
            strArr3.add(i);
        }

        int len = 100;

        ExecutorService pool = Executors.newCachedThreadPool();
        pool.execute(() -> {
            TimeInterval timer = DateUtil.timer();
            List<Integer> collect = strArr1.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
            System.out.println(collect.size());
            long interval = timer.interval();
            log.info("it consumes {}", interval);
        });

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        pool.execute(() -> {
            TimeInterval timer = DateUtil.timer();
            int index = 0;
            while (index < strArr2.size()) {
                if (strArr2.get(index) % 2 == 0) {
                    strArr2.remove(index);
//                    break;
                }else{
                    index++;
                }
            }
//            System.out.println(strArr2);
            long interval = timer.interval();
            log.info("it consume {}", interval);
        });
        pool.shutdown();


        TimeInterval timer = DateUtil.timer();
        //                break;
        strArr3.removeIf(next -> next % 2 == 0);
        long interval = timer.interval();
        log.info("it consumes {}", interval);

        try {
            TimeUnit.SECONDS.sleep(60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        System.out.println(strArr1.size());
        System.out.println(" ??? - "+strArr2.size());
        System.out.println(strArr3.size());
    }


}

@Slf4j
class LiteTask implements Runnable {

    @Override
    public void run() {
        TimeInterval timer = DateUtil.timer();

        long interval = timer.interval();
        log.info("it consume {}", interval);
    }
}
