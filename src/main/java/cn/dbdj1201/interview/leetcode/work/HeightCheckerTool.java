package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2022/1/29 19:24
 */
@Slf4j
public class HeightCheckerTool {

    public static void main(String[] args) {
        int[] nums ={5,4,3,1,2};
        System.out.println(heightCheckerCopy(nums));
    }


    public static int heightChecker(int[] heights) {
        int len = heights.length;
        int[] target = new int[len];
        System.arraycopy(heights, 0, target, 0, len);
        Arrays.sort(target);
        int cnt = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != target[i]) cnt++;
        }

        return cnt;
    }

    public static int heightCheckerCopy(int[] heights) {
        int[] arr = new int[101];
        for (int height : heights) {
            arr[height]++;
        }
        int count = 0;
        for (int i = 1, j = 0; i < arr.length; i++) {
            while (arr[i]-- > 0) {
                if (heights[j++] != i) count++;
            }
        }
        return count;
    }

}
