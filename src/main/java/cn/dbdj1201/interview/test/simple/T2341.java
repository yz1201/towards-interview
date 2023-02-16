package cn.dbdj1201.interview.test.simple;

import cn.dbdj1201.interview.leetcode.work.simple.Q2341;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2023/2/16 14:39
 */
@Slf4j
public class T2341 {

    public static void main(String[] args) {
        Q2341 q2341 = new Q2341();
        int[] nums = {1,2,1,2,1,2};
        System.out.println(Arrays.toString(q2341.numberOfPairs(nums)));
    }
}
