package cn.dbdj1201.interview.leetcode.work;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2021/12/14 14:06
 */
@Slf4j
public class PalindromeSolution {

    public static void main(String[] args) {
        System.out.println(solutePro(2147483647));
    }

    public static boolean solutePro(int x) {
        try {
            String s = String.valueOf(x);
            String reverse = StrUtil.reverse(s);
            return reverse.equals(s);
        } catch (RuntimeException e) {
            log.error("not palindrome - {}", x);
            return false;
        }
    }

    public static boolean isPalindrome(int x) {


        if ((x != 0 && x % 10 == 0) || x < 0) {
            return false;
        }

        int reverse = 0;
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }

        return x == reverse / 10 || x == reverse;
    }
}
