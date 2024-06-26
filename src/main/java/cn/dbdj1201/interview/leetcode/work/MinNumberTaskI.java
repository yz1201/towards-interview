package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2022/2/7 9:54
 */
@Slf4j
public class MinNumberTaskI {

    public static void main(String[] args) {
        int[] nums = {2, 12, 32, 0};
        System.out.println(minNumberCopy(nums));
    }

    public static String minNumber(int[] nums) {
        Arrays.sort(nums);
        StringBuilder sb = new StringBuilder();
        Arrays.stream(nums).forEach(sb::append);
        return sb.toString();


    }

    public static String minNumberCopy0(int[] nums) {
        Arrays.sort(nums);
        StringBuilder sb = new StringBuilder();
        Arrays.stream(nums).forEach(sb::append);
        return sb.toString();
    }

    public static String minNumberCopy(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            strs[i] = String.valueOf(nums[i]);
        quickSort(strs, 0, strs.length - 1);
        StringBuilder res = new StringBuilder();
        for (String s : strs)
            res.append(s);
        return res.toString();
    }

    static void quickSort(String[] strs, int l, int r) {
        if (l >= r) return;
        int i = l, j = r;
        String tmp = strs[i];
        while (i < j) {
            while ((strs[j] + strs[l]).compareTo(strs[l] + strs[j]) >= 0 && i < j) j--;
            while ((strs[i] + strs[l]).compareTo(strs[l] + strs[i]) <= 0 && i < j) i++;
            tmp = strs[i];
            strs[i] = strs[j];
            strs[j] = tmp;
        }
        System.out.println(Arrays.toString(strs));
        System.out.println(tmp);
        System.out.println("===========================");
        strs[i] = strs[l];
        strs[l] = tmp;
        quickSort(strs, l, i - 1);
        quickSort(strs, i + 1, r);
    }

}
