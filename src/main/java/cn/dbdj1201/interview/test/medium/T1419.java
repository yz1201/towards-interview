package cn.dbdj1201.interview.test.medium;

import cn.dbdj1201.interview.leetcode.work.middle.M1419;
import com.alibaba.druid.sql.visitor.functions.If;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2023/5/6 10:27
 */
@Slf4j
public class T1419 {

    public static void main(String[] args) {

        M1419 m1419 = new M1419();
//        m1419.minNumberOfFrogsCopy("croakcroak");

        List<Map<String, String>> nums = new ArrayList<>();
        Map<String, String> m1 = new HashMap<>();
        m1.put("name", "123");
        Map<String, String> m2 = new HashMap<>();
        m2.put("name", "234");
        nums.add(m1);
        nums.add(m2);
        System.out.println(nums);
        nums = nums.stream().peek(m -> {

            if (m.get("name").equals("123")) {
                m.put("age", "33333");
            } else {
                m.put("age", "4444");
            }
        }).collect(Collectors.toList());
        System.out.println(nums);

    }
}
