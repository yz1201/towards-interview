package cn.dbdj1201.interview.test.medium;

import cn.dbdj1201.interview.leetcode.work.middle.M204;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/8/17 9:47
 */
@Slf4j
public class T204 {

    public static void main(String[] args) {
        M204 m204 = new M204();
        log.info("start  - {}", m204.countPrimes(10));
        System.out.println(m204.countPrimes(499979));
        log.info("end  - {}", m204.countPrimes(10));
    }
}
