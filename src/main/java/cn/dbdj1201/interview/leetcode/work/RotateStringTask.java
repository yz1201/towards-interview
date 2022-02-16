package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2022/2/16 16:33
 */
@Slf4j
public class RotateStringTask {

    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
    }

    public static boolean rotateString(String s, String goal) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            String head = s.substring(0,1);
            String tail = s.substring(1);
            System.out.println(head + "--"+tail);
            s = tail + head;
            if (s.equals(goal))
                return true;
        }
        return false;
    }

    public static boolean rotateStringCopy(String A, String B) {
        return A.length() == B.length() && (A + A).contains(B);
    }


    public boolean rotateStringCopy2(String A, String B) {
        int N = A.length();
        if (N != B.length()) return false;
        if (N == 0) return true;

        //Compute shift table
        int[] shifts = new int[N+1];
        Arrays.fill(shifts, 1);
        int left = -1;
        for (int right = 0; right < N; ++right) {
            while (left >= 0 && (B.charAt(left) != B.charAt(right)))
                left -= shifts[left];
            shifts[right + 1] = right - left++;
        }

        //Find match of B in A+A
        int matchLen = 0;
        for (char c: (A+A).toCharArray()) {
            while (matchLen >= 0 && B.charAt(matchLen) != c)
                matchLen -= shifts[matchLen];
            if (++matchLen == N) return true;
        }

        return false;
    }

}
