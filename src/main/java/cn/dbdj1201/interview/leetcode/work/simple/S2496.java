package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.regex.Pattern;

/**
 * @Author: yz1201
 * @Date: 2023/8/4 9:11
 */
@Slf4j
public class S2496 {

    public int maximumValue(String[] strs) {
        int minVal = 0;
        String pattern = ".*[a-z]+.*";
        for (String word : strs) {
            if (Pattern.matches(pattern, word)){
                minVal = Math.max(minVal, word.length());
            }else{
                minVal = Math.max(minVal, Integer.parseInt(word));
            }
        }
        return minVal;
    }
}
