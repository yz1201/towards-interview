package cn.dbdj1201.interview.leetcode.work.simple;

import com.alibaba.druid.sql.visitor.functions.Char;

import java.util.*;

/**
 * @Author: yz1201
 * @Date: 2022/8/17 21:38
 */
public class Q1832 {

    public boolean checkIfPangram(String sentence) {

        if (sentence.length() < 26)
            return false;
//        List<Character> csArr = new ArrayList<>();
//        Map<Character, Integer> csMap = new HashMap<>();
//        for (int i = 0; i < 26; i++) {
//           char c = (char) ('a' + i);
//            csArr.add(c);
//            csMap.put(c, 0);
//        }
        Set<Character> chSet = new HashSet<>();

        for (char c : sentence.toCharArray()) {
            chSet.add(c);
        }

        return chSet.size() == 26;
    }

    public boolean checkIfPangramV1(String sentence) {
        String[] ss = new String[5];
        ss[0] ="1";
        ss[1] ="12";
        ss[2] ="123";
        String s;
//        System.out.println("" +s);
        System.out.println(Arrays.toString(ss));
//        Set<Character> set = new HashSet<>(Arrays.asList(sentence.toCharArray()));
        Set<String> set = new HashSet<>(Arrays.asList(ss));
        System.out.println(set);
        System.out.println(set.size());
//        return new HashSet<Character>(Arrays.asList(sentence.toCharArray()));
        return false;
    }
}