package cn.dbdj1201.interview.test.simple;

import cn.dbdj1201.interview.leetcode.work.simple.S1295;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/12/6 14:06
 */
@Slf4j
public class T1295 {

    public static void main(String[] args) {
        S1295 s1295 = new S1295();
        int[] nums = {12,345,2,6,7896};
        int[] nums1 = {555,901,482,11771};
        System.out.println(s1295.findNumbers(nums1));
    }
}
