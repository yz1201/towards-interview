package cn.dbdj1201.interview.leetcode.bitcal;

/**
 * @Author: yz1201
 * @Date: 2021/6/17 15:16
 */
public class IntegerReverse {

    /*
给定一个十进制整数，输出它在二进制下的翻转结果。
     */

    public static int integerReverse(int n) {
        int ans = 0;
        StringBuilder ansStr = new StringBuilder();
        for (int i = 0; i < 32; ++i) {
            ans <<= 1;
            ans += n & 1;
            ansStr.append(n & 1);
            n >>= 1;
            //若不讲补齐32的0作为有效数字，放开这部分
//            if (n <=0){
//                break;
//            }
        }
        System.out.println(ansStr);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(43261596));
        System.out.println(integerReverse(43261596));

    }
}
