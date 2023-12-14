package cn.dbdj1201.interview.test.medium;

import cn.dbdj1201.interview.leetcode.work.middle.M8;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/12/14 9:19
 */
@Slf4j
public class T8 {

    public static void main(String[] args) {
        M8 m8 = new M8();
        System.out.println(m8.myAtoiCopy("words and 987"));
        System.out.println(m8.myAtoiCopy("-987"));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
