package cn.dbdj1201.interview.test.medium;

import cn.dbdj1201.interview.leetcode.work.middle.M2352;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2023/6/6 8:42
 */
@Slf4j
public class T2352 {

    public static void main(String[] args) {
//        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] nums = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};

//        System.out.println(Arrays.deepToString(nums));
//        System.out.println(nums[2][1]);

//        System.out.println(Arrays.toString(nums[0]));
//        System.out.println(Arrays.toString(nums[1]));
//        System.out.println(Arrays.toString(nums[2]));
        M2352 m2352 = new M2352();
        System.out.println(m2352.equalPairs(nums));
    }
}
