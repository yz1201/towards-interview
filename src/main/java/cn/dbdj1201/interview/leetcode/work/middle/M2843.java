package cn.dbdj1201.interview.leetcode.work.middle;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2024/3/8 11:09
 */
@Slf4j
public class M2843 {

    public int minimumPossibleSum(int n, int target) {
        int[] nums = new int[n];
        nums[0] = 1;
        int sum = 1;
        while (sum < target) {
            for (int i = 1; i < n; i++) {
                if (sum + nums[i] <= target) {
                    sum += nums[i];
                    nums[i] = nums[i - 1] * 2;
                } else {
                    break;
                }
            }
        }
        return sum;
    }

    public int minimumPossibleSumV1(int n, int target) {
        if (target == 1 && n == 1) return 1;
        int[] nums = new int[n];
        nums[0] = 1;
        int sum = 1;
        for (int i = 2; i <= n; i++) {
            if (i + sum != target){
                sum +=i;
            }
        }
        return -1;
    }

    public int minimumPossibleSumCp(int n, int target) {
        final int MOD = (int) 1e9 + 7;
        int m = target / 2;
        if (n <= m) {
            return (int) ((long) (1 + n) * n / 2 % MOD);
        }
        return (int) (((long) (1 + m) * m / 2 +
                ((long) target + target + (n - m) - 1) * (n - m) / 2) % MOD);
    }

    public static void main(String[] args) {
        double v = 1e9;
        System.out.println(v);
        final int MOD = (int) 1e9 + 7;
        System.out.println(MOD);
    }
}
