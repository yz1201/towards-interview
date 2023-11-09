package cn.dbdj1201.interview.test;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2023/3/3 15:06
 */
@Slf4j
public class Test20230303 {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        List<String> strings2 = new ArrayList<>();
        strings.add("s");
        strings.add("b");
        strings.add("me");

        strings2.add("a");
        strings2.add("a");
        strings2.add("a");

        strings2.addAll(strings);

        System.out.println(strings2);

    }
}
