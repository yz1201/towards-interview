package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2022/3/17 15:02
 */
@Slf4j
public class FindLongestWordsTask {

    public static void main(String[] args) {
//        String[] words = {"zz","a","vvv","dddd"};
        String[] words = {"ad","a","add","address","addre"};
        System.out.println(longestWordCopy(words));
    }

    public static String longestWord(String[] words) {
        List<String> collect = Arrays.stream(words).sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        System.out.println(collect);



        return null;
    }

    public static String longestWordCopy(String[] words) {
        Arrays.sort(words, (a, b) ->  {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            } else {
                return b.compareTo(a);
            }
        });
        String longest = "";
        Set<String> candidates = new HashSet<>();
        candidates.add("");
        for (String word : words) {
            if (candidates.contains(word.substring(0, word.length() - 1))) {
                candidates.add(word);
                longest = word;
            }
        }
        return longest;
    }

}
