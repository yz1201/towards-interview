package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2022/1/6 14:04
 */
@Slf4j
public class ReverseVowelsTask {

    public static void main(String[] args) {
        System.out.println(reverseVowels("Ui"));
    }

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        int len = s.length();
        int left = 0, right = len - 1, realSize = 0;
        while (left < right) {
            while (left <= right && !vowels.contains(s.charAt(left))) {
                chars[left] = s.charAt(left++);
                realSize++;
            }
            while (left <= right && !vowels.contains(s.charAt(right))) {
                chars[right] = s.charAt(right--);
                realSize++;
            }

            if (realSize == len) {
                return s;
            } else if (left > right) {
                break;
            } else {
                char temp = chars[left];
                chars[left++] = chars[right];
                chars[right--] = temp;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            sb.append(aChar);
        }
        return sb.toString();
    }
}
