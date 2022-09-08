package cn.dbdj1201.interview.test;

import java.util.Random;

/**
 * @Author: yz1201
 * @Date: 2022/9/2 14:50
 */
public class TestMain2022090201 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextDouble());
        double x = random.nextDouble();
        String val = x + "";


        System.out.println(val.substring(2, 8));
    }
}
