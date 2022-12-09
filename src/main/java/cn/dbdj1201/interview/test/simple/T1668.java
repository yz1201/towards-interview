package cn.dbdj1201.interview.test.simple;

import cn.dbdj1201.interview.leetcode.work.simple.Q1668;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2022/11/3 14:47
 */
@Slf4j
public class T1668 {
    public static void main(String[] args) {
        Q1668 q1668 = new Q1668();

//        System.out.println(q1668.maxRepeating("abababa", "ba"));
        System.out.println(q1668.maxRepeatingCopy1("abababa", "ba"));
        
        List<String> l1 = new ArrayList<>();
        l1.add("s");
        l1.add("b");
        System.out.println(l1);
        List<String> b = l1.stream().filter(str -> str.equals("b")).collect(Collectors.toList());
        System.out.println(b);
    }
}
