package cn.dbdj1201.interview.leetcode.chapter3;

import java.util.*;

/**
 * @Author: yz1201
 * @Date: 2021/5/26 15:06
 */
public class TwoSum {
    /*
    输入是一个数组（numbers）和一个给定值（target）。输出是两个数的位置，从 1 开始计数。
     */

    public static int[] calPosition(int[] arr, int target) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < arr.length; ++i) {
            if (m.containsKey(target - arr[i])) {
                res[0] = i;
                res[1] = m.get(target - arr[i]);
                break;
            }
            m.put(arr[i], i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] testArr = {1, 2, 3, 45};
//        System.out.println(Arrays.toString(calPosition(testArr, 3)));
        System.out.println(calPositionFool(3, testArr));

    }


    public static List<Integer> calPositionFool(int target, int[] arr) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                result.add(map.get(target - arr[i]));
                result.add(i);
                break;
            }
            map.put(arr[i], i);
        }
        return result;
    }

}
