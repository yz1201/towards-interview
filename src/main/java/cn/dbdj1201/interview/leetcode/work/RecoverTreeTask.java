package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2022/3/10 20:44
 */
@Slf4j
public class RecoverTreeTask {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(4);
        TreeNode root3 = new TreeNode(2);
        root.left = root1;
        root.right = root2;
        root2.left = root3;
        recoverTree(root);
        System.out.println(root);
    }

    public static void recoverTree(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode x = null, y = null, pred = null;

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (pred != null && root.val < pred.val) {
                y = root;
                if (x == null) {
                    x = pred;
                } else {
                    break;
                }
            }
            pred = root;
            root = root.right;
        }
        swap(x, y);
    }

    public static void swap(TreeNode x, TreeNode y) {
        int tmp = x.val;
        x.val = y.val;
        y.val = tmp;
    }


    public static void recoverTreeCopy(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        inorderCopy(root, nums);
        int[] swapped = findTwoSwappedCopy(nums);
        recoverCopy(root, 2, swapped[0], swapped[1]);
    }

    public static void inorderCopy(TreeNode root, List<Integer> nums) {
        if (root == null) {
            return;
        }
        inorderCopy(root.left, nums);
        nums.add(root.val);
        inorderCopy(root.right, nums);
    }

    public static int[] findTwoSwappedCopy(List<Integer> nums) {
        int n = nums.size();
        int index1 = -1, index2 = -1;
        for (int i = 0; i < n - 1; ++i) {
            if (nums.get(i + 1) < nums.get(i)) {
                index2 = i + 1;
                if (index1 == -1) {
                    index1 = i;
                } else {
                    break;
                }
            }
        }
        int x = nums.get(index1), y = nums.get(index2);
        return new int[]{x, y};
    }

    public static void recoverCopy(TreeNode root, int count, int x, int y) {
        if (root != null) {
            if (root.val == x || root.val == y) {
                root.val = root.val == x ? y : x;
                if (--count == 0) {
                    return;
                }
            }
            recoverCopy(root.right, count, x, y);
            recoverCopy(root.left, count, x, y);
        }
    }


}
