package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/3/16 10:03
 */
@Slf4j
public class RemoveOccurrencesTask {
    public static void main(String[] args) {
        String str = "defabcdefgdefdef";
        String s = "def";
        System.out.println(str.indexOf(s));
        System.out.println(removeOccurrences(str, s));
    }

    public static String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            int start = s.indexOf(part);
            int len = part.length();
            s = s.substring(0, start).concat(s.substring(start + len));
        }
//        System.out.println("s-----" + s);
        return s;
    }
}
