package cn.dbdj1201.interview.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: yz1201
 * @Date: 2022/1/11 10:29
 */
@Slf4j
public class JucTest {

    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        TimeUnit.MILLISECONDS.sleep(200);
        lock.unlock();

        ThreadLocal<String> local = new ThreadLocal<>();
        local.set("asd");
        local.set("asdadasd");
        System.out.println(local.get());


        int a, b,c =0;
        a = b = c+1;
        System.out.println(a);


        boolean f1 = true;
        boolean f2 = f1;
        boolean f3 = f2 |f1;
    }
}
