package cn.dbdj1201.interview.design.builder;

import cn.dbdj1201.interview.design.builder.gf.GfBuilder;
import cn.dbdj1201.interview.design.builder.gf.GirlFriend;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2021/1/6 21:30
 */
@Slf4j(topic = "c.MainTest")
public class MainTest {

    public static void main(String[] args) {
        log.info("nothing to eat");

        System.out.println(new GfBuilder().build("zyt").build(28).build());
    }
}
