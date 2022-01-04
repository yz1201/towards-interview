package cn.dbdj1201.interview.thread;

/**
 * @Author: yz1201
 * @Date: 2022/1/4 22:44
 */
public class Test20220104 {

    public static void main(String[] args) throws InterruptedException {

//        new TestClass().testMethod();
        Thread thread1 = new Thread(() -> {
            try {
                new TestClass().testMethod();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                new TestClass().testMethod();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
    }



}

class MyThread implements Runnable{

    @Override
    public void run() {

    }
}

class TestClass{

    int count = 0;

    public void testMethod() throws InterruptedException {
        Object lock = new Object();
        synchronized (lock){
            System.out.println(lock);
            int len =10;
            for (int i = 0; i < len; i++) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + "-"+count++);
            }
        }

    }

}
