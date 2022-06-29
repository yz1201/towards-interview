package cn.dbdj1201.interview.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * @Author: yz1201
 * @Date: 2022/6/29 15:59
 */
@Slf4j
public class TestMain062902 {

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newCachedThreadPool();
        int len = 1;
        for (int i = 0; i < len; i++) {
            threadPool.submit(()->{
               log.info("start");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                log.info("end");
            });
        }
        threadPool.shutdown();

        SynchronousQueue<String> queue = new SynchronousQueue<>();
        System.out.println(queue.offer("sss"));


    }


}
