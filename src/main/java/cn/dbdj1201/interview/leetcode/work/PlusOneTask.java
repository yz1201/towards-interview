package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2021/12/23 16:46
 */
@Slf4j
public class PlusOneTask {

    public static void main(String[] args) {
        int[] nums = {9};
        System.out.println(Arrays.toString(plusOneLast(nums)));
    }

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        int num = 0;

        int index = 0;
        while (index < len) {
            num += digits[index] * ((int) Math.pow(10, len - index - 1));
            index++;
        }
        num += 1;
        System.out.println(num);
        return null;
    }

    public static int[] plusOne1(int[] digits) {
        StringBuilder sb = new StringBuilder();
        Arrays.stream(digits).forEach(sb::append);
        long num = Long.parseLong(sb.toString()) + 1;
        String numStr = String.valueOf(num);
        int[] result = new int[numStr.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(numStr.substring(i, i + 1));
        }
        return result;
    }

    public static int[] plusOne2(int[] digits) {
        boolean isAdd = digits[0] > 8;
        int len = digits.length;
        int[] result;
        int index;
        if (isAdd) {
            result = new int[len + 1];
            result[0] = 1;
            index = 1;
        } else {
            result = new int[len];
            index = 0;
        }


        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] > 8 && isAdd) {
                result[i + index] = 0;
            } else {
                isAdd = false;
                result[i + index] = digits[i] + 1;
            }
        }
        System.out.println(Arrays.toString(result));
        return null;
    }

    public static int[] plusOne3(int[] digits) {
        boolean isAdd = false;
        int len = digits.length;
        int resultLen = digits[0] > 8 ? (len + 1) : len;
        int[] results = new int[resultLen];
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] > 8) {
                if (isAdd) {
                    if (digits[i] > 8) {
                        results[i + 1] = 0;
                        isAdd = true;
                    } else {
                        results[i + 1] = digits[i] + 1;
                        isAdd = false;
                    }
                } else {
                    results[i + 1] = 0;
                    isAdd = true;
                }
            } else {
                results[i + 1] = digits[i] + 1;
                isAdd = false;
            }
        }
        return results;
    }

    public static int[] plusOne4(int[] digits) {
        boolean isAdd = false;
        int len = digits.length;
        List<Integer> nums = new ArrayList<>();
        for (int i = len - 1; i >= 0; i--) {
            if (i == len - 1) {
                if (digits[i] > 8) {
                    isAdd = true;
                    nums.add(0);
                } else {
                    nums.add(digits[i] + 1);
                }
            } else {
                if (isAdd) {
                    if (digits[i] > 8) {
                        nums.add(0);
                    } else {
                        isAdd = false;
                        nums.add(digits[i] + 1);
                    }
                } else {
                    nums.add(digits[i]);
                }
            }
        }
        if (isAdd) {
            nums.add(1);
        }

        Collections.reverse(nums);
        return nums.stream().mapToInt(i -> i).toArray();
    }

    public static int[] plusOneLast(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; --i) {
            if (digits[i] != 9) {
                ++digits[i];
                for (int j = i + 1; j < n; ++j) {
                    digits[j] = 0;
                }
                return digits;
            }
        }
        // digits 中所有的元素均为 9
        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;
    }
}
