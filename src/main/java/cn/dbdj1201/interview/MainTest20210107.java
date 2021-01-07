package cn.dbdj1201.interview;

import cn.dbdj1201.interview.design.builder.MBikeBuilder;
import cn.dbdj1201.interview.design.builder.MBikeDirector;
import cn.dbdj1201.interview.design.builder.TroubleBuilder;

import java.time.LocalDateTime;

/**
 * @Author: yz1201
 * @Date: 2021/1/7 19:18
 */
public class MainTest20210107 {
    public static void main(String[] args) {
        TroubleBuilder builder = new TroubleBuilder();

        builder.setName("asd");
        builder.setDate(LocalDateTime.now());
        builder.setDuration("20");
        System.out.println(builder);

        System.out.println(new MBikeDirector(new MBikeBuilder()).getInstance());
    }
}
