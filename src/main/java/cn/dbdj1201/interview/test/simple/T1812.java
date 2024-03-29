package cn.dbdj1201.interview.test.simple;

import cn.dbdj1201.interview.leetcode.work.simple.Q1812;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2022/12/8 15:46
 */
@Slf4j
public class T1812 {

    static class TestObj{

    }

    public static void main(String[] args) {
//        System.out.println(new Q1812().squareIsWhite("a8"));
//        System.out.println(new Q1812().squareIsWhite("a1"));
//        System.out.println(new Q1812().squareIsWhite("a2"));
//        System.out.println(new Q1812().squareIsWhite("a3"));
//        System.out.println(new Q1812().squareIsWhite("b3"));
//        System.out.println(new Q1812().squareIsWhite("c3"));
//        System.out.println(new Q1812().squareIsWhite("d3"));
//        testOverflow(1000);

        List<TestObj> testOOM = new ArrayList<>();
//        while (true){
//            testOOM.add(new TestObj());
//        }

        String s = new StringBuilder().append("ja").append("va").toString();
        String s1 = new StringBuilder().append("ja1").append("va1").toString();

        System.out.println(s.intern() == s);
        System.out.println(s1.intern() == s1);

//        String str2 = "SEUCalvin";//新加的一行代码，其余不变
//        String str1 = new String("SEU")+ new String("Calvin");
//        System.out.println(str1.intern() == str1);
//        System.out.println(str1 == "SEUCalvin");

    }

    static void testOverflow(long sum){
        long num = 100L;
        while (true){
            sum *= num;
            testOverflow(sum);
        }
    }
}
