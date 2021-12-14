package cn.dbdj1201.interview.leetcode.bitcal;

/**
 * @Author: yz1201
 * @Date: 2021/6/17 16:39
 */
public class PowerOfFour {
    /*
    给定一个整数，判断它是否是 4 的次方
     背公式專家
     */

    public static void isTure(int n) {
        boolean flag1 = n > 0;
        boolean flag2 = (n & (n - 1)) == 0;
        boolean flag3 = (n & 1431655765) != 0;
        System.out.println(flag1 && flag2 && flag3);
        System.out.println("test flag3 - " + flag3);
    }

    public static void main(String[] args) {
        isTure(44);
        isTure(46);
    }
}
