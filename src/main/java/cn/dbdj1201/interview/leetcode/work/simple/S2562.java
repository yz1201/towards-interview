package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2023/10/12 9:15
 */
@Slf4j
public class S2562 {

    public long findTheArrayConcVal(int[] nums) {
        List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        if (nums.length == 1) return nums[0];
        int l = 0, r = numList.size() - 1;
        long res = 0L;
        while (l < r) {
            StringBuilder sb = new StringBuilder();
            String test = sb.append(numList.get(l)).append(numList.get(r)).toString();
            System.out.println(test);
            res += Long.parseLong(test);
            System.out.println(res);
            l++;
            r--;
        }
        if (numList.size() % 2 != 0) res += numList.get(numList.size() / 2);
        return res;
    }
}
