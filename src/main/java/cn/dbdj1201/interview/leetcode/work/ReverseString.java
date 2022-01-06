package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2022/1/6 14:07
 */
@Slf4j
public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'a', 'e', 'i', 'o', 'u'};
        reverseString2(s);
    }

    public static void reverseString(char[] s) {
        int length = s.length;
        StringBuilder sb = new StringBuilder();
        String string = Arrays.toString(s);
        System.out.println(string);
        s = new StringBuilder(string).reverse().toString().toCharArray();
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString1(char[] s) {
        int length = s.length;
        StringBuilder sb = new StringBuilder();
        for (char c : s) {
            sb.append(c);
        }
        sb.reverse();
        for (int i = 0; i < length; i++) {
            s[i] = sb.charAt(i);
        }
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString2(char[] s) {
        int len = s.length;
        char[] res = new char[len];

        System.arraycopy(s, 0, res, 0, len);

        for (int i = 0; i < len; i++) {
            s[i] = res[len - i - 1];
        }

        System.out.println(Arrays.toString(s));

    }
}
