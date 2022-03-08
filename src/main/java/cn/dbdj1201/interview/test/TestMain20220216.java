package cn.dbdj1201.interview.test;

import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;



import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;

/**
 * @Author: yz1201
 * @Date: 2022/2/16 8:53
 */
@Slf4j
public class TestMain20220216 {

    public static void main(String[] args) throws ParseException {
//        Files.walkFileTree(Paths.get(""), EnumSet.of(fo));evop

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2022-03-08 10:17:00");

        System.out.println(date.getTime());
//        System.out.println(System.currentTimeMillis());
//        String n = "164118038300";
//        long d = 1673638200000l;
//        System.out.println(Long.MAX_VALUE);
        Calendar instance = Calendar.getInstance();
//        instance.set(2022,2,5);
//        instance.setTimeInMillis(d);
        instance.setTime(date);
        System.out.println(instance.getTime());


    }
}
