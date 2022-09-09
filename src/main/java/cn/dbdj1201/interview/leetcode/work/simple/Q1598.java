package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/9/9 15:30
 */
@Slf4j
public class Q1598 {

    public int minOperations(String[] logs) {
        int sum = 0;
        for (String s : logs) {
            switch (s) {
                case "./":
                    sum += 0;
                    break;
                case "../":
                    if (sum > 0) {
                        sum -= 1;
                    }
                    break;
                default:
                    sum++;
                    break;
            }
        }
        return sum;
    }

}
