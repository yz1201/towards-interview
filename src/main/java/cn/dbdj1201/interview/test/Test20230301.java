package cn.dbdj1201.interview.test;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2023/3/1 9:35
 */
@Slf4j
public class Test20230301 {

    public static void main(String[] args) {

        int num = 10000;

        List<LocalDate> dateList = new ArrayList<>();

        LocalDate ld1 = LocalDate.of(2023, 1,20);
        LocalDate ld2 = LocalDate.of(2023, 3,20);
        LocalDate ld3 = LocalDate.of(2023, 3,23);
        LocalDate ld4 = LocalDate.of(2023, 7,10);

        dateList.add(ld1);
        dateList.add(ld2);
        dateList.add(ld3);
        dateList.add(ld4);

        dateList.stream().sorted((d1,d2) ->{
            if (d1.isAfter(d2)){
                return 1;
            }else if (d1.isBefore(d2)){
                return -1;
            }else {
                return 0;
            }
        }).forEach(System.out::println);
    }
}
