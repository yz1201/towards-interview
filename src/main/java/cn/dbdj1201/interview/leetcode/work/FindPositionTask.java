package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/2/23 15:04
 */
@Slf4j
public class FindPositionTask {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        findPoisonedDuration1(nums, 4);

    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans = duration;
        int length = timeSeries.length;
        for (int i = 0; i < length - 1; i++) {
            if (timeSeries[i] + duration > timeSeries[i + 1]) {
                ans = ans + duration - timeSeries[i + 1] + timeSeries[i];
            }
        }
        System.out.println(ans);
        return -1;
    }

    public static int findPoisonedDuration1(int[] timeSeries, int duration) {
        int ans = duration;
        int length = timeSeries.length;
        int index = length - 1;
        while (index >= 0) {
            while (index > 0 && timeSeries[index] - duration < timeSeries[index - 1]) {
                index--;
            }

            if (index > 0){

            }else {

            }

            System.out.println(index);

            index--;
        }
        System.out.println(ans);
        return -1;
    }

    public static int findPoisonedDuration2(int[] timeSeries, int duration) {
        int ans = duration;
        int length = timeSeries.length;
        int index = length - 1;
        while (index < length) {
            while (index > 0 && timeSeries[index] - duration < timeSeries[index - 1]) {
                index--;
            }

            if (index > 0){

            }else {

            }

            System.out.println(index);

            index++;
        }
        System.out.println(ans);
        return -1;
    }

    public int findPoisonedDurationCopy(int[] timeSeries, int duration) {
        int ans = 0;
        int expired = 0;
        for (int timeSery : timeSeries) {
            if (timeSery >= expired) {
                ans += duration;
            } else {
                ans += timeSery + duration - expired;
            }
            expired = timeSery + duration;
        }
        return ans;
    }

}

