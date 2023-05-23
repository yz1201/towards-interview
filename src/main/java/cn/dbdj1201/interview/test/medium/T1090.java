package cn.dbdj1201.interview.test.medium;

import cn.dbdj1201.interview.leetcode.work.middle.M1090;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/5/23 15:27
 */
@Slf4j
public class T1090 {

    public static void main(String[] args) {
        M1090 m1090 = new M1090();
        int[] values = {5, 4, 3, 2, 1};
        int[] labels = {1, 1, 2, 2, 3};
        System.out.println(m1090.largestValsFromLabelsV1(values, labels, 3, 1));
    }
}
