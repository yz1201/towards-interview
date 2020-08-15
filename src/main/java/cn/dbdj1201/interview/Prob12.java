package cn.dbdj1201.interview;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yz1201
 * @date 2020-08-15 11:19
 **/
@Slf4j
public class Prob12 {

    public static void main(String[] args) {
        /*
                面试题 12：打印 1 到最大的 n 位数
            题目：输入数字 n，按顺序打印出从 1 到最大的 n 位进制数。比如输入 3，则打印出 1、2、3 一直到 999
        */

        test(4);
    }

    private static void test(int n) {
        StringBuilder lenStr = new StringBuilder();
        while (n > 0) {
            lenStr.append("9");
            n--;
        }

        int len = Integer.parseInt(lenStr.toString());

        for (int i = 1; i <= len; i++) {
            log.info("num-{}", i);
        }

        log.info("MAX-{}", len);
    }

}
