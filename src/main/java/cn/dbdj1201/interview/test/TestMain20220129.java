package cn.dbdj1201.interview.test;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2022/1/29 21:43
 */
@Slf4j
public class TestMain20220129 {


//    @Benchmark
//    @Warmup(time = 3,iterations = 1)
//    @Fork(5)
//    @BenchmarkMode(Mode.Throughput)
//    @Measurement(iterations = 1,time = 3)
//    public void testPrint(){
//        System.out.println("i am test class");
//    }


    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
                .build();
        new Runner(options).run();
    }

    @Benchmark
    public void testFastJsonSerialize(Blackhole blackhole) {
        List<User> userList = Arrays.asList(new User("lisi", "123"), new User("Tony", "456"));
        blackhole.consume(JSON.toJSONString(userList));
    }

    @Benchmark
    public void testJacksonSerialize(Blackhole blackhole) throws JsonProcessingException {
        List<User> userList = Arrays.asList(new User("lisi", "123"), new User("Tony", "456"));
        ObjectMapper objectMapper = new ObjectMapper();
        blackhole.consume(objectMapper.writeValueAsString(userList));
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class User {

        private String username;
        private String password;
    }

}
