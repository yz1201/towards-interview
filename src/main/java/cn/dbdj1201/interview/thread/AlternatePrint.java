package cn.dbdj1201.interview.thread;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/12/20 14:35
 */
@Slf4j
public class AlternatePrint {
    public static void main(String[] args) {
        WaitNotify waitNotify = new WaitNotify(1, 50000);
        new Thread(() -> waitNotify.print("a", 1, 2), "a线程").start();
        new Thread(() -> waitNotify.print("b", 2, 3), "b线程").start();
        new Thread(() -> waitNotify.print("c", 3, 1), "c线程").start();
    }
}

class WaitNotify {
    // 等待标记
    private int flag;
    // 循环次数
    private final int loopNumber;
    public WaitNotify(int flag, int loopNumber) {
        this.flag = flag;
        this.loopNumber = loopNumber;
    }

    /**
     * 输出内容    等待标记    下一个标记
     * a           1          2
     * b           2          3
     * c           3          1
     */
    public void print(String str, int waitFlag, int nextFlag) {
        for (int i = 0; i < loopNumber; i++) {
            synchronized (this) {
                while (waitFlag != flag) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(str);
                flag = nextFlag;
                this.notifyAll();
            }
        }
    }
}