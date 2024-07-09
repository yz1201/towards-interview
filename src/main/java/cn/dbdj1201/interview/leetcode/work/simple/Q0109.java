package cn.dbdj1201.interview.leetcode.work.simple;

import java.util.Arrays;
import java.util.Map;

/**
 * @Author: yz1201
 * @Date: 2022/9/29 16:19
 */
public class Q0109 {

    public boolean isFlipedString(String s1, String s2) {
//        List<Map>
        if (s1.length()!=s2.length()) return false;
        char[] cArr1 = s1.toCharArray();
        char[] cArr2 = s2.toCharArray();
        Arrays.sort(cArr1);
        Arrays.sort(cArr2);
        return Arrays.toString(cArr1).equals(Arrays.toString(cArr2)); 
    }

    public boolean isFlipedStringV1(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        if (m != n) {
            return false;
        }
        if (n == 0) {
            return true;
        }
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (s1.charAt((i + j) % n) != s2.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;
    }

}
