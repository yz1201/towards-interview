package cn.dbdj1201.interview.test.simple;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2024/3/1 10:33
 */
@Slf4j
public class S680 {

    public boolean validPalindrome(String s) {
        //abcbc aba
        StringBuilder reverse = new StringBuilder(s).reverse();
        if (reverse.toString().equals(s)) return true;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            StringBuilder temp = new StringBuilder(s.substring(0,i)).append(s.substring(i+1));
            if (temp.toString().equals(temp.reverse().toString()))
                return true;
        }
        return false;
    }

    public boolean validPalindromeCp(String s) {
        int low = 0, high = s.length() - 1;
        while (low < high) {
            char c1 = s.charAt(low), c2 = s.charAt(high);
            if (c1 == c2) {
                ++low;
                --high;
            } else {
                return validPalindromeCp(s, low, high - 1) || validPalindromeCp(s, low + 1, high);
            }
        }
        return true;
    }

    public boolean validPalindromeCp(String s, int low, int high) {
        for (int i = low, j = high; i < j; ++i, --j) {
            char c1 = s.charAt(i), c2 = s.charAt(j);
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }




}
