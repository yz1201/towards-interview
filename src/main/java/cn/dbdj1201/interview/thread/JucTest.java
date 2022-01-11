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
    }
}
