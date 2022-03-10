package cn.dbdj1201.interview;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2021/1/7 19:18
 */
public class MainTest20210208 {
    public static void main(String[] args) throws ParseException {
        long l = 1673488920000l;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(sdf.format(new Date(l)));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse("2022-03-10 11:20" +
                ":00");
        System.out.println(parse.getTime());


    }


}
