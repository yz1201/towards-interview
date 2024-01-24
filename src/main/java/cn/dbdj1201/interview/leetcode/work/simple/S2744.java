package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2024/1/17 10:03
 */
@Slf4j
public class S2744 {
    public int maximumNumberOfStringPairs(String[] words) {
        int counter = 0;
        List<String> collect = Arrays.stream(words).collect(Collectors.toList());
        for (String word : words) {
            StringBuilder reverse = new StringBuilder(word);
            if (collect.contains(reverse.reverse().toString())
                    && !reverse.toString().equals(word)) {
                counter++;
            }
        }
        return counter / 2;
    }

    public int maximumNumberOfStringPairsCp(String[] words) {
        int n = words.length;
        int ans = 0;
        Set<Integer> seen = new HashSet<Integer>();
        for (int i = 0; i < n; ++i) {
            if (seen.contains(words[i].charAt(1) * 100 + words[i].charAt(0))) {
                ++ans;
            }
            seen.add(words[i].charAt(0) * 100 + words[i].charAt(1));
        }
        return ans;
    }

    public int maximumNumberOfStringPairsCp2(String[] words) {
        int n = words.length;
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0)) {
                    ++ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,4,5,6};
        if (nums[0] < nums[1]) {
            System.out.println("true");
        }
    }
}
