package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yz1201
 * @Date: 2024/1/8 14:32
 */
@Slf4j
public class S205 {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        // eggc adde
        for (int i = 0; i < s.length(); i++) {
            int diff = s.charAt(i) - t.charAt(i);

        }
        return false;
    }

    public boolean isIsomorphicCp(String s, String t) {
        Map<Character, Character> s2t = new HashMap<Character, Character>();
        Map<Character, Character> t2s = new HashMap<Character, Character>();
        int len = s.length();
        for (int i = 0; i < len; ++i) {
            char x = s.charAt(i), y = t.charAt(i);
            if ((s2t.containsKey(x) && s2t.get(x) != y) || (t2s.containsKey(y) && t2s.get(y) != x)) {
                return false;
            }
            s2t.put(x, y);
            t2s.put(y, x);
        }
        return true;
    }

}
