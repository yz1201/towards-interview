package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @Author: yz1201
 * @Date: 2022/1/30 20:07
 */
@Slf4j
public class UnCommonSentencesTask {

    public static void main(String[] args) {
        String s1 = "this apple is sweet", s2 = "this apple is sour";
        uncommonFromSentences(s1, s2);
    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        List<String> list1 = Arrays.asList(s1.split(" "));
        List<String> list2 = Arrays.asList(s2.split(" "));

        Map<String, Integer> commonStrMap = new HashMap<>();
        List<String> target = new ArrayList<>();
        for (String s : list1) {
            if (!commonStrMap.containsKey(s)) commonStrMap.put(s, 1);
            else commonStrMap.put(s, commonStrMap.get(s) + 1);
        }

        for (String s : list2) {
            if (!commonStrMap.containsKey(s)) commonStrMap.put(s, 1);
            else commonStrMap.put(s, commonStrMap.get(s) + 1);
        }

        System.out.println(commonStrMap);

        for (String s : commonStrMap.keySet()) {
            if (commonStrMap.get(s) == 1){
                System.out.println(s);
                target.add(s);
            }

        }
        System.out.println(target);
        String[] targetArr = new String[target.size()];

        for (int i = 0; i < targetArr.length; i++) {
            targetArr[i] = target.get(i);
        }
        return targetArr;
    }
}
