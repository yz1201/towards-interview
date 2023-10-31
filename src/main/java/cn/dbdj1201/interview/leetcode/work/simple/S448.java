package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2023/10/31 9:06
 */
@Slf4j
public class S448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int len = nums.length;
        Set<Integer> collect = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        for (int i = 1; i <= len; i++) {
            if (!collect.contains(i)) res.add(i);
        }
        return res;
    }

    public List<Integer> findDisappearedNumbersCopy(int[] nums) {
        //4,3,2,7,8,2,3,1
        int n = nums.length;
        for (int num : nums) {
            int x = (num - 1) % n;
            nums[x] += n;
        }

        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (nums[i] <= n) {
                ret.add(i + 1);
            }
        }
        return ret;
    }
}
