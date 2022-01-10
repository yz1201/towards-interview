package cn.dbdj1201.interview.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: yz1201
 * @Date: 2022/1/10 20:04
 */
@Slf4j
public class Problem2020110 {
    static int index = 0;

    public static void main(String[] args) throws InterruptedException {
        List<Character> l1 = new ArrayList<>();
        List<Character> l2 = new ArrayList<>();
        l1.add('A');
        l1.add('B');
        l1.add('C');
        l2.add('1');
        l2.add('2');
        l2.add('3');
        solve(l1, l2);
    }

    static ReentrantLock lock = new ReentrantLock();
    static Object objLock = new Object();

    private static void solve(List<Character> l1, List<Character> l2) throws InterruptedException {

        Condition c1 = lock.newCondition();
        Thread t1 = new Thread(() -> {
            int size = l1.size();
            while (index < size) {
                lock.lock();
                if (index % 2 != 0) {
                    try {
                        c1.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(l1.get(index));
                index++;
                c1.signalAll();
                lock.unlock();
            }
            System.out.println();
        });

        Thread t2 = new Thread(() -> {
            int size = l1.size();
            lock.lock();
            while ((index - 1) < size) {
                if ((index - 1) % 2 == 0) {
                    try {
                        c1.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(l2.get(index));
                c1.signalAll();
                lock.unlock();
            }
        });

        t1.start();
        TimeUnit.MILLISECONDS.sleep(200);
        t2.start();

    }


    private static void solve1(List<Character> l1, List<Character> l2){

        Thread t1 = new Thread(()->{
            synchronized (objLock){

                while (index<l1.size()){



                    index++;
                }

            }
        });
        Thread t2 = new Thread();


    }
}
