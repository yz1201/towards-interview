package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: yz1201
 * @Date: 2022/6/13 16:15
 */
@Slf4j
public class LetterCombinations {

    public static void main(String[] args) {
        String s = "23";
        int i = 2;
        letterCombinationsCopy(s);
    }

    public static List<String> letterCombinations(String digits) {
        Map<Integer, List<Character>> baseMap = new HashMap<>();
        baseMap.put(2, List.of('a', 'b', 'c'));
        baseMap.put(3, List.of('d', 'e', 'f'));
        baseMap.put(4, List.of('g', 'h', 'i'));
        baseMap.put(5, List.of('j', 'k', 'l'));
        baseMap.put(6, List.of('m', 'n', 'o'));
        baseMap.put(7, List.of('p', 'q', 'r', 's'));
        baseMap.put(8, List.of('t', 'u', 'v'));
        baseMap.put(9, List.of('w', 'x', 'y', 'z'));

        if (!"".equals(digits)) {
            StringBuilder sb = new StringBuilder();
            List<List<Character>> resCharArr = new ArrayList<>();
            for (int i = 0; i < digits.length(); i++) {
                int key = Integer.parseInt(digits.charAt(i) + "");
                resCharArr.add(baseMap.get(key));
            }
        }
        return null;
    }

    public static List<String> letterCombinationsCopy(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits.length() == 0) {
            return combinations;
        }
        Map<Character, String> phoneMap = new HashMap<>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        backtrack(combinations, phoneMap, digits, 0, new StringBuffer());
        return combinations;
    }

    public static void backtrack(List<String> combinations, Map<Character, String> phoneMap, String digits, int index, StringBuffer combination) {
        if (index == digits.length()) {
            combinations.add(combination.toString());
        } else {
            char digit = digits.charAt(index);
            String letters = phoneMap.get(digit);
            int lettersCount = letters.length();
            for (int i = 0; i < lettersCount; i++) {
                combination.append(letters.charAt(i));
                backtrack(combinations, phoneMap, digits, index + 1, combination);
                combination.deleteCharAt(index);
            }
        }
    }
}
