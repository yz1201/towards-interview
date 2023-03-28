package cn.dbdj1201.interview.test.simple;

import cn.dbdj1201.interview.leetcode.work.simple.Q2389;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @Author: yz1201
 * @Date: 2023/3/17 16:19
 */
@Slf4j
public class T2389 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] nums = {4, 5, 2, 1};
        int[] nums1 = {21};
        Q2389 q2389 = new Q2389();
//        q2389.binarySearch();
        System.out.println(Arrays.toString(q2389.answerQueriesCopy(nums, nums1)));

        int a = 10;
        int b = 10;
        CompletableFuture<Void> f1 = CompletableFuture.runAsync(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            log.info("111 a * b {}", a * b);
        });
        CompletableFuture<Void> f2 = CompletableFuture.runAsync(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(333);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            log.info("222 a * b {}", a * b);
        });
        System.out.println("000 a * b  " + a * b);
        log.info("a * b {}", a * b);
        CompletableFuture.allOf(f1, f2).get();
        System.out.println("end a * b  " + a * b);
    }

}
