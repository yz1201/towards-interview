package cn.dbdj1201.interview.test;

import lombok.extern.slf4j.Slf4j;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @Author: yz1201
 * @Date: 2022/4/21 14:44
 */
@Slf4j
public class TestMain20220421 {

    public static void main(String[] args) {
        Path path = Paths.get("/home/mfs/mfs-base-class");
        System.out.println(path.toString().length());
    }
}
