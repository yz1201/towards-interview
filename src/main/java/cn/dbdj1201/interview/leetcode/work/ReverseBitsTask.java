package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2021/12/30 15:50
 */
@Slf4j
public class ReverseBitsTask {
    public static void main(String[] args) {
        String input = "00000010100101000001111010011100";
        System.out.println(input);
        int num = Integer.parseUnsignedInt(input, 2);
        System.out.println(reverseBits(num));

    }

    public static int reverseBits(int n) {
        System.out.println(n);
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(s);
        while (sb.length()<32){
            sb.insert(0,0);
        }
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(Integer.reverse(n));
        return Integer.parseUnsignedInt(sb.toString(), 2);
    }


}
