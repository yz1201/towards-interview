package cn.dbdj1201.interview.test;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @Author: yz1201
 * @Date: 2022/2/17 8:29
 */
@Slf4j
public class TestMain0217 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /**
         *  /home/asdasdsdadad/nfs/inter/XXPL/test.java
         *  /home/asdasdsdadad/asdasdsdadad/fundFile/test.java
         */
//        Path path = Paths.get("/test/01/heihei");
//        Path path1 = Paths.get("/test/01/heihei/haha/ooo");
//        Path path2 = Paths.get("/testa/02/heihei/haha/ooo");
//        Path path3 = Paths.get("/home/asdasdsdadad/nfs/inter/XXPL/test.java");
//        Path path4 = Paths.get("/home/asdasdsdadad/asdasdsdadad/fundFile/test.java");
//        Path path6 = Paths.get("/home/asdasdsdadad");
//        Path path5 = Paths.get("/test.java");
//        System.out.println(path6.relativize(path3));
//
//        LocalDateTime date =LocalDateTime.now();
////        Duration.between();
//        System.out.println(date);
//
////        System.out.println("abc".substring(3,4));
//        Class<TestMain0217> testMain0217Class = TestMain0217.class;
//        Method test = testMain0217Class.getMethod("test");
//        Constructor<TestMain0217> constructor = testMain0217Class.getConstructor();
//        TestMain0217 obj = constructor.newInstance();
//        System.out.println(test.invoke(obj));

        LocalDateTime date =LocalDateTime.now();
//        Duration.between();
        System.out.println(date);
    }
}
