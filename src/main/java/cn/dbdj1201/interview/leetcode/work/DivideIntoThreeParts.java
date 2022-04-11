package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2022/4/11 16:31
 */
@Slf4j
public class DivideIntoThreeParts {

    public static void main(String[] args) {
        int[] arr = {2,2,2,0,12,0,0,0};
        System.out.println(canThreePartsEqualSumCopy(arr));
    }

    public static boolean canThreePartsEqualSumCopy(int[] arr) {
        int s = Arrays.stream(arr).sum();

        if (s % 3 != 0) {
            return false;
        }

        int target = s / 3;

        int n = arr.length, i = 0, cur = 0;
        while (i < n) {
            cur += arr[i];
            if (cur == target) {
                break;
            }
            ++i;
        }
        if (cur != target) {
            return false;
        }
        int j = i + 1;
        while (j + 1 < n) {  // 需要满足最后一个数组非空
            cur += arr[j];
            if (cur == target * 2) {
                return true;
            }
            ++j;
        }
        return false;
    }

}
