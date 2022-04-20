package cn.dbdj1201.interview.test;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2022/4/19 16:03
 */
@Slf4j
public class TestMain20220419 {

    public static void main(String[] args) {
        String[] test = new String[0];
        System.out.println(Arrays.toString(test));
        System.out.println(Arrays.toString(new String[]{}));
//        System.out.println( new File("D:\\test\\target","child"));
        Path path = Paths.get("D:\\test\\target");
        System.out.println(path.resolve("D:\\test\\source\\test.txt"));
        System.out.println(new File("D:\\test\\source\\test.txt").getName());
    }
}
