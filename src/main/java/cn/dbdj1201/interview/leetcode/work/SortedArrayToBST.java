package cn.dbdj1201.interview.leetcode.work;

/**
 * @Author: yz1201
 * @Date: 2022/1/17 15:13
 */
public class SortedArrayToBST {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
    }


    public static TreeNode sortedArrayToBSTCopy(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    public static TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        // 总是选择中间位置左边的数字作为根节点
        int mid = (left + right) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }

}
