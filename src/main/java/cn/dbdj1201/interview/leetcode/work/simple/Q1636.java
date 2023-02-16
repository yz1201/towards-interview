package cn.dbdj1201.interview.leetcode.work.simple;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2022/9/19 16:30
 */
public class Q1636 {

    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> numCounter = new HashMap<>();
        for (int num : nums) {
            numCounter.put(num, numCounter.getOrDefault(num, 0) + 1);
        }

        List<Integer> keys = numCounter.entrySet().stream().sorted((o1,o2)->{
            int compare = Integer.compare(o1.getValue(), o2.getValue());
            if (compare == 0){
                return Integer.compare(o2.getKey(), o1.getKey());
            }else return compare;
        }).map(Map.Entry::getKey).collect(Collectors.toList());
//        System.out.println(keys);
//        List<Integer> values = numCounter.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getValue)).map(Map.Entry::getValue).collect(Collectors.toList());
//        System.out.println(values);

        List<Integer> res = new ArrayList<>();
        for (Integer key : keys) {
            for (int i = 0; i < numCounter.get(key); i++) {
                res.add(key);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
