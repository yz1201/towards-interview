package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2022/3/8 15:11
 */
@Slf4j
public class FindMajorityElementTask {

    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 4};
        System.out.println(majorityElement(nums));
    }

    public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        Arrays.stream(nums).forEach(num -> numsMap.put(num, numsMap.getOrDefault(num, 0) + 1));
        System.out.println(numsMap);
//        numsMap.values().stream().filter(num -> num > nums.length / 3).forEach(System.out::println);
        return numsMap.entrySet().stream().filter(entry -> entry.getValue() > nums.length / 3).map(Map.Entry::getKey).collect(Collectors.toList());
    }


    public static List<Integer> majorityElementCopy(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > nums.length / 3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
