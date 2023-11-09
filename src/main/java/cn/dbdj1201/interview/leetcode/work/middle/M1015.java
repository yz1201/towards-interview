package cn.dbdj1201.interview.leetcode.work.middle;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Executors;

/**
 * @Author: yz1201
 * @Date: 2023/5/10 14:55
 */
@Slf4j
public class M1015 {

    public int smallestRepunitDivByK(int k) {
        int p = 0;
        for (int i = 1; i <= k; i++) {
            p = (p * 10 + 1) % k;
            if (p == 0) {
                return i;
            }
        }
//        Executors.newFixedThreadPool()
        return -1;
    }
}
