package cn.dbdj1201.interview.leetcode.work;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: yz1201
 * @Date: 2022/1/4 9:22
 */
@Slf4j
public class LengthOfLongestSubStringTask {

    public static void main(String[] args) {
        String s = "abcda";
        System.out.println(lengthOfLongestSubstringCopy(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;

        int len = s.length();
        List<Integer> resArr = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            int res = 1;
            for (int j = i + 1; j < len; j++) {
                if (s.charAt(i) != s.charAt(j)) {
                    resArr.add(++res);
                } else {
                    i++;
                    break;
                }
            }
        }

        int asInt = resArr.stream().mapToInt(Integer::intValue).max().getAsInt();
        return asInt;
    }

    public static int lengthOfLongestSubstring1(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }

    public static int lengthOfLongestSubstringCopy(String s) {
        int len = s.length();
        Set<Character> set = new HashSet<>();
        int rk = -1, ans = 0;
        for (int i = 0; i < len; i++) {
            if (i != 0)
                set.remove(s.charAt(i - 1));
            while (rk + 1 < len && !set.contains(s.charAt(rk + 1))) {
                set.add(s.charAt(rk + 1));
                rk++;
            }
            System.out.println("rk - " + rk + " i - " + i);
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }
}
