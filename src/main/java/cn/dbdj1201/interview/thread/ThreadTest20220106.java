package cn.dbdj1201.interview.thread;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/1/6 11:24
 */
//@Slf4j
public class ThreadTest20220106 {

    private static int num = 10;

    public static void main(String[] args) {
//        MyObj myObj = new MyObj();

        int len =10;
//        for (int i = 0; i < len; i++) {
//            new MyTestThread().start();
//        }
//
//        for (int i = 0; i < len; i++) {
//
//        }

    }

}

class MyTestThread extends Thread{

    int count =0;

    @Override
    public void run() {
        int len =10000;
        for (int i = 0; i < len; i++) {
            count++;
        }
    }
}


class MyObj{

    private static int num = 10;

    public MyObj(){}
}