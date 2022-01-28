package cn.dbdj1201.interview.thread;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @Author: yz1201
 * @Date: 2022/1/7 8:46
 */
public class CountdownLatchTest {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(5);

        Thread[] threads = new Thread[100];
        System.out.println("game start");

        int len = 100;

//        for (int i = 0; i < len; i++) {
//            threads[i] = new Thread(()->{
//                System.out.println();
//                latch.countDown();
//            });
//        }

        new Thread(() -> {
            try {
                int cycleTimes = 3;
                for (int i = 0; i < cycleTimes; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    latch.countDown();
                    System.out.println("count down");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }).start();

//        Arrays.stream(threads).forEach(Thread::start);
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("game over");
    }


}
