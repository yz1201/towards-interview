package cn.dbdj1201.interview.leetcode.work.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2022/8/13 10:59
 */
public class Q1539 {

    public int findKthPositive(int[] arr, int k) {
        int ans = 0;
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            nums.add(i + 1);
        }

        int index = 0;
        int[] recordArr = new int[k];
        for (int i = 0; i < nums.size(); i++) {
            if (!nums.contains(arr[i]) && i < k) {
                index++;
//                recordArr[i] = ar[i];
            }

            if (index == k) {
                return recordArr[i];
            }
        }
        return ans;
    }

    public int findKthPositiveV1(int[] arr, int k) {
        int ans = 0;
        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());

        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            nums.add(i + 1);
        }

        int index = 0;
        int[] recordArr = new int[k];
        for (Integer num : nums) {
            if (!arrList.contains(num) && index < k) {
                recordArr[index] = num;
                index++;
            }

            if (index == k) {
                return recordArr[k - 1];
            }
        }
        return ans;
    }

    public int findKthPositiveCopy(int[] arr, int k) {
        int missCount, lastMiss = -1, current = 1, ptr = 0;
        for (missCount = 0; missCount < k; ++current) {
            if (current == arr[ptr]) {
                ptr = (ptr + 1 < arr.length) ? ptr + 1 : ptr;
            } else {
                ++missCount;
                lastMiss = current;
            }
        }
        return lastMiss;
    }


}
