package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2022/1/5 15:35
 */
@Slf4j
public class PermuteTask {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        permute(nums);
    }

    public static List<List<Integer>> permute1(int[] nums) {


        int length = nums.length;
        List<Integer> numArr = new ArrayList<>();
        List<List<Integer>> numArrs = new ArrayList<>();
        int i = 0;
        while (i < length) {
            numArr.add(nums[i]);
//            permute(System.arraycopy();)
        }
        return null;
    }


    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        for (int num : nums) {
            output.add(num);
        }

        int n = nums.length;
        backtrack(n, output, res, 0);
        return res;
    }

    public static void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first) {
        // 所有数都填完了
        if (first == n) {
            res.add(new ArrayList<>(output));
        }
        for (int i = first; i < n; i++) {
            // 动态维护数组
            Collections.swap(output, first, i);
            // 继续递归填下一个数
            backtrack(n, output, res, first + 1);
            // 撤销操作
            Collections.swap(output, first, i);
        }
    }

}
