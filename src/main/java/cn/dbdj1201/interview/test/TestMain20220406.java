package cn.dbdj1201.interview.test;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.nio.channels.FileChannel;

/**
 * @Author: yz1201
 * @Date: 2022/4/6 10:23
 */
@Slf4j
public class TestMain20220406 {
    public static void main(String[] args) {

//        String test = "123456789";
//        System.out.println(test.substring(8));

        String srcPath = "E:\\develop\\temp\\test\\src0406\\0406\\01\\1.txt";
        String targetPath = "E:\\develop\\temp\\test\\target0406\\0406\\01\\1.txt";
        File file = new File("E:\\develop\\temp\\test\\target0406\\0406\\01\\1.txt");
//        try {
        log.info("test - {}", file.getParentFile());
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        if (!file.getParentFile().exists()){
//                log.info("result - {}",file.getParentFile().mkdir());
            file.getParentFile().mkdirs();
        }

        try {
            FileChannel inputStream = new FileInputStream(srcPath).getChannel();
            FileChannel outputStream = new FileOutputStream(targetPath).getChannel();
            outputStream.transferFrom(inputStream,0,inputStream.size());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
