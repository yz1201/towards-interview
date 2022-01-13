package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/1/11 14:32
 */
@Slf4j
public class SameTreeTask {
    public static void main(String[] args) {
        TreeNode one = new TreeNode(0);
        TreeNode left1 = new TreeNode(1);
        TreeNode right1 = new TreeNode(2);
        one.left = left1;
        one.right = right1;

        TreeNode two = new TreeNode(0);
        TreeNode left2 = new TreeNode(1);
        TreeNode right2 = new TreeNode(2);
        two.left = left2;
        two.right = right2;

        System.out.println(isSameTree(one, two));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }

    public  static boolean isSymmetric(TreeNode root) {
        if (root == null){
            return false;
        }
        return judgeSymmetric(root.left,root.right);
    }

    public static boolean judgeSymmetric(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        } else {
            return judgeSymmetric(p.left, q.right) && judgeSymmetric(p.right, q.left);
        }
    }

}
