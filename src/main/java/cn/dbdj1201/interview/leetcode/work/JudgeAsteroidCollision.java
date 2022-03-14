package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Author: yz1201
 * @Date: 2022/3/11 14:21
 */
@Slf4j
public class JudgeAsteroidCollision {

    public static void main(String[] args) {

    }

    public static int[] asteroidCollision(int[] asteroids) {
        List<Integer> nums = Arrays.stream(asteroids).boxed().collect(Collectors.toList());
        int len = nums.size();
        if (len <= 1) return nums.stream().mapToInt(Integer::intValue).toArray();
//        return booms(nums);
        return null;
    }

    static List<Integer> booms(int num, List<Integer> nums) {
        int size = nums.size();
        if (size == 2) {
            IntStream intStream = nums.stream().mapToInt(Integer::intValue);
            if (intStream.max().orElse(0) <= 0 || intStream.min().orElse(0) >= 0) {
                return nums;
            } else {
                int reservedIndex;
                if (Math.abs(nums.get(0)) > Math.abs(nums.get(1))) {
                    reservedIndex = 0;
                } else if (Math.abs(nums.get(0)) == Math.abs(nums.get(1))) {
                    reservedIndex = 1;
                } else {
                    return null;
                }
                return nums.subList(reservedIndex, 1);
            }
        }
        return booms(num, nums.subList(1, size));
    }
}
