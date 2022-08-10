package cn.dbdj1201.interview.leetcode.work.simple;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2022/8/10 22:39
 */
public class Q1185 {

    public String dayOfTheWeek(int day, int month, int year) {
        List<String> dayStr = List.of("Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday");
        LocalDate localDate = LocalDate.of(year, month, day);
        int value = localDate.getDayOfWeek().getValue();
        return dayStr.get(value);
    }

    public String dayOfTheWeekCopy(int day, int month, int year){
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        /* 输入年份之前的年份的天数贡献 */
        int days = 365 * (year - 1971) + (year - 1969) / 4;
        /* 输入年份中，输入月份之前的月份的天数贡献 */
        for (int i = 0; i < month - 1; ++i) {
            days += monthDays[i];
        }
        if ((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) && month >= 3) {
            days += 1;
        }
        /* 输入月份中的天数贡献 */
        days += day;
        return week[(days + 3) % 7];

    }

}
