package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yz1201
 * @Date: 2022/2/22 8:33
 */
@Slf4j
public class ConvertToTitleTask {
    public static void main(String[] args) {
        System.out.println(convertToTitleCopy(212));
    }

    public static String convertToTitle(int columnNumber) {
        Map<Integer, Character> map = new HashMap<>();
        int len = 26;
        for (int i = 1; i <= len; i++) {
            char c = (char) (i - 1 + 'A');
            map.put(i, c);
        }
        System.out.println(map);
        int num;
        StringBuilder ans = new StringBuilder();
        int t =0;
        while (columnNumber != 0) {
            num = columnNumber % 26;
            columnNumber /= 26;
            ans.append((int)(num * Math.pow(10,t)));
            t++;
        }
        System.out.println(ans);
        return "";
    }

    public static String convertToTitleCopy(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber != 0) {
            columnNumber--;
            sb.append((char)(columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }


}
