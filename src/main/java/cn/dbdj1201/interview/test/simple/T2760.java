package cn.dbdj1201.interview.test.simple;

import cn.dbdj1201.interview.leetcode.work.simple.S2760;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2023/11/16 11:15
 */
@Slf4j
public class T2760 {

    public static void main(String[] args) {
        S2760 s2760 = new S2760();
//        int[] nums = {3, 2, 5, 4};
        int[] nums = { 2, 5, 5};
        s2760.longestAlternatingSubarrayCopy(nums, 5);
        String s = "";
        String s1 = "1002";
        String s2 = "1003";
        String s3 = "1001|@|1002|@|1003|@|1004";
        String s4 = "1002|@|1003";
        String s5 = "1001";
        List<String> list = new ArrayList<>();
        list.add(s);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);


//        list.stream().filter(record ->{
////            return
//        }).forEach(System.out::println);



        String[] split = s1.split("\\|@\\|");
        System.out.println(Arrays.toString(split));
    }
}
