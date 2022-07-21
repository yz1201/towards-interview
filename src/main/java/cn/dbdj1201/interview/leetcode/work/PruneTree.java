package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/7/21 16:30
 */
@Slf4j
public class PruneTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode r1 = new TreeNode(0);
        TreeNode l1 = new TreeNode(0);
        TreeNode l2 = new TreeNode(1);
        root.right = r1;
        r1.left = l1;
        r1.right = l2;
        System.out.println(pruneTreeCopy(root));
    }

    public static TreeNode pruneTree(TreeNode root) {

        if (root == null) return null;

        TreeNode temp = root;

        while (temp != null){


        }

//        dfs(root,);

        return null;
    }
/*    public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }*/

    public static TreeNode pruneTreeCopy(TreeNode root) {
        if (root == null) {
            return null;
        }
        root.left = pruneTreeCopy(root.left);
        root.right = pruneTreeCopy(root.right);
        if (root.left == null && root.right == null && root.val == 0) {
            return null;
        }
        return root;
    }

}
