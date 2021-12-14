package cn.dbdj1201.interview.leetcode.bitcal;

/**
 * @Author: yz1201
 * @Date: 2021/6/3 20:30
 */
public class Test01 {
    /*
    给定两个十进制数字，求它们二进制表示的汉明距离（Hamming distance，即不同位的个数）。
     */

    public int calHammingDistance(int num1, int num2) {
        String numStr1 = Integer.toBinaryString(num1);
        String numStr2 = Integer.toBinaryString(num2);
        //掏出二进制的序列
        //取短，多余部分计1个数
        //按短长度序列比较，计1个数
        //与2相加
        return -1;
    }

    public static int calHammingDistanceSmart(int num1, int num2) {
        int diff = num1 ^ num2;
        int result = 0;
        while (diff != 0) {
            result += diff & 1;
            diff >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(1 ^ 0);
//        System.out.println(Integer.toBinaryString(11));

//        System.out.println(calHammingDistanceSmart(1, 8));


    }
}
