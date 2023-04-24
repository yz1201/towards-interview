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
}
