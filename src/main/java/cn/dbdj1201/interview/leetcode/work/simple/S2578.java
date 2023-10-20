package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2023/10/19 10:03
 */
@Slf4j
public class S2578 {
    public int splitNum(int num) {
        //250112025
        int left = 0;
        String numStr = String.valueOf(num);
        int right = numStr.length();
        int mid;
        if (right % 2 == 0) {
            mid = right / 2 - 1;
        } else {
            mid = right / 2;
        }
        while (mid > 0){

            mid--;
        }
        return 0;
    }

    public int splitNumCopy(int num) {
        char[] stnum = Integer.toString(num).toCharArray();
        Arrays.sort(stnum);
        int num1 = 0, num2 = 0;
        for (int i = 0; i < stnum.length; ++i) {
            if (i % 2 == 0) {
                num1 = num1 * 10 + (stnum[i] - '0');
            } else {
                num2 = num2 * 10 + (stnum[i] - '0');
            }
        }
        return num1 + num2;
    }

}
