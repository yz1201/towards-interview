package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: yz1201
 * @Date: 2022/5/18 14:38
 */
@Slf4j
public class FindFirstPalindromeOfArray {

    public static void main(String[] args) {
        System.out.println(unicodeToCN("#\u4e2d\u6587\u8f6c\u7801"));
    }

    public static String firstPalindrome(String[] words) {
        //words = ["abc","car","ada","racecar","cool"]
        for (String word : words) {
            if (isPalindrome(word))
                return word;
        }
        return "";
    }

    private static boolean isPalindrome(String word){
        return new StringBuilder(word).reverse().toString().equals(word);
    }


    /**
     * Unicode转 汉字字符串
     *
     * @param str
     * @return
     */
    public static String unicodeToCN(String str) {
        Pattern pattern = Pattern.compile("(\\\\u(\\p{XDigit}{4}))");
        Matcher matcher = pattern.matcher(str);
        char ch;
        while (matcher.find()) {
            ch = (char) Integer.parseInt(matcher.group(2), 16);
            str = str.replace(matcher.group(1), ch + "");
        }
        return str;
    }


}
