package cn.dbdj1201.interview.leetcode.work.simple;

import com.alibaba.druid.sql.visitor.functions.Char;

import java.util.*;

/**
 * @Author: yz1201
 * @Date: 2022/8/2 22:20
 */
public class Q1160 {

    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> dicMap = new HashMap<>();
        for (char c : chars.toCharArray()) {
            dicMap.put(c, dicMap.getOrDefault(c, 0) + 1);
        }
        int length = words.length;
        boolean[] allKill = new boolean[length];
        int res = 0;
        for (int i = 0; i < length; i++) {
            allKill[i] = true;
            Map<Character, Integer> charMap = new HashMap<>();
            for (char c : words[i].toCharArray()) {
                charMap.put(c,charMap.getOrDefault(c,0) + 1);
            }

            for (Character character : charMap.keySet()) {
                if (!dicMap.containsKey(character) || charMap.get(character) > dicMap.get(character)){
                    allKill[i] = false;
                    break;
                }
            }

            if (allKill[i]) {
                res += words[i].length();
            }
        }
        return res;
    }
}
