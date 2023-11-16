package cn.dbdj1201.interview.test.simple;

import cn.dbdj1201.interview.leetcode.work.simple.S2760;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/11/16 11:15
 */
@Slf4j
public class T2760 {

    public static void main(String[] args) {
        S2760 s2760 = new S2760();
        int[] nums = {3, 2, 5, 4};
        s2760.longestAlternatingSubarrayCopy(nums, 5);
    }
}
