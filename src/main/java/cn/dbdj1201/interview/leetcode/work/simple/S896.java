package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: yz1201
 * @Date: 2023/11/14 13:52
 */
@Slf4j
public class S896 {

    public boolean isMonotonic(int[] nums) {
        int length = nums.length;
        if (length <= 2) return true;
        int[] numsCopy1 = nums.clone();
        Arrays.sort(numsCopy1);
        boolean ok = true;
        for (int i = 0; i < length; i++) {
            if (numsCopy1[i] != nums[i]){
                ok = false;
                break;
            }
        }

        if (!ok){
            ok = true;
            int j = 0;
            for (int i = length - 1 ; i >= 0; i--) {
                if (numsCopy1[i] != nums[j++]){
                    ok = false;
                    break;
                }
            }
        }
        return ok;
    }
}
