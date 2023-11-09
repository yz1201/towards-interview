package cn.dbdj1201.interview.test.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2023/5/18 14:26
 */
@Slf4j
public class T1073 {

    public static void main(String[] args) {
        int[] nums1 = {1, 0, 0};
        int[] nums2 = {1, 1, 1, 1, 1};
        M1073 m1073 = new M1073();
        System.out.println(Arrays.toString(m1073.addNegabinaryCopy(nums1, nums2)));
//        System.out.println(Arrays.toString(m1073.addNegabinary(nums1, nums2)));
        System.out.println(5 % -2);
    }
}
