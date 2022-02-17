package cn.dbdj1201.interview.test;

import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;



import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;

/**
 * @Author: yz1201
 * @Date: 2022/2/16 8:53
 */
@Slf4j
public class TestMain20220216 {

    public static void main(String[] args) {
//        Files.walkFileTree(Paths.get(""), EnumSet.of(fo));evop

        System.out.println(System.currentTimeMillis());
        String n = "164118038300";
        long d = 1644981000000L;
        System.out.println(Long.MAX_VALUE);
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(d);
        System.out.println(instance.getTime());


    }
}
