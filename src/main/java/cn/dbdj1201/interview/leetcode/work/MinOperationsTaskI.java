package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Author: yz1201
 * @Date: 2022/1/26 14:27
 */
@Slf4j
public class MinOperationsTaskI {
    public static void main(String[] args) {
//        String s = "11111111";
        String s = "10010100";

        System.out.println(minOperations1(s));

//        int a = 1;
//        int b = 2;
//        char c = '1';
//        char d = '2';
//        System.out.println(a ^ b);
//        System.out.println(c ^ d);
    }

    public static int minOperations(String s) {
        int count = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == '0') count++;
        }

        return -1;
    }

    public static int minOperations1(String s) {
        int len = s.length();
        int index = 0;
        int count = 0;
        while (index < len) {
            if (index + 1 < len && s.charAt(index) == s.charAt(index + 1)) {
                count++;
                index += 2;
                continue;
            }
            index++;
        }
        System.out.println(count);
        return count;
    }

    public static int minOperationsCopyKing(String s) {
        int len = s.length();

        int count1 = 0, count2 = 0;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) % 2 == i % 2) count1++;
            else count2++;
        }
        return Math.min(count1, count2);
    }
}
