package cn.dbdj1201.interview;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yz1201
 * @date 2020-08-15 0:50
 **/
@Slf4j
public class Prob11 {
    public static void main(String[] args) {
        /*面试题 11：数值的整数次方
题目：实现函数 double Power（double base，int exponent），求 base 的 exponent
次方。不得使用库函数，同时不需要考虑大数问题。*/
        System.out.println(Power(2, 3));
    }

    private static double Power(double base, int exponent) {
        double result = 1;
        if (base == 0 && exponent < 0) {
            System.out.println("wrong");
            return -1;
        }

        if (exponent > 0) {
            result = doPower(base, exponent);
        } else {
            result = 1.0 / doPower(base, exponent);
        }

        return result;
    }

    private static double doPower(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    private static void test() {

    }
}
