package cn.dbdj1201.interview.test.simple;

import cn.dbdj1201.interview.leetcode.work.simple.S2446;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2023/5/17 15:12
 */
@Slf4j
public class T2446 {

    public static void main(String[] args) {
        S2446 s2446 = new S2446();
        String[] event1 = {"01:15", "02:00"};
        String[] event2 = {"01:00", "01:25"};
        System.out.println(s2446.haveConflict(event1, event2));
        char a = 'A';

        char b = 'z';

//        char res = (char) (2 & 0xff - 1 & 0xff);
        char res = (char) (b - a);
        System.out.println(res + "");
        System.out.println(b - a);
        String test = "test";
    }
}
