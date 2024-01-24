package cn.dbdj1201.interview.test.simple;

import cn.dbdj1201.interview.leetcode.work.simple.S2788;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2024/1/24 10:07
 */
@Slf4j
public class T2788 {
    public static void main(String[] args) {
      String[]  words =
              {"one.two.three","four.five","six"};
        S2788 s2788 = new S2788();
        s2788.splitWordsBySeparator(List.of(words), '.').forEach(System.out::println);
    }
}
