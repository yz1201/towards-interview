package cn.dbdj1201.restart;

import cn.dbdj1201.entity.TestBody;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yz1201
 * @Date: 2021/7/19 10:52
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @RequestMapping("/date")
    public Map<String, Object> testDate(@RequestBody TestBody testBody) {
        Map<String, Object> map = new HashMap<>(8);
        log.info("input data - {}", testBody);
        map.put("data", testBody);
        map.put("message", "success");
        map.put("code", "200");
        return map;
    }

    @RequestMapping("/hello")
    public Map<String, Object> testHello() {
        Map<String, Object> map = new HashMap<>(8);
        log.info("input data - {}", "hello");
        map.put("message", "success");
        map.put("code", "200");

        StringRedisTemplate template = new StringRedisTemplate();
        template.opsForValue().increment("2");
        boolean flag ;
        float a = 5;
        float b = a * 3 / 5;
        if (flag = a > b) {
            System.out.println("/");
        }
        return map;
    }

}
