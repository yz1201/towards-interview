package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2022/6/1 9:19
 */
@Slf4j
public class ArrayPermute {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permuteCopy(nums));
    }

    public List<List<Integer>> permute(int[] nums) {
        //{1,2,3}
        int length = nums.length;
        int newLen = length * (length - 1);
        List<List<Integer>> numsArray = new ArrayList<>(newLen);
        List<Integer> numArray = new ArrayList<>();
        for (int i = 0; i < newLen; i++) {
            //循环打印|整理结果集
            for (int i1 = 0; i1 < length; i1++) {
                numArray.add(nums[i1]);


                System.out.println("tesst - - ");
            }
            //交换位置

        }

        return null;
    }


    public static List<List<Integer>> permuteCopy(int[] nums) {
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
//            res.add(output);
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
