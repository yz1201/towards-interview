package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2022/7/19 14:55
 */
@Slf4j
public class MyCalendarTwo {

    /*
    ["MyCalendarTwo","book","book","book","book","book","book"]
[[],[10,20],[50,60],[10,40],[5,15],[5,10],[25,55]]
     */
    public static void main(String[] args) {
        MyCalendarTwo myCalendarTwo = new MyCalendarTwo();
        System.out.println(myCalendarTwo.book(10, 20));
        System.out.println(myCalendarTwo.book(10, 20));
        System.out.println(myCalendarTwo.book(10, 20));
        System.out.println(myCalendarTwo.book(10, 20));
    }

    List<Map<Integer, Integer>> orderArr;

    public MyCalendarTwo() {
        orderArr = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        System.out.println(orderArr);
//        orderArr.stream().mapToInt(order->{
//            order.entrySet().stream().filter(entry -> )
//        })
        int sum = 1;
        for (Map<Integer, Integer> map : orderArr) {
            sum += map.entrySet().stream().filter(entry -> start < entry.getValue() && end > entry.getKey()).count();
        }

        if (sum < 4) {
            orderArr.add(Map.of(start, end));
            return true;
        }
        return false;
    }
}