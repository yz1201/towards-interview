package cn.dbdj1201.interview.test.simple;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/10/17 14:36
 */
@Slf4j
public class S2562 {

    public int sumOfMultiples(int n) {
        if (n < 3) return 0;
        int num =0;
        while (n >= 3){
            if (n % 3 == 0 || n % 5 == 0 || n % 7 == 0) {
                num += n;
            }
            n--;
        }
        return num;
    }

    public int f(int n, int m) {
        return (m + n / m * m) * (n / m) / 2;
    }

    public int sumOfMultiplesV1(int n) {
        return f(n, 3) + f(n, 5) + f(n, 7) - f(n, 3 * 5) - f(n, 3 * 7) - f(n, 5 * 7) + f(n, 3 * 5 * 7);
    }
}
