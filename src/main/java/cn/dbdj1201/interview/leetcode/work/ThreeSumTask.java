package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2022/6/2 14:41
 */
@Slf4j
public class ThreeSumTask {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        try (
                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\86159\\Desktop\\test-3sum.txt"));
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        }
        String s = sb.toString();
//        System.out.println(s);
        s = s.replaceAll("\\[", "");
        s = s.replaceAll("\\]", "");
//        System.out.println(s);
        String[] split = s.split(",");
        System.out.println("arr len -> " + split.length);
        List<Integer> collect = Arrays.stream(split).map(Integer::valueOf).collect(Collectors.toList());
        int[] nums = collect.stream().mapToInt(Integer::intValue).toArray();
//        int[] nums = {-1, 0, 1, 2, -1, -4};
        log.info("start");
        TimeUnit nanoseconds = TimeUnit.NANOSECONDS;
        LocalDateTime before = LocalDateTime.now();
        System.out.println(before);
        threeSum(nums);
        LocalDateTime after = LocalDateTime.now();
        System.out.println(Duration.between(before, after).toMillis());
        log.info("end");


        LocalDateTime before1 = LocalDateTime.now();
        threeSumCopy(nums);
        LocalDateTime after1 = LocalDateTime.now();
        System.out.println(Duration.between(before1, after1).toMillis());

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if (len < 3) return res;

        for (int i = 0; i < len; i++) {
            int first = nums[i];
            for (int j = i + 1; j < len; j++) {
                int second = nums[j];
                for (int k = j + 1; k < len; k++) {
                    int third = nums[k];
                    if (first + second + third == 0) {
                        List<Integer> listToSort = new ArrayList<>(List.of(first, second, third));
                        Collections.sort(listToSort);
                        if (!res.contains(listToSort))
                            res.add(listToSort);
                    }
                }
            }
        }

//        System.out.println(res);

        return null;
    }

    public static List<List<Integer>> threeSumCopy(int[] nums) {// 总时间复杂度：O(n^2)
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length <= 2) return ans;

        Arrays.sort(nums); // O(nlogn)

        for (int i = 0; i < nums.length - 2; i++) { // O(n^2)
            if (nums[i] > 0) break; // 第一个数大于 0，后面的数都比它大，肯定不成立了
            if (i > 0 && nums[i] == nums[i - 1]) continue; // 去掉重复情况
            int target = -nums[i];
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    // 现在要增加 left，减小 right，但是不能重复，比如: [-2, -1, -1, -1, 3, 3, 3], i = -2, left = 1, right = 6, [-2, -1, 3] 的答案加入后，需要排除重复的 -1 和 3
                    left++;
                    right--; // 首先无论如何先要进行加减操作
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (nums[left] + nums[right] < target) {
                    left++;
                } else {  // nums[left] + nums[right] > target
                    right--;
                }
            }
        }
        return ans;
    }


}
