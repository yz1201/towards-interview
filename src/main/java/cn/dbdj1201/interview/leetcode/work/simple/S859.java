package cn.dbdj1201.interview.leetcode.work.simple;

import com.alibaba.druid.sql.visitor.functions.If;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yz1201
 * @Date: 2023/11/13 8:55
 */
@Slf4j
public class S859 {

    public boolean buddyStrings(String s, String goal) {
        //aa aa  aba aba aab aba
        Map<Character, Integer> count1 = countString(s);
        Map<Character, Integer> count2 = countString(goal);
        if (s.equals(goal) && count1.size() > 1) {
            return false;
        }
        for (Map.Entry<Character, Integer> entry : count1.entrySet()) {
            if (!count2.get(entry.getKey()).equals(entry.getValue())) return false;
        }
        return true;
    }

    private Map<Character, Integer> countString(String s) {
        Map<Character, Integer> counter = new HashMap<>();
        for (char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        return counter;
    }

    public boolean buddyStringsCopy(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        // 两字符串相等的case
        if (s.equals(goal)) {
            int[] count = new int[26];  // 建立一个26个字母的索引
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;   // 对应字母频度统计
                if (count[s.charAt(i) - 'a'] > 1) {   // 如果有大于1的，就一定有重复字母，因为两字符串相等，所以换重复的就一定相等
                    return true;
                }
            }
            return false;
        } else {
            // 两字符串不相等的情况
            int first = -1, second = -1;
            for (int i = 0; i < goal.length(); i++) {  // 遍历字符串
                if (s.charAt(i) != goal.charAt(i)) {  // 判断有且仅有两个s和goal相同位置的字符不一样，一个first, 一个second
                    if (first == -1)
                        first = i;   // 找到first
                    else if (second == -1)
                        second = i;   // 找到second
                    else
                        return false;   // 超过两个
                }
            }
            //second != -1 first也就不是-1了，满足有且仅有两个不同字符
            //s的first等于goal的second且s的second等于goal的first,互换可得相同字符串
            return (second != -1 && s.charAt(first) == goal.charAt(second) &&
                    s.charAt(second) == goal.charAt(first));
        }
    }

    public boolean buddyStringsCopy2(String s, String goal) {
        int n = s.length(), m = goal.length();
        if (n != m) return false;
        int[] cnt1 = new int[26], cnt2 = new int[26];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = s.charAt(i) - 'a', b = goal.charAt(i) - 'a';
            cnt1[a]++; cnt2[b]++;
            if (a != b) sum++;
        }
        boolean ok = false;
        for (int i = 0; i < 26; i++) {
            if (cnt1[i] != cnt2[i]) return false;
            if (cnt1[i] > 1) ok = true;
        }
        return sum == 2 || (sum == 0 && ok);
    }

}
