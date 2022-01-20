package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @Author: yz1201
 * @Date: 2022/1/20 20:33
 */
@Slf4j
public class ThirdMaxTask {

    public static void main(String[] args) {
        int[] nums = {1,2, 3};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        int len = nums.length;
        if (len < 1) return -1;
        if (len < 3)
            return Arrays.stream(nums).max().getAsInt();
        //1 1 1
        Deque<Integer> maxList = new LinkedList<>();
//        List<Integer> maxList = new ArrayList<>();
        for (int num : nums) {
            maxList.add(num);
        }
        int max = Arrays.stream(nums).max().getAsInt();
        maxList.removeIf(num -> num == max);
        System.out.println(maxList);
        if (maxList.size() > 1) {
            int secMax = maxList.stream().mapToInt(Integer::intValue).max().getAsInt();
            maxList.removeIf(num -> num == secMax);
            System.out.println(maxList);
            if (maxList.size() >= 1)
                return maxList.stream().mapToInt(Integer::intValue).max().getAsInt();
            else
                return max;
        } else {
            return max;
        }
    }

    public static int thirdMax1(int[] nums) {
        int len = nums.length;
        if (len < 1) return -1;
        if (len < 3) return Arrays.stream(nums).max().getAsInt();

        return -1;
    }
}
