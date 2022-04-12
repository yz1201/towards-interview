package cn.dbdj1201.interview.leetcode.work;

import cn.hutool.extra.tokenizer.Word;
import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2022/4/11 16:52
 */
@Slf4j
public class FindCommonChars {

    public static void main(String[] args) {

        String s = "abc";
        String s1 = "abcde";
        String s2 = "abcefh";

        String[] srcs = {s,s1,s2};

        System.out.println(commonChars1(srcs));
    }

    public static List<String> commonChars(String[] words) {

        List<Character> set = new ArrayList<>();
        int len = words.length;
        if (len < 1)
            return null;

        String first = words[0];

        for (char c : first.toCharArray()) {
            for (int i = 1; i < len; i++) {
                if (words[i].contains("" + c)) {
                    set.add(c);
                } else {
                    set.remove(c);
                }
            }
        }

        return set.stream().map(c -> c + "").collect(Collectors.toList());
    }

    public static List<String> commonChars1(String[] words){

        char[] chars = new char[26];

        int len = 26;
        char a = 'a';
        for (int i = 0; i < len; i++) {
            chars[i] = (char) (a + i);
        }

        int length = words.length;
        List<Map<Character,Integer>> sums = new ArrayList<>(length);

        for (String word : words) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : word.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            sums.add(map);
        }
        System.out.println(sums);


        return null;
    }

    public static List<String> commonCharsCopy(String[] words) {
        int[] minfreq = new int[26];
        Arrays.fill(minfreq, Integer.MAX_VALUE);
        for (String word : words) {
            int[] freq = new int[26];
            int length = word.length();
            for (int i = 0; i < length; ++i) {
                char ch = word.charAt(i);
                ++freq[ch - 'a'];
            }
            for (int i = 0; i < 26; ++i) {
                minfreq[i] = Math.min(minfreq[i], freq[i]);
            }
        }

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 26; ++i) {
            for (int j = 0; j < minfreq[i]; ++j) {
                ans.add(String.valueOf((char) (i + 'a')));
            }
        }
        return ans;
    }

}
