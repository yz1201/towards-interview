package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2022/11/3 14:32
 */
@Slf4j
public class Q1668 {

    public int maxRepeating(String sequence, String word) {
        int repeatTimes = 0;
        int sLen = sequence.length();
        int wLen = word.length();

        if (sLen < wLen) return repeatTimes;
        if (sLen == wLen && !sequence.equals(word)) return repeatTimes;

        if (!sequence.contains(word)) return repeatTimes;

        int left = 0;
        int right = sLen - 1;
        int index = 0;
        while (left <= right && index <= right) {
            if (sequence.substring(left, index).equals(word)) {
                repeatTimes++;
                break;
            } else {
                if (index == right) {
                    left++;
                    index = 0;
                }
                index++;
            }
        }
        return repeatTimes;
    }

//    public int maxRepeatingV1(String sequence, String word) {
//        int repeatTimes = 0;
//        if (sequence.contains(word)) {
//            int sLen = sequence.length();
//            int wLen = word.length();
//            for (int i = 0; i < sLen; i++) {
//                int left = i;
//                int right = wLen;
//                if (sequence.substring(left, right).equals(word)) repeatTimes++;
//                else {
//                    left++;
//                }
//
//            }
//
//
//        }
//        return repeatTimes;
//    }

    public int maxRepeatingCopy1(String sequence, String word) {
        int n = sequence.length(), m = word.length();
        if (n < m) {
            return 0;
        }

        int[] f = new int[n];
        for (int i = m - 1; i < n; ++i) {
            boolean valid = true;
            for (int j = 0; j < m; ++j) {
                if (sequence.charAt(i - m + j + 1) != word.charAt(j)) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                f[i] = (i == m - 1 ? 0 : f[i - m]) + 1;
            }
        }

        return Arrays.stream(f).max().getAsInt();
    }

}
