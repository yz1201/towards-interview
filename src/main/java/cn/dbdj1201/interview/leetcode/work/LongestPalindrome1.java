package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2022/4/13 10:38
 */
@Slf4j
public class LongestPalindrome1 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome1("aabbccdddeeeeefg"));
        System.out.println(longestPalindrome1("abccccdd"));
        System.out.println(longestPalindrome1("bb"));
        System.out.println(longestPalindrome1("a"));

        longestPalindromeCopy("aaccbbddeeeeefg");
    }

    public static int longestPalindrome(String s) {

        Map<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        System.out.println(counts);

        int sum = counts.values().stream().filter(v -> v % 2 == 0).mapToInt(Integer::intValue).sum();
//        int sum1 = counts.values().stream().filter(v -> v % 2 != 0 && v > 2).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
//        System.out.println(sum1);
        List<Integer> collect1 = counts.values().stream().filter(v -> v % 2 != 0 && v > 2).collect(Collectors.toList());
//        System.out.println(collect);
        System.out.println(collect1);
        System.out.println(collect1.stream().mapToInt(Integer::intValue).sum() - collect1.size());
        List<Integer> collect2 = counts.values().stream().filter(v -> v == 1).collect(Collectors.toList());
        System.out.println(collect2);

        return -1;
    }

    public static int longestPalindrome1(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        List<Integer> collect = counts.values().stream().filter(v -> v % 2 != 0 && v > 2).collect(Collectors.toList());
        List<Integer> collect1 = counts.values().stream().filter(v -> v == 1).collect(Collectors.toList());
        int mid = 0;
        if (collect.size() > 0 || collect1.size() > 0) {
            mid = 1;
        }
        return counts.values().stream().filter(v -> v % 2 == 0).mapToInt(Integer::intValue).sum() +
                collect.stream().mapToInt(Integer::intValue).sum() - collect.size() + mid;
    }

    public static int longestPalindromeCopy(String s) {
        int[] count = new int[128];
        int length = s.length();
        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);
            count[c]++;
        }

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (v % 2 == 1 && ans % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }


}
