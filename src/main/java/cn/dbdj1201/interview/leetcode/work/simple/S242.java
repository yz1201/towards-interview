package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @Author: yz1201
 * @Date: 2024/7/10 9:23
 */
@Slf4j
public class S242 {

    public static boolean isAnagram(String s, String t) {
//        s.tocha
        if (s.length() != t.length()) return false;
        boolean[] flags = new boolean[s.length()];
        int index = 0;
        for (char c : s.toCharArray()) {
            for (char c1 : t.toCharArray()) {
                if (c == c1) {
                    flags[index] = true;
                    break;
                }
            }
            index++;
        }
        boolean res = true;
        for (boolean flag : flags) {
            res &= flag;
        }
        return res;
    }

    public static boolean isAnagramV1(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] cCounter1 = new int[26];
        int[] cCounter2 = new int[26];
        for (char c : s.toCharArray()) {
            cCounter1[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            cCounter2[c - 'a']++;
        }
        return Arrays.equals(cCounter1, cCounter2);
    }

    public boolean isAnagramCp(String s, String t) {
        int[] ints = new int[26];
        char[] s1 = s.toCharArray();
        for (char c : s1) {
            ints[c - 'a']++;
        }
        char[] t1 = t.toCharArray();
        for (char c : t1) {
            ints[c - 'a']--;
        }
        for (int anInt : ints) {
            if (anInt != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("abcc", "abca"));
    }
}
