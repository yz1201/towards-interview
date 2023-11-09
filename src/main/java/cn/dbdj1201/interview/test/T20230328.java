package cn.dbdj1201.interview.test;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @Author: yz1201
 * @Date: 2023/3/28 9:39
 */
@Slf4j
public class T20230328 {

    public static void main(String[] args) {
        LoadingCache<String, String> cache = CacheBuilder.newBuilder()
                .maximumSize(20)
                .expireAfterAccess(100, TimeUnit.MILLISECONDS)
                .build(
                        new CacheLoader<>() {
                            @Override
                            public String load(String key) throws Exception {
                                //TODO
                                return null;
                            }
                        }
                );
    }
}
