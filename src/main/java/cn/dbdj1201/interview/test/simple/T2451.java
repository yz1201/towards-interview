package cn.dbdj1201.interview.test.simple;

import cn.dbdj1201.interview.leetcode.work.simple.S2451;
import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: yz1201
 * @Date: 2023/5/25 11:27
 */
@Slf4j
public class T2451 {

    public static void main(String[] args) {
        S2451 s2451 = new S2451();
        String[] words = {"aaaaa", "zzzzz", "bbbbb","ccccc","ddddd","abced"};
        System.out.println(s2451.oddStringCopy(words));
        Set<int[]> set = new HashSet<>();
        System.out.println(set.add(new int[]{1, 2}));
        System.out.println(set.add(new int[]{1, 2}));
        System.out.println(set.add(new int[]{1, 2}));
        System.out.println(set.add(new int[]{1, 2}));
    }
}
