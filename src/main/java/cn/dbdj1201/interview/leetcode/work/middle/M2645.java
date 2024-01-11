package cn.dbdj1201.interview.leetcode.work.middle;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yz1201
 * @Date: 2024/1/11 9:08
 */
@Slf4j
public class M2645 {

    public int addMinimum(String word) {
        //abc 3a 2b 1c
        Map<Character, Integer> counter = new HashMap<>();
        for (char c : word.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        int aNum = counter.getOrDefault('a', 0);
        int bNum = counter.getOrDefault('b', 0);
        int cNum = counter.getOrDefault('c', 0);
        if (aNum == bNum && aNum == cNum) return 0;
        int max = Math.max(aNum, Math.max(bNum, cNum));
        return max * 3 - aNum - bNum - cNum;
    }

    public int addMinimumV1(String word) {
        //aaaa

        return 0;
    }

    public int addMinimumCp(String word) {
        int n = word.length();
        int[] d = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            d[i] = d[i - 1] + 2;
            if (i > 1 && word.charAt(i - 1) > word.charAt(i - 2)) {
                d[i] = d[i - 1] - 1;
            }
        }
        return d[n];
    }

    public int addMinimumCp2(String word) {
        int n = word.length();
        int res = word.charAt(0) - word.charAt(n - 1) + 2;
        for (int i = 1; i < n; i++) {
            res += (word.charAt(i) - word.charAt(i - 1) + 2) % 3;
        }
        return res;
    }


}
