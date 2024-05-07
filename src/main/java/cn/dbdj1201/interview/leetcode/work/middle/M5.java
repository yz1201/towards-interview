package cn.dbdj1201.interview.leetcode.work.middle;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @Author: yz1201
 * @Date: 2024/4/29 8:26
 */
public class M5 {

    public static String longestPalindrome(String s) {
        StringBuilder param = new StringBuilder(s);
        int left = 0, right = param.length();
        // string 0 5
        for (int i = 0; i < right; i++) {
            if (judgePalindrome(param.substring(i))) return param.substring(i);
        }
        return "";
    }

    public static String longestPalindromeV1(String s) {
        StringBuilder param = new StringBuilder(s);
        int len = param.length();
        // string 0 5
        /*
        取出所有可能字符串。
        1 right < left
        2 r- l+?
         */
        Map<Integer, String> paramMap = new HashMap<>();
        for (int left = 0; left < len; left++) {
            // l ++
            int right = len;
            while (left < right) {
                if (judgePalindrome(param.substring(left, right))) {
                    paramMap.put(right - left, param.substring(left, right));
                }
                right--;
            }
        }
        int maxLen = 0;
        if (paramMap.keySet().stream().max(Integer::compareTo).isPresent()) {
            maxLen = paramMap.keySet().stream().max(Integer::compareTo).get();
        }
        return paramMap.get(maxLen);
    }

    private static boolean judgePalindrome(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }

    public static String longestPalindromeCp(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        int maxLen = 1;
        int begin = 0;
        // dp[i][j] 表示 s[i..j] 是否是回文串
        boolean[][] dp = new boolean[len][len];
        // 初始化：所有长度为 1 的子串都是回文串
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        char[] charArray = s.toCharArray();
        // 递推开始
        // 先枚举子串长度
        for (int L = 2; L <= len; L++) {
            // 枚举左边界，左边界的上限设置可以宽松一些
            for (int i = 0; i < len; i++) {
                // 由 L 和 i 可以确定右边界，即 j - i + 1 = L 得
                int j = L + i - 1;
                // 如果右边界越界，就可以退出当前循环
                if (j >= len) {
                    break;
                }

                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                // 只要 dp[i][L] == true 成立，就表示子串 s[i..L] 是回文，此时记录回文长度和起始位置
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }


    public static String longestPalindromeCp1(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }
        return right - left - 1;
    }
    public static void main(String[] args) {
        //两头挤
        System.out.println(longestPalindromeCp("abba"));
//        Optional<Double> o = Optional.empty();
//        Double d= null;
//        System.out.println(o);
//        Optional<Double> d1 = Optional.of(20.01);
//        System.out.println(d1.orElse((double) 0L));
//        System.out.println(d1);
//        System.out.println(o.get());
    }
}
