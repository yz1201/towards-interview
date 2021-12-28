package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2021/12/28 11:24
 */
@Slf4j
public class SingleNumberTask {

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 3, 4, 6, 4, 3};
        System.out.println(singleNumberCopy(nums));
    }

    public static int singleNumber(int[] nums) {
        int len = nums.length;
        int target = nums[0];

        int index = 0;

        while (index < len) {

        }

        return target;
    }

    public static int singleNumber1(int[] nums) {

        HashMap<Integer, Integer> numsMap = new HashMap<>();
        numsMap.put(0, 0);
        numsMap.put(1, 0);
        numsMap.put(2, 0);
        numsMap.put(3, 0);
        numsMap.put(4, 0);
        numsMap.put(5, 0);
        numsMap.put(6, 0);
        numsMap.put(7, 0);
        numsMap.put(8, 0);
        numsMap.put(9, 0);

        int len = nums.length;
        for (int i = 0; i < len; i++) {
            switch (nums[i]) {
                case 0:
//                    numsMap.put(0,++numsMap.get(0));
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
            }
        }

        return -1;
    }

    public static int singleNumber2(int[] nums) {
        List<Integer> numsArray = new ArrayList<>();
        for (int num : nums) {
            if (!numsArray.contains(num)) {
                numsArray.add(num);
            } else {
                numsArray = numsArray.stream().filter(n -> n != num).collect(Collectors.toList());
                log.info("filter--{}",numsArray);
            }
        }
        System.out.println(numsArray);
        return numsArray.get(0);
    }

    public static int singleNumber3(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            if (!stack.contains(num)) {
                stack.push(num);
            } else {
                stack.pop();
            }
        }
        return stack.peek();
    }

    public static int singleNumber4(int[] nums) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        numsMap.put(0, 0);
        numsMap.put(1, 0);
        numsMap.put(2, 0);
        numsMap.put(3, 0);
        numsMap.put(4, 0);
        numsMap.put(5, 0);
        numsMap.put(6, 0);
        numsMap.put(7, 0);
        numsMap.put(8, 0);
        numsMap.put(9, 0);

        for (Integer integer : numsMap.keySet()) {
            for (int num : nums) {
                if (num == integer) {
                    int value = numsMap.get(integer) + 1;
                    numsMap.put(integer, value);
                }
            }
        }

        for (Integer integer : numsMap.keySet()) {
            if (numsMap.get(integer) == 1) {
                return integer;
            }
        }
        return -1;
    }

    public static int singleNumber5(int[] nums) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for (int num : nums) {
            if (!numsMap.containsKey(num)) {
//                numsMap.put(num,)
            }
        }

        for (Integer integer : numsMap.keySet()) {
            for (int num : nums) {
                if (num == integer) {
                    int value = numsMap.get(integer) + 1;
                    numsMap.put(integer, value);
                }
            }
        }

        for (Integer integer : numsMap.keySet()) {
            if (numsMap.get(integer) == 1) {
                return integer;
            }
        }
        return -1;
    }

    public static int singleNumberCopy(int[] nums){
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
