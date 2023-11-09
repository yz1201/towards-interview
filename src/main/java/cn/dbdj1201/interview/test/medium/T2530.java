package cn.dbdj1201.interview.test.medium;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/10/18 14:39
 */
@Slf4j
public class T2530 {

    public static void main(String[] args) {
        M2530 m2530 = new M2530();
//        int[] nums = {533854490,546147233,543352274,161843442,268635067};
        int[] nums = {1, 10, 3, 3, 3};
        System.out.println(m2530.maxKelementsV1(nums, 3));
    }
}
