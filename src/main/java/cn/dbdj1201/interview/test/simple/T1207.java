package cn.dbdj1201.interview.test.simple;

import cn.dbdj1201.interview.leetcode.work.simple.S1207;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/12/1 11:01
 */
@Slf4j
public class T1207 {

    public static void main(String[] args) {
        S1207 s1207 = new S1207();
        int[] nums = {1, 1, 2, 2, 3};
        System.out.println(s1207.uniqueOccurrences(nums));
    }
}
