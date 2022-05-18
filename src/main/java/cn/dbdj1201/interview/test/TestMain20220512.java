package cn.dbdj1201.interview.test;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2022/5/12 10:44
 */
@Slf4j
public class TestMain20220512 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("test1");
        list.add("test2");
        list.add("test3");

        System.out.println(list.stream().filter(str->{
            boolean equals = "test1".equals(str);
            log.info("do not print - {}",str);
            if (!equals){
                log.info("do not print - {}",str);
                System.out.println(str);
            }
            return equals;
        }));
    }
}
