package cn.dbdj1201.interview.leetcode.work.middle;

import lombok.extern.slf4j.Slf4j;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;

/**
 * @Author: yz1201
 * @Date: 2024/11/8 15:54
 */
@Slf4j
public class M633 {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        BigDecimal bigDecimal = new BigDecimal("2.347kk");
//        System.out.println(bigDecimal.toString());
        System.out.println(2<<4);
        String s = "aabb-cc.dd";
        System.out.println(s.replaceAll("-", ""));

        String encoded = "%25E4%25B8%25AD";
        String decoded = java.net.URLDecoder.decode(encoded, "UTF-8");
        String decoded1 = java.net.URLDecoder.decode(decoded, "UTF-8");
        String decoded2 = java.net.URLDecoder.decode(decoded1, "UTF-8");
        System.out.println(decoded); // 输出:
        System.out.println(decoded1); // 输出:
        System.out.println(decoded2); // 输出:
    }

    public boolean judgeSquareSum(int c) {
        if (c < 3) return false;

        return false;
    }

    public boolean judgeSquareSum2(int c) {
        int i = 2;
        while (i * i <= c) {
            int count = 0;
            while (c % i == 0) {
                c /= i;
                count++;
            }
            if (count % 2 == 1) return false;
            i++;
        }
        return c == 1;
    }
}
