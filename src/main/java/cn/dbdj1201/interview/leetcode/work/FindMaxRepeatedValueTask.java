package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/4/1 14:46
 */
@Slf4j
public class FindMaxRepeatedValueTask {

    public static void main(String[] args) {
        System.out.println(maxRepeatingCopy("abcabcabc", "ab"));
    }

    public static int maxRepeatingCopy(String sequence, String word) {
        int count = 0;
        StringBuilder sb = new StringBuilder(word);
        while(sequence.contains(sb)) {
            count++;
            sb.append(word);
        }
        return count;

    }
}
