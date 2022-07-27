package cn.dbdj1201.interview.leetcode.work.middle;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Objects;

/**
 * @Author: yz1201
 * @Date: 2022/7/27 14:21
 */
@Slf4j
public class Question592 {

    public String fractionAddition(String expression) {
        if (expression.length() < 1) return "";

        int start = expression.charAt(0) == '-' ? 1 : 0;
        boolean firstFlag = start == 0;
//        int len = expression.length();
//        String res = "0/1";
//        while (start < len) {
//            if (start + 7 <= len && start == 0) {
//                cal(res, expression.substring(start, start + 3), firstFlag);
//            } else if (start + 7 <= len && start == 1) {
//                res = cal(expression.substring(start, start + 3),
//                        expression.substring(start + 4, start + 7), firstFlag);
//            } else {
//                break;
//            }
//            start += 7;
//        }
        return "";
    }

    public String fractionAdditionV1(String expression) {
        if (expression.length() < 7) return "";
        String res = "0/1+";
        expression = res + expression;
        int start = 0;
        int len = expression.length();
        res = expression.substring(start, start + 3);
//        start = 3;
        while (start < len) {
            if (start + 4 <= len) {
                res = cal(res, expression.substring(start + 4, start + 7), expression.substring(start + 3, start + 4));
            } else {
                break;
            }
            start += 4;
        }
        return res;
    }

    public String fractionAdditionV2(String expression) {
        if (expression.length() < 7) return "";
        String res = "";
        int start = 0;
        int len = expression.length();
        while (start < len) {
            if (start + 4 <= len) {
                String substring = expression.substring(start + 4, start + 7);
                if (expression.charAt(0) != '-') {
                    res = cal(expression.substring(start, start + 3), substring, expression.substring(start + 3, start + 4));
                } else {
                    res = cal(expression.substring(start + 1, start + 4), substring, "-");
                }
            } else {
                break;
            }
            start += 4;
        }
        return res;
    }


    private String cal(String substring, String substring1, String symbol) {
        String[] split = substring.split("/");
        String[] split1 = substring1.split("/");
        String ans;
        Integer num1 = Integer.valueOf(split[1]);
        Integer num2 = Integer.valueOf(split1[1]);
        Integer numA = Integer.valueOf(split[0]);
        Integer numB = Integer.valueOf(split1[0]);
        ans = calNum(num1, num2, numA, numB, symbol);
        return ans;
    }

    private String calNum(Integer num1, Integer num2, Integer numA, Integer numB, String symbol) {
        int sum1 = numA * num2;
        int sum2 = numB * num1;
        int down = num1 * num2;
        boolean plus = symbol.equals("+");
        int sum;
        if (plus) {
            sum = sum1 + sum2;
        } else sum = sum1 - sum2;
        String ans;
        if (sum > down) {
            if (sum % down == 0) {
                sum /= down;
                ans = sum + "/" + "1";
            } else {
                ans = sum + "/" + down;
            }
        } else if (sum == down) {
            ans = "1/1";
        } else {
            if (down % sum == 0) {
                down /= sum;
                ans = "1/" + down;
            } else {
                ans = sum + "/" + down;
            }
        }
        return ans;
    }


    public String fractionAdditionV3(String expression){
        String[] split = expression.split("/");
        int len = split.length;
        for (int i = 0; i < len; i++) {



        }

        System.out.println(Arrays.toString(split));
        return "";
    }

    public String fractionAdditionCopyV1(String expression) {
        long denominator = 0, numerator = 1; // 分子，分母
        int index = 0, n = expression.length();
        while (index < n) {
            // 读取分子
            long denominator1 = 0, sign = 1;
            if (expression.charAt(index) == '-' || expression.charAt(index) == '+') {
                sign = expression.charAt(index) == '-' ? -1 : 1;
                index++;
            }
            while (index < n && Character.isDigit(expression.charAt(index))) {
                denominator1 = denominator1 * 10 + expression.charAt(index) - '0';
                index++;
            }
            denominator1 = sign * denominator1;
            index++;

            // 读取分母
            long numerator1 = 0;
            while (index < n && Character.isDigit(expression.charAt(index))) {
                numerator1 = numerator1 * 10 + expression.charAt(index) - '0';
                index++;
            }

            denominator = denominator * numerator1 + denominator1 * numerator;
            numerator *= numerator1;
        }
        if (denominator == 0) {
            return "0/1";
        }
        long g = gcd(Math.abs(denominator), numerator); // 获取最大公约数
        return denominator / g + "/" + Long.toString(numerator / g);
    }

    public long gcd(long a, long b) {
        long remainder = a % b;
        while (remainder != 0) {
            a = b;
            b = remainder;
            remainder = a % b;
        }
        return b;
    }

}
