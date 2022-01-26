package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2022/1/25 10:11
 */
@Slf4j
public class CountSegmentsTask {

    public static void main(String[] args) {
        String s = "Hello,    my     name    is John";
        System.out.println(countSegmentsInspiredByLc(s));
    }

    public static int countSegments(String s) {
        s = s.trim();
        int len = s.length();
        System.out.println(len);
        if (len < 1) return 0;
        int index = 1;
        int count = 0;
        while (index < len) {
            while (index < len && s.charAt(index) == ' ') {
                count++;
                index++;
            }
            index++;
        }
        return count;
    }

    public static int countSegmentsInspiredByLc(String s) {
        s = s.trim();
        if (s.length() <1) return 0;
        return s.split("\\s+").length;
    }

    public int countSegmentsCopy(String s) {
        int segmentCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                segmentCount++;
            }
        }

        return segmentCount;
    }

}
