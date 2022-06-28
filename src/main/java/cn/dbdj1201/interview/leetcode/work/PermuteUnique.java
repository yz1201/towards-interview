package cn.dbdj1201.interview.leetcode.work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2022/6/27 10:29
 */
public class PermuteUnique {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(permuteUniqueCopy(nums));
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        int length = nums.length;

//        int[] res = new int[];
        List<Integer> resList = new ArrayList<>();


        return null;
    }

    static boolean[] vis;

    public static List<List<Integer>> permuteUniqueCopy(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> perm = new ArrayList<>();
        vis = new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(nums, ans, 0, perm);
        return ans;
    }

    public static void backtrack(int[] nums, List<List<Integer>> ans, int idx, List<Integer> perm) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(perm));
            return;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (vis[i] || (i > 0 && nums[i] == nums[i - 1] && !vis[i - 1])) {
                continue;
            }
            perm.add(nums[i]);
            vis[i] = true;
            backtrack(nums, ans, idx + 1, perm);
            vis[i] = false;
            perm.remove(idx);
        }
    }

}
