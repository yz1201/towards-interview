package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/12/13 14:04
 */
@Slf4j
public class S2697 {

    public String makeSmallestPalindromeCopy(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                arr[left] = arr[right] = (char) Math.min(arr[left], arr[right]);
            }
            ++left;
            --right;
        }
        return new String(arr);
    }
}
