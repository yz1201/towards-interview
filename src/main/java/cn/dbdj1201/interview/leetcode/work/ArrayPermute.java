package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2022/6/1 9:19
 */
@Slf4j
public class ArrayPermute {

    public static void main(String[] args) {

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

            }
            //交换位置

        }

        return null;
    }
}
