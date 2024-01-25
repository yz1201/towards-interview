package cn.dbdj1201.interview.test.simple;

import cn.dbdj1201.interview.leetcode.work.simple.S2784;
import cn.dbdj1201.interview.leetcode.work.simple.S2859;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2024/1/25 14:29
 */
@Slf4j
public class T2859 {

    public static void main(String[] args) {
        S2859 s2859 = new S2859();
//        s2859.sumIndicesWithKSetBits(List.of( 5, 10, 1, 5, 2), 1);
        S2784 s2784 = new S2784();
        int[] nums = {2,1,3,3};
        System.out.println(s2784.isGood(nums));
    }
}
