package cn.dbdj1201.interview.test.medium;

import cn.dbdj1201.interview.leetcode.work.middle.M503;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2023/12/27 15:17
 */
@Slf4j
public class T503 {

    public static void main(String[] args) {
        M503 m503 = new M503();
        int[] nums = {3, 2, 1, 4};
        System.out.println(Arrays.toString(m503.nextGreaterElementsCp(nums)));

//        Arrays.stream(nums).filter(num -> {
//            if (num >= 4) return true;
//            else if (num <= 1) return false;
//        }).collect(Collectors::toList);
    }
}
