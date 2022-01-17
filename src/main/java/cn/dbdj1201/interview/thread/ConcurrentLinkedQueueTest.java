package cn.dbdj1201.interview.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @Author: yz1201
 * @Date: 2022/1/17 18:21
 */
@Slf4j
public class ConcurrentLinkedQueueTest {

    //    static ConcurrentLinkedQueue<String> tickets = new ConcurrentLinkedQueue<>();
//    static Deque<String> tickets = new LinkedList<>();
static List<String> tickets = new ArrayList<>();
    static {
        int len = 1000;
        for (int i = 0; i < len; i++) {
            tickets.add("票" + i);
        }
    }

    public static void main(String[] args) {

        int len = 10;
        for (int i = 0; i < len; i++) {

            new Thread(() -> {

                while (true) {
//                    String s = tickets.poll();
                    String s = tickets.remove(0);
                    if (s == null) break;
                    else System.out.println(Thread.currentThread().getName()+ " 抢到了 - " + s);

                }

            }).start();

        }


    }
}
