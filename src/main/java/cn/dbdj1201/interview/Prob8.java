package cn.dbdj1201.interview;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yz1201
 * @date 2020-08-12 22:01
 **/
@Slf4j
public class Prob8 {

    public static void main(String[] args) {
        /*
        面试题 8：旋转数组的最小数字
         题目描述：把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的
     旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如数
     组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为 1
        */
        int[] nums = {0, 1, 2};
        System.out.println(test(nums));
    }

    private static int test(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (i + 1 == len) {
                break;
            }
            if (nums[i] > nums[i + 1]) {
                return nums[i + 1];
            }
        }
        return nums[0];
    }

}
