package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/4/14 8:57
 */
@Slf4j
public class CountDigitOneGame {

    public static void main(String[] args) {
//        int c = (int) Math.pow(10, 9);
//        double d = Math.pow(10, 9);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(Integer.MAX_VALUE);

        System.out.println(countDigitOne(824883294));
    }

    //<=10
    public static int countDigitOne(int n) {
        int count = 0;
        while (n >= 0) {
            count += sumCurNum(n);
            n--;
        }
        return count;
    }

    private static int sumCurNum(int num) {
        int sum = 0;
        while (num != 0) {
            int temp = num % 10;
            if (temp == 1)
                sum += temp;
            num /= 10;
        }
        return sum;
    }


    public static int countDigitOneCopy(int n) {
        // mulk 表示 10^k
        // 在下面的代码中，可以发现 k 并没有被直接使用到（都是使用 10^k）
        // 但为了让代码看起来更加直观，这里保留了 k
        long mulk = 1;
        int ans = 0;
        while (n >= mulk) {
            ans += (n / (mulk * 10)) * mulk +
                    Math.min(Math.max(n % (mulk * 10) - mulk + 1, 0), mulk);
            mulk *= 10;
        }
        return ans;
    }

}
