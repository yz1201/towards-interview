package cn.dbdj1201.interview.singleton;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: yz1201
 * @Date: 2021/1/7 8:28
 */
@Slf4j(topic = "c.MainTest20210107")
public class MainTest20210107 {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        executorService.execute(()-> log.info("new obj - {}",LazyMan.getInstance()));
//
//        executorService.execute(()-> log.info("new obj - {}",LazyMan.getInstance()));
//
//        executorService.execute(()-> log.info("new obj - {}",LazyMan.getInstance()));
//
//        executorService.execute(()-> log.info("new obj - {}",LazyMan.getInstance()));
//
//        executorService.execute(()-> log.info("new obj - {}",LazyMan.getInstance()));
//
//        executorService.execute(()-> log.info("new obj - {}",LazyMan.getInstance()));
//
//        executorService.execute(()-> log.info("new obj - {}", Hungary.getInstance()));
//
//        executorService.execute(()-> log.info("new obj - {}", Hungary.getInstance()));
//
//        executorService.execute(()-> log.info("new obj - {}", Hungary.getInstance()));

        executorService.execute(()-> log.info("new obj - {}", StaticInner.getInstance()));
        executorService.execute(()-> log.info("new obj - {}", StaticInner.getInstance()));
        executorService.execute(()-> log.info("new obj - {}", StaticInner.getInstance()));
        
        executorService.execute(()-> log.info("new obj - {}", SingletonEnum.getInstance()));
        executorService.execute(()-> log.info("new obj - {}", SingletonEnum.getInstance()));
        executorService.execute(()-> log.info("new obj - {}", SingletonEnum.getInstance()));
    }
}
