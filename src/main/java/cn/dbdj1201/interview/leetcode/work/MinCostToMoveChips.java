package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;

/**
 * @Author: yz1201
 * @Date: 2022/7/8 15:23
 */
@Slf4j
public class MinCostToMoveChips {
    public static void main(String[] args) throws ParseException {
//        Date date = new Date();
//
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date parse = simpleDateFormat.parse("2022-07-12 24:00:00");
//        long gap = parse.getTime() - date.getTime();
//        System.out.println(gap);
//        int i = 1000 * 60 * 60 * 24;
//        System.out.println(i);
//        gap = gap / i;
//        System.out.println(gap);

        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate d1 = LocalDate.of(2022, 7, 12);
        LocalDate d2 = LocalDate.of(2022, 7, 12);

        System.out.println(d2);
        System.out.println(now.isBefore(d2));
        String[] split = "2022-07-11".split("-");
//        System.out.println(split.length);
//
//        System.out.println(LocalDate.of(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2])));
    }

    public static int minCostToMoveChips(int[] position) {


        return -1;
    }
}
