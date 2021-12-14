package cn.dbdj1201.interview.leetcode.bitcal;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2021/6/18 9:25
 */
public class MaxinumProductOfWordLengths {
    /*
    给定多个字母串，求其中任意两个字母串的长度乘积的最大值，且这两个字母串不能含有相
同字母。

   {“aa”，"bcd"} 怎么说 现有逻辑无法识别单串叠词。
     */

    public static void calBit(String[] words) {

        int num = words.length;
        int[] mark = new int[num];
        for (int i = 0; i < num; i++) {
            int len = words[i].length();
            for (int j = 0; j < len; j++) {
                mark[i] |= (1 << (words[i].charAt(j) - 'a'));
            }
        }

        int maxLen = 0;
        int len;

        for (int i = 0; i < mark.length; i++) {

            for (int j = i + 1; j < num; j++) {

                if ((mark[i] & mark[j]) == 0) {
                    len = words[i].length() * words[j].length();
                    maxLen = Math.max(maxLen, len);
                }

            }

        }

        System.out.println(maxLen);
        Arrays.stream(mark).forEach(System.out::println);

    }

    public static void main(String[] args) {
//        String[] words = {"a", "ab", "abc", "d", "cd", "bcd", "abcd"};
        String[] words = {"aa","bcd"};
        calBit(words);
    }
}
