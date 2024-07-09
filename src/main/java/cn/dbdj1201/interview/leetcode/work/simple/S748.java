package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yz1201
 * @Date: 2024/7/9 10:20
 */
@Slf4j
public class S748 {

    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> charCounter = new HashMap<>();
        licensePlate = licensePlate.toLowerCase().replaceAll("\\s+", "");
        for (char c : licensePlate.toCharArray()) {
            charCounter.put(c, charCounter.getOrDefault(c, 0) + 1);
        }

        //a 3
        int maxIndex = -1;
        for (String word : words) {
            for (char c : word.toCharArray()) {
//                if (charCounter.)

            }


        }


        return null;
    }

    public static void main(String[] args) {
        String s = "1s3 PSt ttttttt";
        String[] words = {"step", "steps", "stripe", "stepple"};
        System.out.println(S748.shortestCompletingWordCp2(s, words));
        System.out.println(S748.shortestCompletingWordCp(s, words));
    }

    public static String shortestCompletingWordCp(String licensePlate, String[] words) {
        int[] cnt = new int[26];
        for (int i = 0; i < licensePlate.length(); ++i) {
            char ch = licensePlate.charAt(i);
            if (Character.isLetter(ch)) {
                ++cnt[Character.toLowerCase(ch) - 'a'];
            }
        }
        int idx = -1;
        for (int i = 0; i < words.length; ++i) {
            int[] c = new int[26];
            for (int j = 0; j < words[i].length(); ++j) {
                char ch = words[i].charAt(j);
                ++c[ch - 'a'];
            }
            boolean ok = true;
            for (int j = 0; j < 26; ++j) {
                if (c[j] < cnt[j]) {
                    ok = false;
                    break;
                }
            }
            if (ok && (idx < 0 || words[i].length() < words[idx].length())) {
                idx = i;
            }
        }
        return words[idx];
    }

    public static String shortestCompletingWordCp2(String licensePlate, String[] words) {
        int[] ap = new int[26];
        char[] chars1 = licensePlate.toCharArray();
        int sumOfChar = 0;
        for (char c : chars1) {
            if (c >= 'a' && c <= 'z') {
                ap[c - 'a']++;
                sumOfChar++;
            } else if (c >= 'A' && c <= 'Z') {
                ap[c - 'A']++;
                sumOfChar++;
            }
        }
        int minLength = Integer.MAX_VALUE;
        String res = null;
        int[] cpCounts = new int[26];
        for (String s : words) {
            if (s.length() >= minLength || s.length() < sumOfChar) {
                continue;
            }
            int cpSumOfChar = sumOfChar;
            char[] chars = s.toCharArray();
            int len = chars.length;

            System.arraycopy(ap, 0, cpCounts, 0, 26);
            for (char c : chars) {
                if (cpCounts[c - 'a'] > 0) {
                    cpCounts[c - 'a']--;
                    cpSumOfChar--;
                    if (cpSumOfChar == 0) {
                        minLength = len;
                        res = s;
                        break;
                    }
                }

            }
        }
        return res;
    }

}
