package cn.dbdj1201.interview.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

/**
 * @Author: yz1201
 * @Date: 2022/1/17 18:35
 */
@Slf4j
public class ConcurrentHashMapTest {

    public static void main(String[] args) throws InterruptedException {
//        List<String> lists = new CopyOnWriteArrayList<>();
        TransferQueue<String> transferQueue = new LinkedTransferQueue<>();

//        new Thread(()->{
//            try {
//                System.out.println(transferQueue.take());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }).start();
//        System.out.println("???"+transferQueue.size());

        new Thread(()->{
            try {
                System.out.println(transferQueue.take());
                transferQueue.transfer("test?");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

//        transferQueue.put("test");
//        transferQueue.add("test");
//        transferQueue.transfer("test?");
//        System.out.println("???"+transferQueue.size());

        new Thread(()->{
            try {
                System.out.println("new thread start");
                System.out.println(transferQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();


//        transferQueue.put("?test?");

    }
}
