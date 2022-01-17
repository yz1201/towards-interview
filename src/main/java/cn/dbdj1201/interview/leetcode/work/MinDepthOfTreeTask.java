package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/1/17 15:29
 */
@Slf4j
public class MinDepthOfTreeTask {

    public static void main(String[] args) {

    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        }
    }

    public int minDepthCopy(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        int minDepth = Integer.MAX_VALUE;
        if (root.left != null) minDepth = Math.min(minDepth, minDepthCopy(root.left));
        if (root.right != null) minDepth = Math.min(minDepth, minDepthCopy(root.right));
        return minDepth + 1;
    }
}
