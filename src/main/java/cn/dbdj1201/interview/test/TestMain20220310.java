package cn.dbdj1201.interview.test;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2022/3/10 14:45
 */
@Slf4j
public class TestMain20220310 {
    public static void main(String[] args) {


        List<String> test= new ArrayList<>();
        int len  = 100;
        for (int i = 0; i < len; i++) {
            test.add(""+i);
        }
        System.out.println(test);
        System.out.println(test.subList(0,10));
        System.out.println(test.subList(10,1210));
    }
}
