package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2022/2/11 9:33
 */
@Slf4j
public class ThreeConsecutiveOddsTask {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        System.out.println(threeConsecutiveOdds(nums));
//        System.out.println(15 & 1);
    }

    public static boolean threeConsecutiveOdds(int[] arr) {
        int len = arr.length;
        int validLen = 0;
        for (int i = 0; i < len; i++) {
            if (isOdds(arr[i])) {
                int index = i;
                while (index < len) {
                    if (validLen >= 3) {
                        return true;
                    }
                    if (isOdds(arr[index])) {
                        validLen++;
                    } else {
                        break;
                    }
                    index++;
                }
            }

            if (validLen >= 3) {
                return true;
            }

            validLen =0;
        }
        return false;
    }

    private static boolean isOdds(int num) {
        return num % 2 != 0;
    }
}
