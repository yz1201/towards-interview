package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: yz1201
 * @Date: 2022/3/9 10:08
 */
@Slf4j
public class SearchMatrixTask {

    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{2,3,4}};
        System.out.println(searchMatrixCopy(nums, 5));
    }


    public static boolean searchMatrix(int[][] matrix, int target) {

        Set<Integer> set = new HashSet<>();
        Arrays.stream(matrix).forEach(nums-> Arrays.stream(nums).forEach(set::add));
//        System.out.println(set);
        return set.contains(target);
    }

    public static boolean searchMatrixCopy(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        return dfs(matrix, 0, matrix[0].length - 1, target);
    }

    private static boolean dfs(int[][] matrix, int r, int c, int target) {
        if (r < 0 || c < 0 || r == matrix.length || c == matrix[0].length) return false;
        if (target == matrix[r][c]) return true;
        // 如果target小于当前节点，查找左子树；否则查找右子树
        return target < matrix[r][c] ? dfs(matrix, r, c - 1, target) : dfs(matrix, r + 1, c, target);
    }

}
