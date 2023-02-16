package cn.dbdj1201.interview.thread;

import cn.dbdj1201.interview.leetcode.Test;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * @Author: yz1201
 * @Date: 2022/6/28 16:02
 */
@Slf4j
public class TestMain2022062801 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        TimeUnit.SECONDS.sleep(2);
        new TestThread().start();
        FutureTask<String> task = new FutureTask<>(new TestCallable());
        new Thread(task).start();
        TimeUnit.SECONDS.sleep(2);
        System.out.println(task.get());
    }
}

class TestThread extends Thread{
    @Override
    public void run() {
        System.out.println(this.getThreadGroup());
        System.out.println("what happened");
    }
}

class TestCallable implements Callable<String>{

    @Override
    public String call() throws Exception {
        return "strStrSTRSTr";
    }
}
