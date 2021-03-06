package cn.dbdj1201.interview.problems;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: dbdj1201
 * @Date: 2020-08-10 19:18
 */
//@Slf4j
public class Problem6 {

    public static void main(String[] args) {
        /*
        输入二叉树的前序遍历和中序遍历的结果，重建出该二叉树。假设前序遍历和中序遍历结果中都不包含重复的数字，例如输入的前序遍历序列
        {1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}重建出如图所示的二叉树
        */
//        log.info();

//        BinaryTree binaryTree = generateTree();
//        binaryTree.preOrder();
        int[] bt1 = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] bt2 = {4, 7, 2, 1, 5, 3, 8, 6};
//        System.out.println(treeBuilder(bt1, bt2));
        treeBuilder(bt1, bt2).postOrder();
    }

    /**
     * @param bt1 前序遍历结果
     * @param bt2 中序遍历结果
     */
    private static void test(int[] bt1, int[] bt2) {
        //{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
        int rootValue = bt1[0];
//        TreeNode root = new TreeNode(bt1[0]);
        int index = 0;
        while (bt2[index] != rootValue) {
            index++;
        }
        //中序遍历的root位置 index
        System.out.println(index);
        //锁定根节点左子树范围 0, index-2
//        int leftIndex = 0;
//        while (leftIndex < index - 2) {
//
//        }
        //右子树范围index, len-1

    }

    /**
     * @param pre 前序遍历结果集
     * @param in  中序遍历结果集
     * @return
     */
    private static TreeNode treeBuilder(int[] pre, int[] in) {
        if (pre == null || in == null) {
            throw new IllegalArgumentException("brain is a good east-west ^^");
        }

        int rootValue = pre[0];
        TreeNode root = new TreeNode(rootValue);

        int index = 0;
        while (in[index] != rootValue) {
            index++;
        }

        if (index > 0) {
            int[] pr = new int[index];
            int[] ino = new int[index];
            System.arraycopy(pre, 1, pr, 0, index);
            System.arraycopy(in, 0, ino, 0, index);
            root.left = treeBuilder(pr, ino);
        } else {
            root.left = null;
        }

        int len = pre.length;
        int rightLen = len - index - 1;
        //{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
        if (rightLen > 0) {
            int[] pr = new int[rightLen];
            int[] ino = new int[rightLen];
            for (int j = index + 1; j < len; j++) {
                ino[j - index - 1] = in[j];
                pr[j - index - 1] = pre[j];
            }
            root.right = treeBuilder(pr, ino);
        } else {
            root.right = null;
        }

        return root;
    }


    private static BinaryTree generateTree() {

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node3.right = node5;

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = node1;
        return binaryTree;
    }
}

@Data
//@Slf4j
@AllArgsConstructor
@NoArgsConstructor
class TreeNode {
    //实例数据
    int num;
    //左子节点
    TreeNode left;
    //右子节点
    TreeNode right;

    public TreeNode(int num) {
        this.num = num;
    }

    //前序遍历，根左右 递归
    void preOrder() {
        System.out.println("root - " + this);

        if (this.left != null) {
            this.left.preOrder();
        }

        if (this.right != null) {
            this.right.preOrder();
        }
    }

    void postOrder() {

        if (this.left != null) {
            this.left.postOrder();
        }

        if (this.right != null) {
            this.right.postOrder();
        }
        System.out.println("root - " + this);
    }


    @Override
    public String toString() {
        return "TreeNode{" +
                "num=" + num +
                '}';
    }
}

@Data
//@Slf4j
@AllArgsConstructor
@NoArgsConstructor
class BinaryTree {

    TreeNode root;

    public void preOrder() {
        if (root == null) {
            System.out.println("头节点为空，二叉树死了┭┮﹏┭┮");
        } else {
            root.preOrder();
        }

    }

    public void postOrder() {
        if (root == null) {
            System.out.println("头节点为空，二叉树死了┭┮﹏┭┮");
        } else {
            root.postOrder();
        }
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
