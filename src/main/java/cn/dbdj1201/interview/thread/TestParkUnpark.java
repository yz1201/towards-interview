package cn.dbdj1201.interview.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.LockSupport;

/**
 * @Author: yz1201
 * @Date: 2023/12/20 14:54
 */
@Slf4j
public class TestParkUnpark {
    static Thread a;
    static Thread b;
    static Thread c;

    public static void main(String[] args) {
        ParkUnpark parkUnpark = new ParkUnpark(50000);
        a = new Thread(() -> parkUnpark.print("a", b), "a");
        b = new Thread(() -> parkUnpark.print("b", c), "b");
        c = new Thread(() -> parkUnpark.print("c", a), "c");
        a.start();
        b.start();
        c.start();
        LockSupport.unpark(a);
    }
}

class ParkUnpark {
    private final int loopNumber;

    public ParkUnpark(int loopNumber) {
        this.loopNumber = loopNumber;
    }

    public void print(String str, Thread nextThread) {
        for (int i = 0; i < loopNumber; i++) {
            LockSupport.park();
            System.out.print(str);
            LockSupport.unpark(nextThread);
        }
    }
}
