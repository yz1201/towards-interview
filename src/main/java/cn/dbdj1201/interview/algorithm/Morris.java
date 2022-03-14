package cn.dbdj1201.interview.algorithm;

import cn.dbdj1201.interview.leetcode.work.TreeNode;

/**
 * @Author: yz1201
 * @Date: 2022/3/11 8:43
 */
public class Morris {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(4);
        TreeNode root3 = new TreeNode(2);
        root.left = root1;
        root.right = root2;
        root2.left = root3;
        morris(root);
    }

    public static void morris(TreeNode root){
        //进入方法让cur = root
        TreeNode cur = root;
        //没有遍历完之前持续循环
        while (cur != null){
            /*
            对于迭代还是递归，一个节点的左子树即使为空
            它们都会让cur = left 然后回溯回来
            morris这里就会判断如果一个节点的左边为空就不会去
            */
            if (cur.left == null){
                cur = cur.right;
            }else {
                /*
                让next = cur.left，然后一直往左子树的最右面走
                （上文已经说明了为什么要这么做）
                */
                TreeNode next = cur.left;
                while (next.right != null && next.right != cur)
                    next = next.right;
                /*
                此时next经过上面while循环的
                next = next.right之后
                已经走到了左子树的最右边，我们讨论过此时要让
                next.right = cur
                以便cur走到这里时可以回溯回去，
                这件事是if(next.right == null)时
                要做的，else中做的是cur回溯回去了，
                但是下一次经历最外面的while循环
                时他还会创建一个next = cur.left的引用
                然后一直遍历到cur左子树的最右面
                这次是第二次经过这里我们知道
                next.right != null 而是next.right == cur
                为了保证原树不变我们要把这条线擦掉，
                即next.right = null，然后让cur = cur.right
                即cur的左子树走完了，让cur去走右子树。
                 */
                if (next.right == null){
                    next.right = cur;
                    cur = cur.left;
                }else {
                    System.out.print(cur.val+" ");
                    cur = cur.right;
                    next.right = null;
                }
            }
        }
    }

}
