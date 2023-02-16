package cn.dbdj1201.interview.leetcode.work.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yz1201
 * @Date: 2022/8/11 21:50
 */
public class Q1528 {

    public String restoreString(String s, int[] indices) {
        //[2,0,1]
        StringBuilder ans = new StringBuilder();
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            indexMap.put(indices[i], i);
        }
        for (int i = 0; i < s.length(); i++) {
            ans.append(s.charAt(indexMap.get(i)));
        }
        return ans.toString();
    }
}
