package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/2/17 16:44
 */
@Slf4j
public class ToLowercaseTask {

    public static void main(String[] args) {

    }

    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public static String toLowerCase1(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >=65 && c <=90){
                c |= 32;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
