package cn.dbdj1201.interview.leetcode.work.middle;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2023/8/17 9:26
 */
@Slf4j
public class M204 {

    public int countPrimes(int n) {
        n--;
        int count = 0;
        while (n > 1) {
            if (isPrime(n))
                count++;
            n--;
        }
        //1000
        return count;
    }

    private boolean isPrime(int n) {
        if (n == 2)
            return true;
        int num = n - 1;
        while (num > 1) {
            if (n % num == 0)
                return false;
            num--;
        }
        return true;
    }

    public int countPrimesCopy(int n) {
        int[] isPrime = new int[n];
        Arrays.fill(isPrime, 1);
        int ans = 0;
        for (int i = 2; i < n; ++i) {
            if (isPrime[i] == 1) {
                ans += 1;
                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        isPrime[j] = 0;
                    }
                }
            }
        }
        return ans;
    }
}
