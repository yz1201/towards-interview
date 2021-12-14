package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @Author: yz1201
 * @Date: 2021/12/14 8:43
 */
@Slf4j
public class TwoSumSolution {
    /*
    给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target的那两个整数，并返回它们的数组下标。
    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     */
    public static void main(String[] args) {
        int[] arr = {1, 20, 5, 7, 9, 3};
        int len = arr.length;
        int index1 = 0;
        int index2 = 0;

        while (index1 == index2) {
            index1 = new Random().nextInt(len);
            index2 = new Random().nextInt(len);
        }
        int target = arr[index1] + arr[index2];
        log.info("随机目标数字-{}", target);
//        int target = 25;
        int[] ansArr = new int[2];
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (numbers.containsKey(target - arr[i])) {
                ansArr[0] = i;
                ansArr[1] = numbers.get(target - arr[i]);
                break;
            }
            numbers.put(arr[i], i);
        }
        log.info("answer is {}, numbers - {}", ansArr, numbers);

//        List<Integer> values = (List<Integer>) numbers.values();
//        for (int i = 0; i < values.size(); i++) {
//            if (numbers.containsValue(target - values.get(i))){
//                ansArr[0] = i;
//                ansArr[1] =
//            }
//        }
    }
}
