package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2023/5/17 10:47
 */
@Slf4j
public class S2446 {
    public boolean haveConflict(String[] event1, String[] event2) {
        //event1 = ["01:15","02:00"], event2 = ["02:00","03:00"]

//        event1[0]

        return event1[1].compareTo(event2[0]) >= 0 && event1[0].compareTo(event2[1]) <= 0;
    }
}
