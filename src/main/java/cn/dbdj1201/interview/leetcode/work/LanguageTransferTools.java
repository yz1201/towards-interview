package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2022/4/21 14:54
 */
@Slf4j
public class LanguageTransferTools {
    public static void main(String[] args) {
        System.out.println(toGoatLatin("Each word consists of lowercase and uppercase letters only"));
    }

    public static String toGoatLatin(String sentence) {
        String[] s = sentence.trim().split(" ");
        List<Character> targetArr = new ArrayList<>();
        targetArr.add('a');
        targetArr.add('e');
        targetArr.add('i');
        targetArr.add('o');
        targetArr.add('u');
        targetArr.add('A');
        targetArr.add('E');
        targetArr.add('I');
        targetArr.add('O');
        targetArr.add('U');
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            if (targetArr.contains(s[i].charAt(0))) {
                ans.append(s[i]).append("ma").append("a".repeat(i+1)).append(" ");
            } else {
                ans.append(s[i], 1, s[i].length()).append(s[i].charAt(0)).append("ma").append("a".repeat(i+1)).append(" ");
            }
        }
        return ans.substring(0, ans.length() - 1);
    }
}
