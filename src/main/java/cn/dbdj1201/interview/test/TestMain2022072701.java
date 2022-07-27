package cn.dbdj1201.interview.test;

import cn.dbdj1201.interview.leetcode.work.middle.Question592;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2022/7/27 15:18
 */
@Slf4j
public class TestMain2022072701 {

    public static void main(String[] args) {
//        double d1 = 1 / 3d;
//        double d2 = 1 / 2d;
//        System.out.println(d1 - d2);
//        System.out.println(1 / 6d);

        String s = "123";
//        System.out.println(s.substring(3,10));

        Question592 question592 = new Question592();
//        System.out.println(question592.fractionAdditionV1("-1/2+1/2"));
//        System.out.println(question592.fractionAdditionV1("-1/2+1/2+1/3"));
//        System.out.println(question592.fractionAdditionV1("1/3+1/3"));
        System.out.println(question592.fractionAdditionCopyV1("-1/2+1/2+1/2+1/2+1/2+1/2+1/2+1/2+1/2+1/2+1/2+1/2+1/2+1/2+1/2"));

//        String s1= "1+2";
//        System.out.println(Arrays.toString(s1.split("\\+")));
//        String x = Arrays.toString(s1.split("-"));
//        System.out.println(x);
//        System.out.println(x.equals(s1));

    }

}
