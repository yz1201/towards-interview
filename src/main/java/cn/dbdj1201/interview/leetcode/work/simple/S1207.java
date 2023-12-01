package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2023/12/1 10:27
 */
@Slf4j
public class S1207 {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : arr) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        return counter.values().size() == new HashSet<>(counter.values()).size();
    }
}
