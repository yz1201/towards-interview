package cn.dbdj1201.interview;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.*;

/**
 * @Author: yz1201
 * @Date: 2021/6/11 11:26
 */
public class TestList {

    public static void main(String[] args) {
//        List<String> paramList = new ArrayList<>();
//        paramList.add("asda1");
//        paramList.add("asda2");
//        paramList.add("asda3");
//        paramList.add(null);
//        System.out.println(paramList);
//
//        String key = "params";
//        List<Map<String,String>> paramList  = new ArrayList<>();
//        Map<String,String> m1 = new HashMap<>();
//        m1.put();


        Set<Map<String,Object>> set = new HashSet<>();
        Map<String,Object> map1 = new HashMap<>();
        map1.put("test","test");
        Map<String,Object> map2 = new HashMap<>();
        map2.put("test","test");
        set.add(map1);
        set.add(map2);
        System.out.println(set);
        System.out.println(map1 == map2);
        System.out.println(map1.hashCode());
        System.out.println(map2.hashCode());
        System.out.println(map1);
        System.out.println(map2);
        System.out.println(new Object().hashCode());

        System.out.println("===============");

        Person jiezi = new Person("jiezi", 28);
        Person jiezi1 = new Person("jiezi", 28);
        Person asd = new Person("asd", 29);
        System.out.println(jiezi);
        System.out.println(jiezi1);
        System.out.println(asd);
        System.out.println(jiezi.hashCode());
        System.out.println(jiezi1.hashCode());
        System.out.println(asd.hashCode());

        Set<Person> personSet = new HashSet<>();
        personSet.add(jiezi);
        personSet.add(jiezi1);
        personSet.add(asd);
        personSet.add(new Person("jiezi",28));
        System.out.println(personSet);



    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Person{
    private String name;
    private Integer age;


}
