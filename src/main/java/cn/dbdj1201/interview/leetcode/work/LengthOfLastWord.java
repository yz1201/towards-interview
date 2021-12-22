package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2021/12/22 9:33
 */
@Slf4j
public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   art  cat doctor "));
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        String[] strs = s.split(" ");
        int len = strs.length;
        return strs[len-1].length();
    }
}
