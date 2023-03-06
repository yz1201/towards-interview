package cn.dbdj1201.interview.test.simple;

import cn.dbdj1201.interview.leetcode.work.simple.Q243;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/3/6 9:51
 */
@Slf4j
public class T243 {

    /*
    ["practice", "makes", "perfect", "coding", "makes"]
"coding"
"practice"
     */
    public static void main(String[] args) {
        String[] strings = {"practice", "makes", "perfect", "coding", "makes"};
        String s1 = "coding";
        String s2 = "makes";
        System.out.println(new Q243().shortestDistanceCopy(strings, s1, s2));

    }
}
