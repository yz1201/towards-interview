package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/4/18 15:33
 */
@Slf4j
public class GcdStrings {

    public static void main(String[] args) {
//        System.out.println(gcdOfStrings("abcabc", "abc"));
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (str2.length() == 0) return "";
        int len1 = str1.length();
        int len2 = str2.length();
        if (len1 % len2 != 0) return "";

        int num = len1 / len2;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(str2);
        }
        if (sb.toString().equals(str1)) return str2;

        return "";
    }

    public static String gcdOfStringsCopy(String str1, String str2) {
        int len1 = str1.length(), len2 = str2.length();
        for (int i = Math.min(len1, len2); i >= 1; --i) { // 从长度大的开始枚举
            if (len1 % i == 0 && len2 % i == 0) {
                String X = str1.substring(0, i);
                if (check(X, str1) && check(X, str2)) {
                    return X;
                }
            }
        }
        return "";
    }

    public static boolean check(String t, String s) {
        int lenx = s.length() / t.length();
        StringBuffer ans = new StringBuffer();
        for (int i = 1; i <= lenx; ++i) {
            ans.append(t);
        }
        return ans.toString().equals(s);
    }


}
