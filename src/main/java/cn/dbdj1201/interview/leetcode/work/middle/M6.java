package cn.dbdj1201.interview.leetcode.work.middle;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2023/8/31 10:40
 */
@Slf4j
public class M6 {

    public String convert(String s, int numRows) {
        // PAYPALISHIRING 14 3
        char[] cs = s.toCharArray();
        int len = cs.length;
        int col = len / numRows;
        int[][] arr = new int[numRows][col];
        int index = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < numRows; j++) {
                arr[j][i] = cs[index++];
            }
        }
        return null;
    }

    public String convertCopy(String s, int numRows) {
        if(numRows < 2) return s;
        List<StringBuilder> rows = new ArrayList<>();
        for(int i = 0; i < numRows; i++) rows.add(new StringBuilder());
        int i = 0, flag = -1;
        for(char c : s.toCharArray()) {
            rows.get(i).append(c);
            if(i == 0 || i == numRows -1) flag = - flag;
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder row : rows) res.append(row);
        return res.toString();
    }

    public String convertCopy2(String s, int numRows) {
        int n = s.length();
        if (numRows == 1 || numRows >= n) {
            return s;
        }
        StringBuffer[] mat = new StringBuffer[numRows];
        for (int i = 0; i < numRows; ++i) {
            mat[i] = new StringBuffer();
        }
        for (int i = 0, x = 0, t = numRows * 2 - 2; i < n; ++i) {
            mat[x].append(s.charAt(i));
            if (i % t < numRows - 1) {
                ++x;
            } else {
                --x;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuffer row : mat) {
            ans.append(row);
        }
        return ans.toString();
    }
}
