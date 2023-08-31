package cn.dbdj1201.interview.test.medium;

import cn.dbdj1201.interview.leetcode.work.middle.M6;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/8/31 15:53
 */
@Slf4j
public class T6 {

    public static void main(String[] args) {
        M6 m6 = new M6();
        System.out.println(m6.convertCopy("PAYPALISHIRING", 3));
        System.out.println(m6.convertCopy2("PAYPALISHIRING", 3));
    }
}
