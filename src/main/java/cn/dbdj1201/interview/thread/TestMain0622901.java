package cn.dbdj1201.interview.thread;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/6/29 14:38
 */
@Slf4j
public class TestMain0622901 {
    public static void main(String[] args) {
        System.out.println(TestMain0622901.class.getClassLoader());
        System.out.println(TestMain0622901.class.getClassLoader().getParent());
        System.out.println(TestMain0622901.class.getClassLoader().getParent().getParent());
    }
}
