package cn.dbdj1201.interview.test.simple;

import cn.dbdj1201.interview.leetcode.work.simple.S860;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2024/2/20 14:59
 */
@Slf4j
public class T860 {

    public static void main(String[] args) {
        int[] bills = {5,5,5,10,5,5,10,20,20,20};
        System.out.println(new S860().lemonadeChangeCp(bills));
    }
}
