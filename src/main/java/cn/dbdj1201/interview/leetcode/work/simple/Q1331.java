package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @Author: yz1201
 * @Date: 2022/7/30 14:09
 */
@Slf4j
public class Q1331 {

    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> indexes = new HashMap<>();
        Map<Integer, Integer> indexes1 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            indexes.put(arr[i], i);
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            indexes1.put(arr[i], i);
        }

        int[] ans = new int[arr.length];
        //[0,0,0,0]
        for (int i = 0; i < ans.length; i++) {
//           ans[i] = ;
        }

        return null;
    }

    public int[] arrayRankTransformV1(int[] arr){
        List<Integer> rank = new ArrayList<>();
        int len = arr.length;
        for (int i = 0; i < len; i++) {

        }

        return null;
    }

    public int[] arrayRankTransformCopy(int[] arr) {
        int[] sortedArr = new int[arr.length];
        System.arraycopy(arr, 0, sortedArr, 0, arr.length);
        Arrays.sort(sortedArr);
        Map<Integer, Integer> ranks = new HashMap<>();
        int[] ans = new int[arr.length];
        for (int a : sortedArr) {
            if (!ranks.containsKey(a)) {
                ranks.put(a, ranks.size() + 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            ans[i] = ranks.get(arr[i]);
        }
        return ans;
    }

}
