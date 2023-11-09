package cn.dbdj1201.interview;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.*;

/**
 * @Author: yz1201
 * @Date: 2021/4/22 21:51
 */
public class JustTest {
    public static void main(String[] args) throws IOException {
//        int len = 1;
//        System.out.println(1 << len);
//
//        System.out.println(Character.isLetterOrDigit('中'));

        int num = 2;
//                System.out.println(num >> 1);
//        System.out.println(num >> 1 | num);
//        System.out.println(num >>> 1);

        Map<Object, Object> objectObjectMap = Collections.synchronizedMap(new HashMap<>());

        ObjectMapper objectMapper = new ObjectMapper();
        List<Map<String, String>> map1 = new ArrayList<>();
        Map<String,String> m1 = new HashMap<>();
        Map<String,String> m2 = new HashMap<>();
        Map<String,String> m3 = new HashMap<>();
        m1.put("k1","v1");
        m2.put("k2","v2");
        m3.put("k3","v3");
        map1.add(m1);
        map1.add(m2);
        map1.add(m3);
        List<Map<String, String>> map2 = new ArrayList<>();
        String s1 = objectMapper.writeValueAsString(map1);
        String s2 = objectMapper.writeValueAsString(map2);
        System.out.println("--"+s1);
        System.out.println(s2);
        System.out.println(objectMapper.readValue(s1, List.class));
        System.out.println(objectMapper.readValue(s2, List.class));


    }
}
