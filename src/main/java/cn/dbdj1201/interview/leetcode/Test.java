package cn.dbdj1201.interview.leetcode;

import cn.hutool.core.util.CharUtil;

/**
 * @Author: yz1201
 * @Date: 2021/5/26 15:03
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("i'm test class");
        String test = "test";
        System.out.println("test -"+test.substring(4, 4));
        char c = 'c';
        System.out.println(CharUtil.isNumber(c));
    }
}
