package cn.dbdj1201.interview.test;

import cn.dbdj1201.interview.leetcode.work.simple.S448;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/10/31 11:26
 */
@Slf4j
public class T448 {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        S448 s448 = new S448();
        System.out.println(s448.findDisappearedNumbersCopy(nums));
    }
}
