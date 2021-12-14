package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * @Author: yz1201
 * @Date: 2021/12/14 9:39
 */
@Slf4j
public class ReverseNumberSolution {
    public static void main(String[] args) {
//        int x = new Random().nextInt();
////        long x = 9646324351;
//        int target = 0;
//        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
//            target = 0;
//        }
//        log.info("init value is {}", x);
//        StringBuilder sb = new StringBuilder();
//        if (x > 0) {
//            String intVal = String.valueOf(x);
//            for (int i = intVal.length() - 1; i >= 0; i--) {
//                sb.append(intVal.charAt(i));
//            }
//            target = Integer.parseInt(sb.toString());
//            log.info("answer is {} - {}", target, Integer.MAX_VALUE);
//        }else{
//            String intVal = String.valueOf(-x);
//            sb.append("-");
//            for (int i = intVal.length() - 1; i >= 0; i--) {
//                sb.append(intVal.charAt(i));
//            }
//            target = Integer.parseInt(sb.toString());
//            if (target > Integer.MAX_VALUE || target < Integer.MIN_VALUE) {
//                target = 0;
//            }
//            log.info("answer is {} - {}", target, Integer.MAX_VALUE);
//        }

//        int num = 2531;
//        double x = (double) num / 10;
//        System.out.println(x);

        System.out.println(solveReverseInteger(532697));
    }

    public static int solveReverseInteger(int x) {
        int target = 0;
        while (x != 0) {
            if (target > Integer.MAX_VALUE / 10 || target < Integer.MIN_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            x /= 10;
            target = target * 10 + digit;
        }
        return target;
    }
}
