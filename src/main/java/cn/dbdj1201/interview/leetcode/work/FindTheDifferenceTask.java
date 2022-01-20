package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author: yz1201
 * @Date: 2022/1/20 8:12
 */
@Slf4j
public class FindTheDifferenceTask {

    public static void main(String[] args) {
        String s = "a";
        String t = "aa";
        System.out.println(findTheDifference1(s,t));
    }

    //找不同
    public static char findTheDifference(String s, String t) {
        int len2 = s.length();
        int len1 = t.length();

        for (int i = 0; i < len1; i++) {
            boolean flag = true;
            for (int i1 = 0; i1 < len2; i1++) {
                if (s.charAt(i1) == t.charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return t.charAt(i);
        }
        return 'c';
    }

    //消除同类型
    public static char findTheDifference1(String s, String t) {
        int len = s.length();
        int len1 =t.length();

        Deque<Character> validCs = new LinkedList<>();

        for (int i = 0; i < len1; i++) {
            validCs.push(t.charAt(i));
        }
        System.out.println(validCs);

        for (int i = 0; i < len; i++) {
            validCs.remove(s.charAt(i));
        }
        System.out.println(validCs);
        return validCs.pop();
    }

    /*
        ?
     */
    public static char findTheDifferenceCopy(String s, String t) {
        int as = 0, at = 0;
        for (int i = 0; i < s.length(); ++i) {
            as += s.charAt(i);
        }
        for (int i = 0; i < t.length(); ++i) {
            at += t.charAt(i);
        }
        return (char) (at - as);
    }

}
