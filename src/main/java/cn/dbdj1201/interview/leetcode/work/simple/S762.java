package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2024/5/17 14:24
 */
@Slf4j
public class S762 {

    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            String s = Integer.toBinaryString(i);
            char[] chars = s.toCharArray();
            int oneCounter = 0;
            for (char aChar : chars) {
                if (aChar == 49) {
                    oneCounter++;
                }
            }
            if (isPrime(oneCounter)) count++;
        }
        return count;
    }

    private boolean isPrime(int num) {
        if (num == 1) return false;
        if (num == 2) return true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public int countPrimeSetBitsCp(int left, int right) {
        int ans = 0;
        for (int x = left; x <= right; ++x) {
            if (((1 << Integer.bitCount(x)) & 665772) != 0) {
                ++ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        String s = "";
//        System.out.println(s.isEmpty());
//        System.out.println(s.isBlank());
//        int len = 1000;
//        for (int i = 0; i < len; i++) {
//            System.out.println(Integer.toBinaryString(i));
//        }

        S762 s762 = new S762();
        System.out.println(s762.countPrimeSetBits(6, 10));
        char a = '1';
        System.out.println(a  -1 );
        System.out.println('1');

        List<Integer> nums = new ArrayList<>();
        int len = 100;
        for (int i = 0; i < len; i++) {
            nums.add(i);
        }
        System.out.println(nums.stream().anyMatch(num -> num >1000));


    }
}
