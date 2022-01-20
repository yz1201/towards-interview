package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/1/20 9:13
 */
@Slf4j
public class AddDigitsTask {

    public static void main(String[] args) {

    }

    public static int addDigits(int num) {

//        return (num - 1) % 9 + 1;
        if (num == 0) return 0;
        return num % 9 == 0 ? 9 : num % 9;
    }
}
