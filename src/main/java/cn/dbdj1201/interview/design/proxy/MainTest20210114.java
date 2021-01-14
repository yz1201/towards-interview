package cn.dbdj1201.interview.design.proxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Proxy;

/**
 * @Author: yz1201
 * @Date: 2021/1/14 17:53
 */
@Slf4j(topic = "c.MainTest20210114")
public class MainTest20210114 {

    public static void main(String[] args) {
        new LenovoProxy(new Lenovo()).sell();
    }
}
