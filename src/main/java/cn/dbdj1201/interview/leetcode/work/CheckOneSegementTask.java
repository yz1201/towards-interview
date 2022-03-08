package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/3/8 11:12
 */
@Slf4j
public class CheckOneSegementTask {

    public static void main(String[] args) {

    }

    public static boolean checkOnesSegment(String s) {

        return !s.contains("01");
    }
}
