package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2022/4/19 9:10
 */
@Slf4j
public class FindShortestDistanceToChar {
    public static void main(String[] args) {
//        shortestToChar("abcdeedfdd", 'd');
        System.out.println(Arrays.toString(shortestToCharCopy("abcd", 'd')));
//        System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e')));
        //：[3,2,1,0,1,0,0,1,2,2,1,0]
    }

    public static int[] shortestToChar(String s, char c) {
        char[] chars = s.toCharArray();
        List<Integer> indexs = new ArrayList<>();
        List<Character> charArr = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                indexs.add(i);
            }
            charArr.add(chars[i]);
        }
        System.out.println(indexs);

        List<Integer> answer = new ArrayList<>(chars.length);
        for (int i = 0; i < charArr.size(); i++) {
            int finalI = i;
            int minDis = Integer.MAX_VALUE;
            for (Integer index : indexs) {
                minDis = Math.min(minDis, Math.abs(index - finalI));
            }
            answer.add(minDis);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] shortestToCharCopy(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];

        for (int i = 0, idx = -n; i < n; ++i) {
            if (s.charAt(i) == c) {
                idx = i;
            }
            ans[i] = i - idx;
        }

        System.out.println(Arrays.toString(ans));
        for (int i = n - 1, idx = 2 * n; i >= 0; --i) {
            System.out.println(s.charAt(i));
            if (s.charAt(i) == c) {
                idx = i;
            }
            System.out.println(i + "----" + idx);
            ans[i] = Math.min(ans[i], idx - i);
        }
        return ans;
    }

}
