package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.math3.analysis.function.Min;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: yz1201
 * @Date: 2023/2/28 9:25
 */
@Slf4j
public class Q243 {

    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int length = wordsDict.length;
        int[] indexFir = new int[length];
        int[] indexSec = new int[length];
        int left = 0, right = 0;
        for (int i = 0; i < length; i++) {
            if (wordsDict[i].equals(word1)) {
                indexFir[left] = i + 1;
                left++;
                continue;
            }
            if (word2.equals(wordsDict[i])) {
                indexSec[right] = i + 1;
                right++;
            }
        }
        Arrays.sort(indexFir);
        Arrays.sort(indexSec);
        int min = 1;
        for (int num : indexFir) {
            for (int j : indexSec) {
                int minNum = j - num;
                if (minNum == 0) continue;
                if (min == minNum) return min;
                min = Math.min(min, minNum);
            }
        }
        return min;
    }

    public int shortestDistanceV1(String[] wordsDict, String word1, String word2) {
        int length = wordsDict.length;
        Set<Integer> integers1 = new TreeSet<>();
        Set<Integer> integers2 = new TreeSet<>();
        for (int i = 0; i < length; i++) {
            if (wordsDict[i].equals(word1)) {
                integers1.add(i + 1);
                continue;
            }
            if (word2.equals(wordsDict[i])) {
                integers2.add(i + 1);
            }
        }
        int min = Integer.MAX_VALUE;
        for (int num : integers1) {
            for (int j : integers2) {
                int minNum = Math.abs(j - num);
                if (minNum == 0) continue;
                if (minNum == 1) return 1;
                min = Math.min(min, minNum);
            }
        }
        return min;
    }

    public int shortestDistanceCopy(String[] wordsDict, String word1, String word2) {
        int length = wordsDict.length;
        int ans = length;
        int index1 = -1, index2 = -1;
        for (int i = 0; i < length; i++) {
            String word = wordsDict[i];
            if (word.equals(word1)) {
                index1 = i;
            } else if (word.equals(word2)) {
                index2 = i;
            }
            if (index1 >= 0 && index2 >= 0) {
                ans = Math.min(ans, Math.abs(index1 - index2));
            }
        }
        return ans;
    }

}
