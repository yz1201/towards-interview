package cn.dbdj1201.interview.test.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @Author: yz1201
 * @Date: 2023/10/18 9:12
 */
@Slf4j
public class M2530 {

    public long maxKelements(int[] nums, int k) {
        long sum = 0;
        for (int i = 0; i < nums.length;) {
            double max = Arrays.stream(nums).max().getAsInt();
            if (nums[i] == max){
                double d1 = nums[i];
                int res = (int) Math.ceil(d1 / 3);
                sum += max;
                nums[i] = res;
                k--;
                i = 0;
                if (k == 0) break;
            }else{
                i++;
            }
        }
        return sum;
    }

    public long maxKelementsV1(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
        for (int num : nums) {
            q.offer(num);
        }
        long ans = 0;
        for (int i = 0; i < k; ++i) {
            int x = q.poll();
            ans += x;
            q.offer((x + 2) / 3);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Math.ceil(10d / 3d));
    }
}
