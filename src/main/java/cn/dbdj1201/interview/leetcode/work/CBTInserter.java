package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

/**
 * @Author: yz1201
 * @Date: 2022/7/25 14:30
 */
@Slf4j
public class CBTInserter {

    private TreeNode root = new TreeNode();

    public CBTInserter(TreeNode root) {
        this.root = root;
    }

    public int insert(int val) {
        if (this.root == null) return -1;
        return insertVal(root, val);
    }

    private int insertVal(TreeNode root, int val) {
        return -1;
    }

    private int insertValV1(TreeNode root, int val) {
        if (root == null) return 0;

        if (root.left == null && root.right == null) {
            root.left = new TreeNode(val);
            return root.val;
        } else if (root.left != null && root.right == null) {
            root.right = new TreeNode(val);
            return root.val;
        } else if (root.left == null) {
            root.left = new TreeNode(val);
            return root.val;
        } else {
            return insertVal(root.left, val);
        }
//        } else return insertVal(Objects.requireNonNullElseGet(root.left, () -> root.right), val);
    }

    public TreeNode get_root() {
        return this.root;
    }
}
