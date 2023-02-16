package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

/**
 * @Author: yz1201
 * @Date: 2022/7/5 9:52
 */
@Slf4j
public class MyCalendar1 {

    TreeSet<int[]> booked;

    public MyCalendar1() {
        booked = new TreeSet<>(Comparator.comparingInt(a -> a[0]));
    }

    public boolean book(int start, int end) {
        if (booked.isEmpty()) {
            booked.add(new int[]{start, end});
            return true;
        }
        int[] tmp = {end, 0};
        int[] arr = booked.ceiling(tmp);
        int[] prev = arr == null ? booked.last() : booked.lower(arr);
        if (arr == booked.first() || Objects.requireNonNull(booked.lower(tmp))[1] <= start) {
            booked.add(new int[]{start, end});
            return true;
        }
        return false;
    }

}
