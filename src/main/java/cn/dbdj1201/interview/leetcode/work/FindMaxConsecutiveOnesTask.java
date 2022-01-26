package cn.dbdj1201.interview.leetcode.work;

import cn.hutool.core.text.StrBuilder;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2022/1/26 10:41
 */
@Slf4j
public class FindMaxConsecutiveOnesTask {

    public static void main(String[] args) {
//        int[] nums = {1,1,1,0,1,0,0,1,0,1};
        int[] nums = {0, 0, 0};
        System.out.println(findMaxConsecutiveOnes1(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int validLen = 0;

        int len = nums.length;


        int index = 0;

        while (index < len - 1) {

            if (nums[index] == 1) {
                validLen++;
            }

            index++;
        }

        return -1;
    }

    public static int findMaxConsecutiveOnes1(int[] nums) {

        StringBuilder numArr = new StringBuilder();
        int len = nums.length;

        for (int num : nums) {
            numArr.append(num);
        }

        String[] split = numArr.toString().split("[0]+");
        System.out.println(Arrays.toString(split));

        if (split.length < 1) return 0;
        return Arrays.stream(split).map(String::length).collect(Collectors.toList())
                .stream().mapToInt(Integer::intValue).max().getAsInt();
    }
}
