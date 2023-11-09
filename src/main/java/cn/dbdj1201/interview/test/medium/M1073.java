package cn.dbdj1201.interview.test.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2023/5/18 9:30
 */
@Slf4j
public class M1073 {

    public int[] addNegabinary(int[] arr1, int[] arr2) {
        int num1 = this.explain(arr1);
        int num2 = this.explain(arr2);
        int res = num1 + num2;
        return this.explainNumToArr(res);
    }

    private int[] explainNumToArr(int res) {
        if (res == 0) return new int[]{0};
        if (res == 1) return new int[]{1};
        int[] arr = null;
        List<Integer> nums = new ArrayList<>();
        // 11  -5  2  1  0
        while (res != 0) {
            if ((Math.abs(res) & 1) == 0) {
                res = (res - 1) % 2;
                nums.add(1);
            } else {
                res %= -2;
                nums.add(0);
            }
        }
        arr = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            arr[i] = nums.get(nums.size() - i - 1);
        }
        return arr;
    }

    private int explain(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            if (nums[0] == 0)
                return 0;
            return 1;
        }
        int res = 0;
        int numBase = -2;
        for (int i = 0; i < len; i++) {
            res += (int) Math.pow(numBase, len - 1 - i) * nums[i];
        }
        return res;
    }

    public int[] addNegabinaryCopy(int[] arr1, int[] arr2) {
        int i = arr1.length - 1, j = arr2.length - 1;
        int carry = 0;
        List<Integer> ans = new ArrayList<Integer>();
        while (i >= 0 || j >= 0 || carry != 0) {
            int x = carry;
            if (i >= 0) {
                x += arr1[i];
            }
            if (j >= 0) {
                x += arr2[j];
            }
            if (x >= 2) {
                ans.add(x - 2);
                carry = -1;
            } else if (x >= 0) {
                ans.add(x);
                carry = 0;
            } else {
                ans.add(1);
                carry = 1;
            }
            --i;
            --j;
        }
        // remove 前导0
        while (ans.size() > 1 && ans.get(ans.size() - 1) == 0) {
            ans.remove(ans.size() - 1);
        }
        int[] arr = new int[ans.size()];
        //reverse
        for (i = 0, j = ans.size() - 1; j >= 0; i++, j--) {
            arr[i] = ans.get(j);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
//        System.out.println("end : " + explain(nums));

        System.out.println(11 / 2);
    }
}
