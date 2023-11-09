package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @Author: yz1201
 * @Date: 2023/5/25 10:57
 */
@Slf4j
public class S2451 {

    //    public String oddString(String[] words) {
//        List<int[]> arrays = new ArrayList<>();
//        Map<String, int[]> numsMap = new HashMap<>();
//
//        for (String word : words) {
//            arrays.add(weightWord(word));
//            numsMap.put(word, weightWord(word));
//        }
//
//        for (Map.Entry<String, int[]> stringEntry : numsMap.entrySet()) {
//            int[] value = stringEntry.getValue();
//        }
//
//        int size = arrays.size();
//        int[] standardWeigh = arrays.get(0);
//
//        for (int i = 1; i < arrays.size(); i++) {
//            int[] arr = arrays.get(i);
//            for (int i1 = 0; i1 < arr.length; i1++) {
//
//            }
//
//
//        }
//
//
//        return null;
//    }
//
    private int[] weightWord(String word) {
        int len = word.length() - 1;
        int[] numArr = new int[len];
        for (int i = 0; i < len; i++) {
            numArr[i] = word.charAt(i + 1) - word.charAt(i);
        }
        return numArr;
    }

    public String oddStringCopy(String[] words) {
        int[] diff0 = weightWord(words[0]);
        int[] diff1 = weightWord(words[1]);
        if (Arrays.equals(diff0, diff1)) {
            for (int i = 2; i < words.length; i++) {
                if (!Arrays.equals(diff0, weightWord(words[i]))) {
                    return words[i];
                }
            }
        }
        return Arrays.equals(diff0, weightWord(words[2])) ? words[1] : words[0];
    }

    public int[] get(String word) {
        int[] diff = new int[word.length() - 1];
        for (int i = 0; i + 1 < word.length(); i++) {
            diff[i] = word.charAt(i + 1) - word.charAt(i);
        }
        return diff;
    }

}
