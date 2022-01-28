package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yz1201
 * @Date: 2022/1/28 17:40
 */
@Slf4j
public class LargestUniqueNumberTaskI {

    public static void main(String[] args) {
        //[5,7,3,9,4,9,8,3,1]
//        int[] nums = {1, 3, 5, 2, 5, 4};
        /*
        [669,669,434,434,615,615,133,133,849,849,372,372,101,101,203,203,209,209,380,380,712,712,362,362,84,84,401,401,664,664,362,362,663,663,128,128,131,131,851,851,344,344,88,88,120,120,179,179,791,791,300,300,901,901,980,980,622,622,873,873,194,194,600,600,42,42,923,923,645,645,572,572,216,216,123,123,47,47,687,687]
         */
//        int[] nums = {5, 7, 3, 9, 4, 9, 8, 3, 1};
        int[] nums = {669, 669, 434, 434, 615, 615, 133, 133, 849, 849, 372, 372, 101,
                101, 203, 203, 209, 209, 380, 380, 712, 712, 362, 362, 84, 84, 401, 401, 664, 664, 362, 362, 663, 663,
                128, 128, 131, 131, 851, 851, 344, 344, 88, 88, 120, 120, 179, 179, 791, 791, 300, 300, 901, 901, 980,
                980, 622, 622, 873, 873, 194, 194, 600, 600, 42, 42, 923, 923, 645, 645, 572, 572, 216, 216, 123, 123,
                47, 47, 687, 687};
        System.out.println(largestUniqueNumber1(nums));
    }

    public static int largestUniqueNumber(int[] nums) {
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        if (nums.length < 1) return -1;
        int asInt = Arrays.stream(nums).max().getAsInt();
        int cnt = 0;
        for (int num : nums) {
            if (num == asInt) cnt++;
        }
        if (cnt == 1) return asInt;
        return -1;
    }

    public static int largestUniqueNumber1(int[] nums) {
        if (nums.length < 1) return -1;
        Arrays.sort(nums);
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int num : nums) {
            if (!numsMap.containsKey(num))
                numsMap.put(num, 1);
            else
                numsMap.put(num, numsMap.get(num) + 1);
        }
        System.out.println(numsMap);
        int maxIndex = nums.length - 1;
        while (maxIndex >= 0) {
            if (numsMap.get(nums[maxIndex]) == 1) return nums[maxIndex];
            maxIndex--;
        }
        return -1;
//        return findMaxUniqueNumber(nums);
    }

}
