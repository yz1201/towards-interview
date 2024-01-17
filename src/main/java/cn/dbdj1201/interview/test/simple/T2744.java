package cn.dbdj1201.interview.test.simple;

import cn.dbdj1201.interview.leetcode.work.simple.S2744;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2024/1/17 10:09
 */
@Slf4j
public class T2744 {

    public static void main(String[] args) {
        S2744 s2744 = new S2744();
        String[] words = {"ff","tx","qr","zw","wr","jr","zt","jk","sq","xx"};
        System.out.println(s2744.maximumNumberOfStringPairs(words));
    }
}
