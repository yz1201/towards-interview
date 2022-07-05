package cn.dbdj1201.interview.thread;

import cn.dbdj1201.interview.leetcode.work.MyCalendar;
import cn.dbdj1201.interview.leetcode.work.MyCalendar1;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/7/5 8:59
 */
@Slf4j
public class TestMain2022070501 {
    //["MyCalendar","book","book","book"]
    //[[],[10,20],[15,25],[20,30]]
    public static void main(String[] args) {
//        MyCalendar calendar = new MyCalendar();
//        System.out.println(calendar.book(10, 20));
//        System.out.println(calendar.book(15, 25));
//        System.out.println(calendar.book(20, 30));
        MyCalendar1 calendar1 = new MyCalendar1();
        calendar1.book(10,20);
        calendar1.book(15,25);
        calendar1.book(20,30);
    }
}
