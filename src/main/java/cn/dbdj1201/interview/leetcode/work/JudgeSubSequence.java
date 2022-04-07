package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yz1201
 * @Date: 2022/4/7 16:22
 */
@Slf4j
public class JudgeSubSequence {
    public static void main(String[] args) {
        String s = "test";
        s = s.replace("t", "");
        System.out.println(s);
        System.out.println(s.contains("t"));
    }

    public static boolean isSubsequence(String s, String t) {
        int len = s.length();
        StringBuilder sb = new StringBuilder(t);
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (!t.contains(s.charAt(i) + "")) {
                return false;
            } else {
                map.put(s.charAt(i), i);
            }

        }


        return false;
    }


    public static boolean isSubsequenceCopy(String s, String t) {
        int n = s.length(), m = t.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;
    }

    public static boolean isSubsequenceCopy1(String s, String t) {
        int n = s.length(), m = t.length();

        int[][] f = new int[m + 1][26];
        for (int i = 0; i < 26; i++) {
            f[m][i] = m;
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < 26; j++) {
                if (t.charAt(i) == j + 'a')
                    f[i][j] = i;
                else
                    f[i][j] = f[i + 1][j];
            }
        }
        int add = 0;
        for (int i = 0; i < n; i++) {
            if (f[add][s.charAt(i) - 'a'] == m) {
                return false;
            }
            add = f[add][s.charAt(i) - 'a'] + 1;
        }
        return true;
    }


}
