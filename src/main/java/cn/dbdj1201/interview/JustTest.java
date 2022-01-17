package cn.dbdj1201.interview;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yz1201
 * @Date: 2021/4/22 21:51
 */
public class JustTest {
    public static void main(String[] args) {
//        int len = 1;
//        System.out.println(1 << len);
//
//        System.out.println(Character.isLetterOrDigit('中'));

        int num = 2;
                System.out.println(num >> 1);
        System.out.println(num >> 1 | num);
//        System.out.println(num >>> 1);

        Map<Object, Object> objectObjectMap = Collections.synchronizedMap(new HashMap<>());
    }
}
