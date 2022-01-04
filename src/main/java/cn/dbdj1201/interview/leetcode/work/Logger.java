package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yz1201
 * @Date: 2022/1/4 16:32
 */
@Slf4j
public class Logger {

    Map<String, Integer> map;

    public Logger() {
        this.map = new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        if (!this.map.containsKey(message)) {
            this.map.put(message, timestamp);
            return true;
        }
        int oldTimeStamp = this.map.get(message);
        if (timestamp - oldTimeStamp >= 10) {
            this.map.put(message, timestamp);
            return true;
        }
        return false;
    }
}
