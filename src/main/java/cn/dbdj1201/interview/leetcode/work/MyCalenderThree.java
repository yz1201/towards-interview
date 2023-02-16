package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2022/7/19 16:03
 */
@Slf4j
class MyCalendarThree {
    List<int[]> booked;
    List<int[]> overlaps;
    /*
      ["MyCalendarTwo","book","book","book","book","book","book"]
  [[],[10,20],[50,60],[10,40],[5,15],[5,10],[25,55]]
       */
    public static void main(String[] args) {
        MyCalendarThree myCalendarTwo = new MyCalendarThree();
        System.out.println(myCalendarTwo.book(10, 20));
        System.out.println(myCalendarTwo.book(50, 60));
        System.out.println(myCalendarTwo.book(10, 40));
        System.out.println(myCalendarTwo.book(5, 15));
//        System.out.println(myCalendarTwo.book(5, 10));
//        System.out.println(myCalendarTwo.book(25, 55));
    }

    public MyCalendarThree() {
        booked = new ArrayList<>();
        overlaps = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] arr : overlaps) {
            int l = arr[0], r = arr[1];
            if (l < end && start < r) {
                return false;
            }
        }
        for (int[] arr : booked) {
            int l = arr[0], r = arr[1];
            if (l < end && start < r) {
                overlaps.add(new int[]{Math.max(l, start), Math.min(r, end)});
            }
        }
        booked.add(new int[]{start, end});
        System.out.println("===========booked==========");
        booked.forEach(arr-> System.out.println(Arrays.toString(arr)));
        System.out.println("===========overlaps==========");
        overlaps.forEach(arr-> System.out.println(Arrays.toString(arr)));
        System.out.println("===========end==========");
        return true;
    }
}
