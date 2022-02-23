package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yz1201
 * @Date: 2022/2/23 14:25
 */
@Slf4j
public class DayOfYearTask {

    public static void main(String[] args) throws ParseException {
        System.out.println(dayOfYear1("2022-01-23"));
        System.out.println(dayOfYear1("2022-12-23"));
        System.out.println(dayOfYear1("2022-06-23"));
    }

    public static int dayOfYear(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(date);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(parse);
//        calendar.

        return -1;
    }

    public static int dayOfYear1(String date) throws ParseException {
        String[] split = date.split("-");
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int ans = Integer.parseInt(split[2]);
        month--;
        Map<Integer, Integer> monMap = new HashMap<>();
        monMap.put(1, 31);
        monMap.put(3, 31);
        monMap.put(5, 31);
        monMap.put(7, 31);
        monMap.put(8, 31);
        monMap.put(10, 31);
        monMap.put(12, 31);
        monMap.put(4, 30);
        monMap.put(6, 30);
        monMap.put(9, 30);
        monMap.put(11, 30);
        while (month > 0) {
            if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    ans += 29;
                } else {
                    ans += 28;
                }
            } else {
                ans += monMap.get(month);
            }
            month--;
        }
        return ans;
    }
}
