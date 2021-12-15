package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2021/12/15 10:42
 */
@Slf4j
public class LongestCommonSubString {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println("result -"+getSubString(strs));
    }

    public static String getSubString(String[] strs) {
        if (strs.length < 1) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        int minLen = strs[0].length();
        for (String str : strs) {
            minLen = Math.min(str.length(), minLen);
        }

        StringBuilder stringBuilder = new StringBuilder();
        String temp = strs[0];
        for (int i = 0; i < minLen; i++) {
            boolean singleCharResult = true;
            for (String str : strs) {
                if (str.charAt(i) != temp.charAt(i)) {
                    singleCharResult = false;
                    break;
                }
            }

            if (singleCharResult) {
                log.info("prefix add char {}", temp.charAt(i));
                stringBuilder.append(temp.charAt(i));
            }else{
                break;
            }
        }

        return stringBuilder.toString();
    }
}
