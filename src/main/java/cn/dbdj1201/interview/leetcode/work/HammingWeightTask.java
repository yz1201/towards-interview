package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2021/12/29 16:09
 */
@Slf4j
public class HammingWeightTask {

    public static void main(String[] args) {
        int testNum = 3333;
        System.out.println(hammingWeight(testNum));
        System.out.println(Integer.bitCount(testNum));
    }

    public static int hammingWeight(int n) {
        String num = Integer.toBinaryString(n);
        int weight = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) - '0' == 1) {
                weight++;
            }
        }
        return weight;
    }
}
