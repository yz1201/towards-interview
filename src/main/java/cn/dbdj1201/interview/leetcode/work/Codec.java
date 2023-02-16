package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

/**
 * @Author: yz1201
 * @Date: 2022/6/29 9:21
 */
@Slf4j
public class Codec {
    private Map<String, String> dataBase = new HashMap<>();
    private String id;

    public String encode(String longUrl) {
        id = UUID.randomUUID().toString().split("-")[0];

//        id = now
//        id++;

        dataBase.put(id, longUrl);
        return "http://tinyurl.com/" + id;
    }

    public String decode(String shortUrl) {
        int p = shortUrl.lastIndexOf('/') + 1;
//        int key = Integer.parseInt(shortUrl.substring(p));
        String key = shortUrl.substring(p);
        return dataBase.get(key);
    }

}
