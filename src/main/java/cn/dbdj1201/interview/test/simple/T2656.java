package cn.dbdj1201.interview.test.simple;

import cn.dbdj1201.interview.leetcode.work.simple.S2656;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/11/15 11:18
 */
@Slf4j
public class T2656 {

    public static void main(String[] args) {
        S2656 s2656 = new S2656();
        int[] nums = {1,2,3,4,5};
        System.out.println(s2656.maximizeSum(nums, 3));
    }
}
