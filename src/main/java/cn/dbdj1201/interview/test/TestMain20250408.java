package cn.dbdj1201.interview.test;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @Author: yz1201
 * @Date: 2025/4/8 17:12
 */
@Slf4j
public class TestMain20250408 {
    public static void main(String[] args) {
        List<Map<String,String>> l1 = new ArrayList<>();
        List<Map<String,String>> l2 = new ArrayList<>();

        Map<String,String> m1 = new HashMap<>();
        m1.put("t1", "v1");
        m1.put("t2", "v2");
        m1.put("t3", "v3");
        Map<String,String> m2 = new HashMap<>();
        m1.put("t11", "v11");
        m1.put("t22", "v22");
        m1.put("t33", "v33");
        l2.add(m1);
        l2.add(m2);
        l1.addAll(l2);
        System.out.println(l1);
        System.out.println(l2);

        Iterator<Map<String, String>> iterator = l2.iterator();
        while (iterator.hasNext()){
            Map<String, String> next = iterator.next();
            String t1 = next.get("t1");
            if (t1.equals("v1")) iterator.remove();
        }

        System.out.println(l1);
        System.out.println(l2);

    }
}
