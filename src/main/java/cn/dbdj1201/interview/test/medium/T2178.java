package cn.dbdj1201.interview.test.medium;

import cn.dbdj1201.interview.leetcode.work.middle.M2178;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2023/7/6 9:47
 */
@Slf4j
public class T2178 {

    public static void main(String[] args) {
        M2178 m2178 = new M2178();
        System.out.println(m2178.maximumEvenSplitCopy(32));
//        System.out.println(m2178.maximumEvenSplitCopy(28));
        List<String> nums = Arrays.asList("6.00","6.00","5.68","5.67","3.00","4.44","5.58");

//        System.out.println(nums.stream().sorted(Comparator.comparingDouble(Double::valueOf)).collect(Collectors.toList()));

//        new StringBuilder()
//        String s = "123456";
//        System.out.println(s.substring(3));

    }
}
