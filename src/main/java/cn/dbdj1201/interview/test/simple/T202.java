package cn.dbdj1201.interview.test.simple;

import cn.dbdj1201.interview.leetcode.work.simple.S202;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/4/11 16:00
 */
@Slf4j
public class T202 {

    public static void main(String[] args) {
        S202 s202 = new S202();

//        System.out.println(s202.isHappy(2));
        System.out.println(s202.isHappyCopy(Integer.MAX_VALUE));
    }
}
