package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/1/31 21:16
 */
@Slf4j
public class DetectCapitalUseTask {

    public static void main(String[] args) {
        char a = 'A';
        char b = 'Z';
        System.out.println(a-1);

        System.out.println(detectCapitalUse("sasd"));
        System.out.println(detectCapitalUse("Sasd"));
        System.out.println(detectCapitalUse("SAD"));
        System.out.println(detectCapitalUse("saD"));
    }

    public static boolean detectCapitalUse(String word) {

        if (word.toUpperCase().equals(word) || word.toLowerCase().equals(word)) return true;

        for (char c : word.substring(1).toCharArray()) {
            if (c>=65 && c<= 90){
                return false;
            }
        }

        return true;
    }
}
