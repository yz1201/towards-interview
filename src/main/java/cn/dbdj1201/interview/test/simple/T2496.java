package cn.dbdj1201.interview.test.simple;

import cn.dbdj1201.interview.leetcode.work.simple.S2496;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/8/4 10:21
 */
@Slf4j
public class T2496 {
    public static void main(String[] args) {
        S2496 s2496  = new S2496();
        String[] ss = new String[3];
        ss[0] = "000";
        ss[1] = "0a0";
        ss[2] = "00000a";
        System.out.println(s2496.maximumValue(ss));
    }
}
