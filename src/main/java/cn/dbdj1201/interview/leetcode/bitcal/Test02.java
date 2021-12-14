package cn.dbdj1201.interview.leetcode.bitcal;

import cn.hutool.core.util.StrUtil;

/**
 * @Author: yz1201
 * @Date: 2021/6/4 10:53
 */
public class Test02 {

    /*
        给定一个十进制整数，输出它在二进制下的翻转结果。
     */


    public static String cal(int num){
        return StrUtil.reverse(Integer.toBinaryString(num));
    }

    public static void main(String[] args) {
            String s = "abc";
        System.out.println(s.substring(1));
    }

}
