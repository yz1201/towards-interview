package cn.dbdj1201.interview.test.simple;

import cn.dbdj1201.interview.leetcode.work.simple.Q1668;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/11/3 14:47
 */
@Slf4j
public class T1668 {
    public static void main(String[] args) {
        Q1668 q1668 = new Q1668();

//        System.out.println(q1668.maxRepeating("abababa", "ba"));
        System.out.println(q1668.maxRepeatingCopy1("abababa", "ba"));
    }
}
