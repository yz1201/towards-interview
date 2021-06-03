package cn.dbdj1201.interview.leetcode.chapter12;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2021/5/27 10:58
 */
public class Test01 {

    /*
    输入两个字符串，输出一个布尔值，表示两个字符串是否满足条件。
    Input: s = "anagram", t = "nagaram"
    Output: true
     */
    public static boolean strComparator(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        if (len1 != len2) {
            return false;
        }

        int[] countArr = new int[26];
        for (int i = 0; i < len1; i++) {
            countArr[str1.charAt(i) - 'a']++;
            countArr[str2.charAt(i) - 'a']--;
        }
        return Arrays.stream(countArr).noneMatch(i -> i > 0);
    }

    public static void main(String[] args) {
        String s1 = "abecde";
        String s2 = "abcdef";
        System.out.println("result: " + strComparator(s1, s2));
    }
}
