package cn.dbdj1201.interview.test.simple;

import cn.dbdj1201.interview.leetcode.work.simple.S202;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2023/4/11 16:00
 */
@Slf4j
public class T202 {

    public static void main(String[] args) {
        S202 s202 = new S202();

//        System.out.println(s202.isHappy(2));
//        System.out.println(s202.isHappyCopy(Integer.MAX_VALUE));
        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        nums.stream().filter(num -> num > 7).sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);

        nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(nums);
        nums.sort(Comparator.reverseOrder());
        System.out.println("pver" + nums);

        System.out.println(nums.stream().filter(num -> num > 20).sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        List<String> arr1 = new ArrayList<>();
        arr1.add("1");
        arr1.add("1");
        arr1.add("1");
        List<String> arr2 = new ArrayList<>();
        arr1.addAll(arr2);
        System.out.println(arr1);

        /*
        1 2 3 4
        5 6 7 8
         */
        System.out.println("~~~~");
        System.out.println(1 % 4);
        System.out.println(2 % 4);
        System.out.println(3 % 4);
        System.out.println(4 % 4);
        System.out.println(5 % 4);
        System.out.println(6 % 4);
        System.out.println(7 % 4);
        System.out.println(8 % 4);

    }
}
