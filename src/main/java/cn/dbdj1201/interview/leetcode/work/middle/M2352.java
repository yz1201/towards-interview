package cn.dbdj1201.interview.leetcode.work.middle;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2023/6/6 8:36
 */
@Slf4j
public class M2352 {

    public int equalPairs(int[][] grid) {
        /*
          1 2 1
          2 2 2
          3 2 1
         */

        int length = grid.length;
        int count = 0;
        for (int[] rowData : grid) {
            int[] columnData = new int[length];
            int size = length - 1;
            while (size >= 0) {
                for (int i1 = 0; i1 < length; i1++) {
                    columnData[i1] = grid[i1][size];
                }
                size--;
                if (Arrays.equals(rowData, columnData))
                    count++;
            }
        }
        return count;
    }

    public int equalPairsCopy(int[][] grid) {
        int res = 0, n = grid.length;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (equal(row, col, n, grid)) {
                    res++;
                }
            }
        }
        return res;
    }

    public boolean equal(int row, int col, int n, int[][] grid) {
        for (int i = 0; i < n; i++) {
            if (grid[row][i] != grid[i][col]) {
                return false;
            }
        }
        return true;
    }

}
