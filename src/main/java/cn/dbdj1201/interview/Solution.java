package cn.dbdj1201.interview;

/**
 * @author yz1201
 * @date 2020-08-10 23:26
 **/
public class Solution {
    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode root = new TreeNode(pre[0]);//前序的第一个数定为根
        int len = pre.length;
        //当只有一个数的时候
        if (len == 1) {
            root.left = null;
            root.right = null;
            return root;
        }
        //找到中序中的根位置
        int rootval = root.num;
        int i;
        for (i = 0; i < len; i++) {
            if (rootval == in[i])
                break;
        }
        //创建左子树
        if (i > 0) {
            int[] pr = new int[i];
            int[] ino = new int[i];
            for (int j = 0; j < i; j++) {
                pr[j] = pre[j + 1];
            }
            for (int j = 0; j < i; j++) {
                ino[j] = in[j];
            }
            root.left = reConstructBinaryTree(pr, ino);
        } else {
            root.left = null;
        }
        //创建右子树
        if (len - i - 1 > 0) {
            int[] pr = new int[len - i - 1];
            int[] ino = new int[len - i - 1];
            for (int j = i + 1; j < len; j++) {
                ino[j - i - 1] = in[j];
                pr[j - i - 1] = pre[j];
            }
            root.right = reConstructBinaryTree(pr, ino);
        } else {
            root.right = null;
        }


        return root;
    }

    public static void main(String[] args) {
        int[] bt1 = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] bt2 = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode root = reConstructBinaryTree(bt1, bt2);
        System.out.println(root);
    }
}

