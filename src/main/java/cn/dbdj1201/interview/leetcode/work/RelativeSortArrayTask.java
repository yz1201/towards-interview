package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @Author: yz1201
 * @Date: 2022/3/7 10:12
 */
@Slf4j
public class RelativeSortArrayTask {

    public static void main(String[] args) {
        int[] arr1= {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2= {2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArrayCopy(arr1, arr2)));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        List<Integer> tempList = new ArrayList<>();
        int[] ansArr = new int[len1];
        Arrays.sort(arr1);
        int index = 0;
        for (int j : arr1) {
            for (int i1 : arr2) {
                if (j != i1) {
                    tempList.add(i1);
                } else {
                    ansArr[index] = j;
                    index++;
                }
            }
        }

        int size = tempList.size();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                ansArr[len1 - i - 1] = tempList.get(i);
            }
        }

        return ansArr;
    }

    public static int[] relativeSortArray1(int[] arr1, int[] arr2) {
        int len1= arr1.length;
        int len2 =arr2.length;

        int[] ans = new int[len1];

        for (int i = 0; i < len2; i++) {


        }


        return null;
    }

    public static int[] relativeSortArrayCopy(int[] arr1, int[] arr2) {
        int upper = 0;
        for (int x : arr1) {
            upper = Math.max(upper, x);
        }
        int[] frequency = new int[upper + 1];
        for (int x : arr1) {
            ++frequency[x];
        }
        int[] ans = new int[arr1.length];
        int index = 0;
        for (int x : arr2) {
            for (int i = 0; i < frequency[x]; ++i) {
                ans[index++] = x;
            }
            frequency[x] = 0;
        }
        for (int x = 0; x <= upper; ++x) {
            for (int i = 0; i < frequency[x]; ++i) {
                ans[index++] = x;
            }
        }
        return ans;
    }


}
