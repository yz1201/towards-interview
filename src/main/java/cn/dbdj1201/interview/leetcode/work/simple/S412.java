package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2023/4/10 15:11
 */
@Slf4j
public class S412 {

    public List<String> fizzBuzz(int n) {
        String fizz = "Fizz";
        String buzz = "Buzz";
        String fb = "FizzBuzz";
        List<String> strings = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                strings.add(fizz);
            } else if (i % 3 != 0 && i % 5 == 0) {
                strings.add(buzz);
            } else if (i % 3 == 0 && i % 5 == 0) {
                strings.add(fb);
            } else {
                strings.add(i + "");
            }
        }
        return strings;
    }
}
