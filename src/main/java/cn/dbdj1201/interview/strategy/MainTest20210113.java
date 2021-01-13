package cn.dbdj1201.interview.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2021/1/13 18:38
 */
@Slf4j(topic = "c.MainTest20210113")
public class MainTest20210113 {
    public static void main(String[] args) {
        CalculateContext calculateContext = new CalculateContext(new DivideStrategy());
        calculateContext.cal(5d, 2d);
    }
}
