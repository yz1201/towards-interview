package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @Author: yz1201
 * @Date: 2022/2/28 14:17
 */
@Slf4j
public class FIndUniqueMorseRepresentationsTask {

    public static void main(String[] args) {
//        String[] words = {"a", "b", "c"};
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] morseArr = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--.."};

        int len = 26;
        Map<Character, String> translateDic = new HashMap<>();
        for (int i = 0; i < len; i++) {
            char c = (char) ('a' + i);
            translateDic.put(c, morseArr[i]);
        }
        System.out.println(translateDic);
        Set<String> ans = new HashSet<>();
        Arrays.stream(words).forEach(s -> {
            StringBuilder sb = new StringBuilder();
            char[] chars = s.toCharArray();
            for (char aChar : chars) {

                sb.append(translateDic.get(aChar));
            }
            System.out.println(sb);
            ans.add(sb.toString());
        });
        System.out.println(ans);
        return ans.size();
    }


}
