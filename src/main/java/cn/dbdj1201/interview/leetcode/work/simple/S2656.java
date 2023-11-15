package cn.dbdj1201.interview.leetcode.work.simple;

import cn.dbdj1201.interview.design.decorate.Player;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2023/11/15 10:52
 */
@Slf4j
public class S2656 {

    public int maximizeSum(int[] nums, int k) {
        int length = nums.length;
        Arrays.sort(nums);
        int sum = 0;
        List<Integer> arrays = new LinkedList<>();
        int index = 0;
        //5 3
        for (int i = length - 1; i >= length - k; i--) {
            if (i == length - 1) {
                arrays.add(nums[i] + 1);
                sum += nums[i];
            } else {
                arrays.add(arrays.get(index) + 1);
                sum += arrays.get(index++);
            }
        }
        return sum;
    }

    public int maximizeSumCopy(int[] nums, int k) {
        int m = Arrays.stream(nums).max().getAsInt();
        return (2 * m + k - 1) * k / 2;
    }
}
