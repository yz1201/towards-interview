package cn.dbdj1201.interview.test;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2022/8/24 10:57
 */
@Slf4j
public class TestMain20220824 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1994, 8, 25);
        LocalDate now = LocalDate.now();

        System.out.println(now.compareTo(date));
        System.out.println(date.until(now).getYears());


        List<Map<String,Object>> list = new ArrayList<>();

        Map<String,Object> p1 = new HashMap<>();
        p1.put("name", "222323");
        p1.put("age", "124");

        Map<String,Object> p2 = new HashMap<>();
        p1.put("name", "asdasdasd");
        p1.put("age", "12224");
        list.add(p1);
        list.add(p2);

        list.stream().sorted(
//                Comparator.comparing((person) -> {
//                  person.ge
//                })


        ).forEach(System.out::println);


        list.stream().sorted(Comparator.comparing(map ->
                Integer.parseInt(map.get("monthtime").toString()))).collect(Collectors.toList());

    }
}
