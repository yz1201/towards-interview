package cn.dbdj1201.interview.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @Author: yz1201
 * @Date: 2022/1/7 8:58
 */
public class CyclicBarrierTest {

    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(5, () -> System.out.println("enough, go go"));
        System.out.println("game start");
        int len = 6;
        for (int i = 0; i < len; i++) {
            new Thread(() -> {
                try {
                    barrier.await();


                    System.out.println("help");


                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        System.out.println("game over");
    }

}
