package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2021/12/23 21:21
 */
@Slf4j
public class AddBinaryTask {

    public static void main(String[] args) {

    }

    public static String addBinary(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        boolean flag = aLen > bLen;
        int len = Math.max(aLen, bLen);
        int minLen = Math.min(aLen, bLen);
        char[] cs = new char[len];
        boolean isAdd = false;
        for (int i = len - minLen; i < len; i++) {

        }


        for (int i = 0; i < len - minLen; i++) {
            if (flag) {
                cs[i] = a.toCharArray()[i];
            } else {
                cs[i] = b.toCharArray()[i];
            }
        }


        return null;
    }

    public static String addBinary1(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int n = Math.max(a.length(), b.length()), carry = 0;
        for (int i = 0; i < n; ++i) {
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            ans.append((char) (carry % 2 + '0'));
            carry /= 2;
        }
        if (carry > 0) {
            ans.append('1');
        }
        ans.reverse();
        return ans.toString();
    }
}
