package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2022/1/28 18:48
 */
@Slf4j
public class NumberOfDaysTask {
    public static void main(String[] args) throws ParseException {
        numberOfDays(1984, 12);
    }

    public static int numberOfDays(int year, int month) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        System.out.println(calendar.getWeekYear());
        System.out.println(calendar.getTime());
        return -1;
    }

    public static int numberOfDays1(int year, int month) {

        List<Integer> bigMonth = new ArrayList<>();
        List<Integer> smallMonth = new ArrayList<>();
        bigMonth.add(1);
        bigMonth.add(3);
        bigMonth.add(5);
        bigMonth.add(7);
        bigMonth.add(8);
        bigMonth.add(10);
        bigMonth.add(12);
        smallMonth.add(4);
        smallMonth.add(6);
        smallMonth.add(9);
        smallMonth.add(11);

        if (bigMonth.contains(month)) return 31;
        else if (smallMonth.contains(month))return 30;

        if (isRun(year)){
           return 29;
        }else {
            return 28;
        }
    }

    public static boolean isRun(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
