package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

/**
 * @Author: yz1201
 * @Date: 2022/1/12 15:36
 */
@Slf4j
public class MaxDepthOfTreeTask {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(3);
        TreeNode l12 = new TreeNode(4);
        TreeNode l123 = new TreeNode(5);
        TreeNode l1234 = new TreeNode(6);
        root.left = l1;
//        root.right = r1;

        l1.left = l12;
        l12.left = l123;
        l123.left = l1234;

        System.out.println(maxDepth1(root));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }

    public static int maxDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = 1;
        return getMaxDepth(root, depth);
    }

    private static int getMaxDepth(TreeNode root, int depth) {
        if (root.left == null && root.right == null) {
            return depth;
        } else if (root.left == null || root.right == null) {
            return depth + getMaxDepth(Objects.requireNonNullElseGet(root.left, () -> root.right), depth);
        } else {
            return depth + Math.max(getMaxDepth(root.left, depth), getMaxDepth(root.right, depth));
        }
    }

}
