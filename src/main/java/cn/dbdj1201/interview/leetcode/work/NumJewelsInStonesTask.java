package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/2/17 20:07
 */
@Slf4j
public class NumJewelsInStonesTask {
    public static void main(String[] args) {

    }

    public static int numJewelsInStones(String jewels, String stones) {
        int length = stones.length();
        int len = jewels.length();
        int count =0 ;
        for (int i = 0; i < len; i++) {
            int c = jewels.charAt(i);
            for (int j = 0; j < length; j++) {
                if (c == stones.charAt(j)) count++;
            }

        }

        return count;
    }
}
