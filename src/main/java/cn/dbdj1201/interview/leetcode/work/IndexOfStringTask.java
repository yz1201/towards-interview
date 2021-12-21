package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2021/12/21 10:37
 */
@Slf4j
public class IndexOfStringTask {

    public static void main(String[] args) {
        String aStr = "abbbbbc";
        String bStr = "bc";

        System.out.println(strStr1(aStr, bStr));
    }

    public static int strStr(String haystack, String needle) {

        int former = haystack.length();
        int latter = needle.length();
        if (latter < 1 || former < 1 || former < latter) {
            return 0;
        }

        int index = 0;
        int result = 0;
        int right = 0;
        boolean flag = true;
        while (index + latter < former) {
            if (haystack.charAt(index) == needle.charAt(right)) {
                result = index;
                for (int i = right; i < right + latter; i++) {
                    if (haystack.charAt(i) != needle.charAt(i)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return result;
                }
                right++;
            }
            index++;
        }
        return -1;
    }

    public static int strStr1(String haystack, String needle) {
        int former = haystack.length();
        int latter = needle.length();

        for (int i = 0; i + latter <= former; i++) {
            boolean flag = true;
            for (int i1 = 0; i1 < latter; i1++) {
                if (haystack.charAt(i1 + i) != needle.charAt(i1)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }
}
