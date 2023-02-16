package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @Author: yz1201
 * @Date: 2022/6/28 9:50
 */
@Slf4j
public class WiggleSortTask {

    public static void main(String[] args) {
//        int[] nums = {1,2,3};
//        int[] nums = {5, 1, 2, 6, 3, 4};
//        int[] nums = {1, 5, 1, 1, 6, 4};
        int[] nums = {1, 1, 2, 1, 2, 2, 1};
        wiggleSortV1(nums);
    }

    public static void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 1; i < len; i += 2) {
            int temp = nums[i];
            if (i + 1 == len)
                break;
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void wiggleSortV1(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        boolean[] ctl = new boolean[len];
        Deque<Integer> path = new ArrayDeque<>();
        int depth = 0;
        backtrackMemory(res, ctl, path, len, depth, nums);

        List<Integer> temp = new ArrayList<>();
        for (List<Integer> arr : res) {
            int size = arr.size();
            boolean flag = true;
            for (int i = 0; i < size; i += 2) {
                if (i + 1 == size)
                    break;
                if (arr.get(i) >= arr.get(i + 1)) {
                    flag = false;
                }
            }

            for (int i = 1; i < size; i += 2) {
                if (i + 1 == size)
                    break;
                if (arr.get(i) <= arr.get(i + 1)) {
                    flag = false;
                }
            }

            if (flag) {
                temp = arr;
                for (int i = 0; i < nums.length; i++) {
                    nums[i] = arr.get(i);
                }
                break;
            }
        }

        System.out.println(temp);

    }

    private static void backtrackMemory(List<List<Integer>> res, boolean[] ctl, Deque<Integer> path, int len, int depth, int[] nums) {
        if (depth == len) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (ctl[i])
                continue;
            path.addLast(nums[i]);
            ctl[i] = true;
            backtrackMemory(res, ctl, path, len, depth + 1, nums);
            ctl[i] = false;
            path.removeLast();
        }
    }

    public static void wiggleSortV2(int[] nums) {

    }

    public static void wiggleSortCopy(int[] nums) {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int n = nums.length;
        //mid
        int x = (n + 1) / 2;
        for (int i = 0, j = x - 1, k = n - 1; i < n; i += 2, j--, k--) {
            nums[i] = arr[j];
            if (i + 1 < n) {
                nums[i + 1] = arr[k];
            }
        }
    }

}
