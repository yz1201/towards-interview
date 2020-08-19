package cn.dbdj1201.interview.problems;

/**
 * @author yz1201
 * @date 2020-08-13 22:28
 **/
public class Prob10 {

    public static void main(String[] args) {
        /*面试题 10：二进制中 1 的个数
题目：请实现一个函数，输入一个整数，输出该数二进制表示中 1 的个数。例如
把 9 表示成二进制是 1001；有 2 位是 1，因此如果输入 9，函数输出 2.*/

//        System.out.println(findLenInBinaryNum(222));
        System.out.println(numberOf1(222));
    }

    private static int findLenInBinaryNum(int num) {
        String binaryString = Integer.toBinaryString(num);
        int oneSize = 0;
        int len = binaryString.length();

        for (int i = 0; i < len; i++) {
            if (binaryString.charAt(i) == '1') {
                oneSize++;
            }
        }
        return oneSize;
    }

    public static int numberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }
        return count;
    }
}
