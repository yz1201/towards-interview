package cn.dbdj1201.interview.problem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yz1201
 * @date 2020-08-21 22:30
 **/
@Slf4j
public class Prob18 {

    public static void main(String[] args) {
        /*面试题 18：树的子结构
题目：输入两颗二叉树 A 和 B，判断 B 是不是 A 的子结构。*/
    }

    private static void test() {

    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class TreeNode18 {
    int num;
    TreeNode18 left;
    TreeNode18 right;

    public TreeNode18(int num) {
        this.num = num;
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class BinaryTree18{
    TreeNode18 head;

}
