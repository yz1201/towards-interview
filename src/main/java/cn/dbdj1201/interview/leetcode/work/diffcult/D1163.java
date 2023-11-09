package cn.dbdj1201.interview.leetcode.work.diffcult;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2023/4/24 15:13
 */
public class D1163 {

    public String lastSubstring(String s) {
        int length = s.length();
        if (length == 1) return s;
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            for (int i1 = i; i1 < length; i1++) {
                String subStr = s.substring(i, i1 + 1);
                if (!stringList.contains(subStr))
                    stringList.add(subStr);
            }
        }
        System.out.println(stringList);
        stringList.sort(String::compareTo);
        System.out.println(stringList);
        return stringList.get(stringList.size() - 1);
    }

    public String lastSubstringV1(String s) {
        char[] c = s.toCharArray();
        char max = 'a';
        for (char value : c) {
            if (value > max) {
                max = value;
            }
        }
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == max) {
                list.add(new int[]{i, i});
            }
        }
        while (list.size() > 1) {
            List<int[]> list1 = new ArrayList<>();
            char ch = 'a';
            for (int[] a : list) {
                if (a[1] == c.length - 1) {
                    continue;
                }
                if (c[a[1] + 1] == ch) {
                    list1.add(new int[]{a[0], a[1] + 1});
                } else if (c[a[1] + 1] > ch) {
                    ch = c[a[1] + 1];
                    list1 = new ArrayList<>();
                    list1.add(new int[]{a[0], a[1] + 1});
                }
            }
            list = list1;
        }
        return s.substring(list.get(0)[0]);
    }

    public String lastSubstringV2(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        // s 中最大的字符 c
        char c = '0';
        // c 第一次的出现位置
        int pos = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > c) {
                c = chars[i];
                pos = i;
            }
        }
        // right 是当前遍历到的字符
        int right = pos + 1;
        while (right < n) {
            // 遇到 c 的第二个出现位置，那么就要一教高下，选出二者中更好的位置，也就是后面字符更大
            if (chars[right] != c) {
                right++;
                continue;
            }
            // i、j分别从 c 的两个出现位置 pos、right 的下一个字符出发
            int i = pos + 1, j = right + 1;
            // 二者相等就一直前进，主要不要越界
            while (j < n && chars[i] == chars[j]) {
                i++;
                j++;
            }
            if (j >= n) {
                break;
            }
            // 说明，c的第二个出现位置往后得到的子串字典序更大，那么更新 pos 为第二个出现位置 right
            if (chars[i] < chars[j]) {
                pos = right;
            }
            // right继续前进遍历下一个字符
            right++;
        }
        // 返回，后缀字符串
        return s.substring(pos);
    }


    public String lastSubstringCopy(String s) {
        int i = 0, j = 1, n = s.length();
        while (j < n) {
            int k = 0;
            //aaaab
            while (j + k < n && s.charAt(i + k) == s.charAt(j + k)) {
                k++;
            }
            if (j + k < n && s.charAt(i + k) < s.charAt(j + k)) {
                int t = i;
                i = j;
                j = Math.max(j + 1, t + k + 1);
            } else {
                j = j + k + 1;
            }
        }
        return s.substring(i);
    }

}
