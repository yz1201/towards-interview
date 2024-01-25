package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2024/1/25 13:58
 */
@Slf4j
public class S2859 {

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int score = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (counter(i) == k){
                score += nums.get(i);
            }
        }
        return score;
    }

    private int counterV1(int num) {
        int count = 0;
        while (num != 0) {
            num &= (num - 1);
            count++;
        }
        return count;
    }

    private int counterV2(int num) {
        int count = 0;
        while (num != 0) {
            if ((num & 1) == 1)
                count++;
           num/=2;
        }
        return count;
    }

    private int counter(int num) {
        int count = 0;
        while (num != 0) {
            if(num %2 != 0){
                count++;
            }
            num/=2;
        }
        return count;
    }
}
