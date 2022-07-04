package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @Author: yz1201
 * @Date: 2022/7/4 9:30
 */
@Slf4j
public class MinimumAbsDifference {
    public static void main(String[] args) {
        int[] arr = {-57, -70, 6, -69, 5, -47, -13};
        System.out.println(minimumAbsDifference(arr));
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        List<Integer> pairs = new ArrayList<>();
        Map<List<Integer>, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length - 1; i++) {
            map.put(List.of(arr[i], arr[i + 1]), Math.abs(arr[i] - arr[i + 1]));
        }
        int minDiff = map.values().stream().mapToInt(Integer::intValue).min().orElse(0);
        for (Map.Entry<List<Integer>, Integer> listIntegerEntry : map.entrySet()) {
            if (listIntegerEntry.getValue() == minDiff)
                ans.add(listIntegerEntry.getKey());
        }
        ans.sort(Comparator.comparingInt(arr2 -> arr2.get(0)));
        return ans;
    }

    public static List<List<Integer>> minimumAbsDifferenceCopy(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        int best = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n - 1; ++i) {
            int delta = arr[i + 1] - arr[i];
            if (delta < best) {
                best = delta;
                ans.clear();
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i + 1]);
                ans.add(pair);
            } else if (delta == best) {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i + 1]);
                ans.add(pair);
            }
        }
        return ans;
    }

    public static List<List<Integer>> minimumAbsDifferenceCopy2(int[] arr) {
        Arrays.sort(arr);
        int d = (int) 1e7;
        for (int i = 1; i < arr.length; i++) {
            d = Math.min(d, arr[i] - arr[i - 1]);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == d) {
                ans.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        return ans;
    }


}
