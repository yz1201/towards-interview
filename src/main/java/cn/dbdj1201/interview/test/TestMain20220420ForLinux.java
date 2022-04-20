package cn.dbdj1201.interview.test;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * @Author: yz1201
 * @Date: 2022/4/20 14:31
 */
@Slf4j
public class TestMain20220420ForLinux {
    public static void main(String[] args) throws IOException {
        File file = new File("/home");
        String[] cmdArr = new String[3];
        cmdArr[0] = "/bin/sh";
        cmdArr[1] = "-c";
        cmdArr[2] = "ls -al";
        StringBuilder log = new StringBuilder();
        Process exec = Runtime.getRuntime().exec(cmdArr, null, file);
        BufferedReader reader = new BufferedReader(new InputStreamReader(exec.getInputStream(), StandardCharsets.UTF_8));
        reader.lines().forEach(line -> {
            log.append(line);
        });
        System.out.println(log);
        reader.close();
    }


}
