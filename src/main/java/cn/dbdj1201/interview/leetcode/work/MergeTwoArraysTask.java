package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2021/12/28 8:40
 */
@Slf4j
public class MergeTwoArraysTask {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0, 0};
        int[] nums2 = {1, 1, 1, 1};
        int len1 = nums1.length;
        int len2 = nums2.length;
        merge2(nums1, len1 - len2, nums2, len2);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        if (n == 0) {
//            for (int i = 0; i < m; i++) {
//
//            }
//        }

        int index = 0;
        while (index < n) {
            if (nums1[index] > nums2[index]) {
                int temp = nums1[index];
                nums1[index] = nums2[index];
            }


            index++;
        }

    }

    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        if (n >= 0) System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1;
        int tail = m + n - 1;
        int cur;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 == -1) {
                cur = nums2[p2--];
            } else if (p2 == -1) {
                cur = nums1[p1--];
            } else if (nums1[p1] > nums2[p2]) {
                cur = nums1[p1--];
            } else {
                cur = nums2[p2--];
            }
            nums1[tail--] = cur;
        }
    }

}
