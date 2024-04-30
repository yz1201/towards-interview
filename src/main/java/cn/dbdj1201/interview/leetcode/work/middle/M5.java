package cn.dbdj1201.interview.leetcode.work.middle;

import java.util.HashMap;
import java.util.Map;

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

    public static void main(String[] args) {
        //两头挤
        System.out.println(longestPalindromeV1("aaaabcaaaaaaaaaaaabbbbb"));
    }
}
