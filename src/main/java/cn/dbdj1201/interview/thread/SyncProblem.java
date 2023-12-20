package cn.dbdj1201.interview.thread;

/**
 * @Author: yz1201
 * @Date: 2022/1/10 21:59
 */
public class SyncProblem {

    // 定义一个锁
    static final Object lock = new Object();
    // 定义两个线程
    static Thread number = new Thread(()->{
        // 线程内部方法需要加synchronized，锁定lock对象
        synchronized (lock) {
            for (int i = 1; i < 27; i++) {
                System.out.print(i);
                // 打印出一个后，先唤醒其他线程
                lock.notifyAll();
                try {
                    // 阻塞当前线程，并且释放锁，这里判断是最后的边界条件，最后一次输出当前线程就不需要阻塞了
                    if (i != 26) {
                        lock.wait();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    });

    static Thread letter = new Thread(()->{
        synchronized (lock) {
            for (int i = 0; i < 26; i++) {
                System.out.print((char)('A'+i));
                lock.notifyAll();
                try {
                    // 这里一定要判断边界条件，假如是最后一个输出，则不需要阻塞，直接结束就好了，否则该线程会一直阻塞
                    if (i != 25) {
                        lock.wait();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    });


    public static void main(String[] args) {
        number.start();
        // 保证线程letter线程先运行
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        letter.start();
    }
}
