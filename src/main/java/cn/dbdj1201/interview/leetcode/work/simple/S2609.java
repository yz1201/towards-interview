package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/11/8 13:54
 */
@Slf4j
public class S2609 {

    public int findTheLongestBalancedSubstring(String s) {
        //10111110000011
        if (!s.contains("0") || !s.contains("1")){
            return 0;
        }
        int maxLen = s.length();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {


        }
        return 0;
    }

    public int findTheLongestBalancedSubstringCopy(String s) {
        int res = 0;
        int n = s.length();
        int[] count = new int[2];
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                count[1]++;
                res = Math.max(res, 2 * Math.min(count[0], count[1]));
            } else if (i == 0 || s.charAt(i - 1) == '1') {
                count[0] = 1;
                count[1] = 0;
            } else {
                count[0]++;
            }
        }
        return res;
    }

}
