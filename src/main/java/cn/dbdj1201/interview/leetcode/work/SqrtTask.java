package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2021/12/24 16:20
 */
@Slf4j
public class SqrtTask {

    public static void main(String[] args) {
        System.out.println(mySqrtCopy(4));
    }

    public static int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public static int mySqrtCopy(int x) {
        int left = 0, right = x, result = -1;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if ((long) mid * mid <= x) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

}

