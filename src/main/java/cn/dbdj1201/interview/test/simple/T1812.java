package cn.dbdj1201.interview.test.simple;

import cn.dbdj1201.interview.leetcode.work.simple.Q1812;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/12/8 15:46
 */
@Slf4j
public class T1812 {

    public static void main(String[] args) {
        System.out.println(new Q1812().squareIsWhite("a8"));
        System.out.println(new Q1812().squareIsWhite("a1"));
        System.out.println(new Q1812().squareIsWhite("a2"));
        System.out.println(new Q1812().squareIsWhite("a3"));
        System.out.println(new Q1812().squareIsWhite("b3"));
        System.out.println(new Q1812().squareIsWhite("c3"));
        System.out.println(new Q1812().squareIsWhite("d3"));
    }
}
