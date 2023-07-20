package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2023/7/20 14:12
 */
@Slf4j
public class S2540 {

    public int getCommon(int[] nums1, int[] nums2) {
        for (int index : nums1) {
            for (int num : nums2) {
                if (num == index) return num;
            }
        }
        return -1;
    }

    public int getCommonV1(int[] nums1, int[] nums2) {
        List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());

        if (nums1[0] > nums2[nums2.length - 1] || nums2[0] > nums1[nums1.length - 1]) return -1;

        for (int index : list1) {
            if (list2.contains(index)) return index;
        }
        return -1;
    }
}
