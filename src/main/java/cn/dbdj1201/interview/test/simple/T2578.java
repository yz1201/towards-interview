package cn.dbdj1201.interview.test.simple;

import cn.dbdj1201.interview.leetcode.work.simple.S2578;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @Author: yz1201
 * @Date: 2023/10/20 14:50
 */
@Slf4j
public class T2578 {

    public static void main(String[] args) {
        S2578 s2578 = new S2578();
        System.out.println(s2578.splitNumCopy(123456));

        String text = LocalDate.now().toString();
        System.out.println(text.replaceAll("-", ""));
//        System.out.println(LocalDate.parse(text, DateTimeFormatter.ofPattern("yyyyMMdd")));
    }
}
