package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: yz1201
 * @Date: 2022/7/5 8:37
 */
@Slf4j
public class MyCalendar {

    Map<Integer, List<Integer>> books;

    public MyCalendar() {
        books = new HashMap<>();
    }

    public boolean book(int start, int end) {
        List<Integer> list = books.get(start);
        if (list == null || list.isEmpty()) {

            if (books.entrySet().stream().anyMatch(entry -> {
//                List<Integer> value = entry.getValue();
//                if (value.get(0) >= start || value.get(0) < end) {
//                    return true;
//                }
//                return value.get(1) >= start || value.get(1) < end;
                int ruleStart = entry.getValue().get(0);
                int ruleEnd = entry.getValue().get(1);
//                if (start >= ruleStart && start < ruleEnd) return true;
                return start >= ruleStart && start < ruleEnd || end >= ruleStart && end < ruleEnd;
            })) {
                return false;
            } else {
                books.put(start, List.of(start, end));
                return true;
            }
        }
        return false;
    }

    public boolean book1(int start, int end) {
        List<Integer> list = books.get(start);
        if (list == null || list.isEmpty()) {
            if (books.entrySet().stream().anyMatch(entry -> {
                int ruleStart = entry.getValue().get(0);
                int ruleEnd = entry.getValue().get(1);
                if (start <= ruleStart && end >= ruleEnd) return true;

                return start >= ruleStart && start < ruleEnd || end >= ruleStart && end < ruleEnd;
            })) {
                return false;
            } else {
                books.put(start, List.of(start, end));
                return true;
            }
        }
        return false;
    }
}
