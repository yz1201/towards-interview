package cn.dbdj1201.interview.leetcode.work;

import cn.hutool.core.util.StrUtil;
import com.alibaba.druid.sql.visitor.functions.Char;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

/**
 * @Author: yz1201
 * @Date: 2021/12/30 9:36
 */
@Slf4j
public class JudgePalindromeTask {

    public static void main(String[] args) {
//        int[] nums = {1, 2, 3};
//        int[] numbers = new int[3];
//        System.arraycopy(nums, 0, numbers, -2, 3);

//        System.out.println(isPalindrome1(" das :==- sAd-"));
        System.out.println(isPalindrome("Marge, let's \"[went].\" I await {news} telegram."));
    }

    public static boolean isPalindrome(String s) {
        System.out.println("raw-"+s);
        String reverse;
        reverse = s.replaceAll(" ", "").toUpperCase();
        int length = reverse.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (reverse.charAt(i) - '0' <= 9 && reverse.charAt(i) - '0' >= 0) {
                sb.append(reverse.charAt(i));
            } else if (reverse.charAt(i) - 'A' >= 0 && reverse.charAt(i) - 'A' < 26) {
                sb.append(reverse.charAt(i));
            }
        }
        System.out.println(sb);
        char[] chars = sb.toString().toCharArray();
        int len = chars.length;
        char[] reverseCs = new char[len];
        for (int i = len; i > 0; i--) {
            reverseCs[len - i] = chars[i - 1];
        }
        System.out.println(new String(reverseCs));
        return StrUtil.reverse(sb.toString()).equals(sb.toString());
    }

    private static String strFilter(String s) {
        s = s.trim().replaceAll(" ", "").toLowerCase(Locale.ROOT);
        StringBuilder sb = new StringBuilder();


        return "";
    }

    public static boolean isPalindrome1(String s) {
        s = s.replaceAll(" ", "").toUpperCase();
        int length = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) - '0' <= 9 && s.charAt(i) - '0' >= 0) {
                sb.append(s.charAt(i));
            } else if (s.charAt(i) - 'A' >= 0 && s.charAt(i) - 'A' <= 26) {
                sb.append(s.charAt(i));
            }
        }
        char[] chars = sb.toString().toCharArray();
        int len = chars.length;
        char[] reverseCs = new char[len];
        for (int i = len; i > 0; i--) {
            reverseCs[len - i] = chars[i - 1];
        }
        return new String(reverseCs).equals(sb.toString());
    }
}
