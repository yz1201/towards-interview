package cn.dbdj1201.interview.leetcode.work.middle;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2023/9/7 16:01
 */
@Slf4j
public class M784 {

    public List<String> letterCasePermutation(String s) {
        Set<String> resSet = new HashSet<>();
        char[] cs = s.toCharArray();
        for (char c : cs) {
            StringBuilder sb = new StringBuilder();
            if (!Character.isDigit(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
            resSet.add(sb.toString());
        }

        for (char c : cs) {
            StringBuilder sb = new StringBuilder();
            if (Character.isDigit(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
            resSet.add(sb.toString());
        }
        return new ArrayList<>(resSet);
    }

    //a1b2c3d4
    public List<String> letterCasePermutationV1(String s) {
        List<String> res = new ArrayList<>();
        Set<String> strings = new HashSet<>();
        char[] cs = s.toCharArray();
        int len = 0;
        for (char c : cs) {
            if (Character.isLetter(c)) {
                len++;
            }
        }

        if (len == 0){
            res.add(s);
            return res;
        }

        if (len == 1){
            
        }


        return null;
    }
}
