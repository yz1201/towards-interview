package cn.dbdj1201.interview.test;

import lombok.extern.slf4j.Slf4j;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @Author: yz1201
 * @Date: 2022/2/17 8:29
 */
@Slf4j
public class TestMain0217 {
    public static void main(String[] args) {
        /**
         *  /home/mfs/nfs/inter/XXPL/test.java
         *  /home/mfs/MFS/fundFile/test.java
         */
//        Path path = Paths.get("/test/01/heihei");
//        Path path1 = Paths.get("/test/01/heihei/haha/ooo");
//        Path path2 = Paths.get("/testa/02/heihei/haha/ooo");
//        Path path3 = Paths.get("/home/mfs/nfs/inter/XXPL/test.java");
//        Path path4 = Paths.get("/home/mfs/MFS/fundFile/test.java");
//        System.out.println(path3.relativize(path4));

        LocalDateTime date =LocalDateTime.now();
//        Duration.between();
        System.out.println(date);
    }
}
