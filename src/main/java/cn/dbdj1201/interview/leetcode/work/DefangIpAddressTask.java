package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/4/23 16:46
 */
@Slf4j
public class DefangIpAddressTask {
    public static void main(String[] args) {
        String test ="1.1.1.1";
        System.out.println(test.replaceAll("\\.","[.]"));
    }

    public static String defangIPaddr(String address) {

        address.replaceAll("\\.","[.]");

        return null;
    }
}
