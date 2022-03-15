package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2022/3/15 14:38
 */
@Slf4j
public class SortArrayByParityTaskII {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }

    public static int[] sortArrayByParityII(int[] nums) {

        List<Integer> oneIndex = new ArrayList<>();
        List<Integer> twoIndex = new ArrayList<>();

        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] % 2 == 0 && i % 2 != 0) {
                oneIndex.add(i);
            } else if (nums[i] % 2 != 0 && i % 2 == 0) {
                twoIndex.add(i);
            }
        }
        System.out.println(oneIndex);
        System.out.println(twoIndex);
        int size = oneIndex.size();
        for (int i = 0; i < size; i++) {
            int temp = nums[oneIndex.get(i)];
            nums[oneIndex.get(i)] = nums[twoIndex.get(i)];
            nums[twoIndex.get(i)] = temp;
        }
        return nums;
    }

}
