package cn.dbdj1201.interview.leetcode.work.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yz1201
 * @Date: 2022/9/27 15:40
 */
public class Q0102 {

    public boolean CheckPermutation(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        if (l1 != l2) return false;

        for (char c : s2.toCharArray()) {
            if (!s1.contains(c + "")) return false;
        }

        Map<Character, Integer> charNum1= new HashMap<>();
        Map<Character, Integer> charNum2 = new HashMap<>();

        for (char c : s1.toCharArray()) {
            charNum1.put(c, charNum1.getOrDefault(c, 0) + 1);
        }


        for (char c : s2.toCharArray()) {
            charNum2.put(c, charNum2.getOrDefault(c, 0) + 1);
        }

        for (char c : s1.toCharArray()) {
            if (charNum1.getOrDefault(c,0) != charNum2.getOrDefault(c,0)) return false;
        }

        return true;
    }
}
