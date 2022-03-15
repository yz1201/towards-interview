package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2022/3/14 15:04
 */
@Slf4j
public class MaxScoreIndicesTask {


    public static void main(String[] args) throws IOException {
//        int[] nums = {0, 0, 1, 0};
        int[] nums = {};

        Path path = Paths.get("E:\\develop\\temp\\test\\testCase");
//        Buffer buffer = new Buffer()
        FileInputStream in = new FileInputStream("E:\\develop\\temp\\test\\testCase");
        FileChannel fc = in.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        StringBuilder text = new StringBuilder();
        while (fc.read(buffer) != -1) {
            buffer.flip();
            while (buffer.hasRemaining()) {
                text.append((char) buffer.get());
            }
            buffer.clear();
        }
        fc.close();
        text.deleteCharAt(0);
        text.deleteCharAt(text.length() - 1);
        String[] split = text.toString().split(",");
//        numList = Arrays.stream(split).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
//        System.out.println(text);

//        Integer[] a = numList.toArray(new Integer[0]);
//        System.out.println(Arrays.toString(a));
//        List<Integer> list = List.of(1, 2, 3, 4);
//        System.out.println(list.subList(0, 3));
        int[] nums1 = {0,0,1,0};
        log.info("start");
//        System.out.println(maxScoreIndices(Arrays.stream(split).mapToInt(Integer::parseInt).toArray()));
        System.out.println(maxScoreIndicesCopy(nums1));
        log.info("end");

    }

    public static List<Integer> maxScoreIndices(int[] nums) {
        int len = nums.length;
        List<Integer> arr = Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<Integer> arr1;
        List<Integer> arr2;
//        arr2 = arr.subList(0, len);
//        long score = arr2.stream().filter(num -> num == 1).mapToInt(Integer::intValue).count();
        long count = arr.stream().filter(num -> num == 1).mapToInt(Integer::intValue).count();
        long count1 = arr.stream().filter(num -> num == 0).mapToInt(integer -> 0).count();
        System.out.println(count + "===" + count1);
        long score = Math.max(count, count1);
        Map<Integer, Long> map = new HashMap<>();
        map.put(len, count1);
        map.put(0, count);
        System.out.println(map);
        for (int i = 1; i < len; i++) {
            arr1 = arr.subList(0, i);
            arr2 = arr.subList(i, len);
            long totalScore = arr1.stream().filter(num -> num == 0).mapToInt(integer -> 0).count()
                    + arr2.stream().filter(num -> num == 1).mapToInt(Integer::intValue).count();
            map.put(i, totalScore);
            score = Math.max(score, totalScore);
        }

        long finalScore = score;
        System.out.println(score);
        return map.entrySet().stream().filter(entry -> entry.getValue() == finalScore).map(Map.Entry::getKey).collect(Collectors.toList());
    }

    public static List<Integer> maxScoreIndicesCopy(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        ans.add(0);
        int max = 0, preSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                preSum++;
                if (preSum > max) {
                    ans = new ArrayList<>();
                    ans.add(i + 1);
                    max = preSum;
                } else if (preSum == max) {
                    ans.add(i + 1);
                }
            } else {
                preSum--;
            }
        }
        return ans;
    }
}
