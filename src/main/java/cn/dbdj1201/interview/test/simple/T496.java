package cn.dbdj1201.interview.test.simple;

import cn.dbdj1201.interview.leetcode.work.simple.S496;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/12/26 14:38
 */
@Slf4j
public class T496 {

    public static void main(String[] args) {
        S496 s496 = new S496();
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        s496.nextGreaterElementCp(nums1, nums2);
    }
}
