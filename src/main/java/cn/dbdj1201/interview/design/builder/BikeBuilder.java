package cn.dbdj1201.interview.design.builder;

/**
 * @Author: yz1201
 * @Date: 2021/1/7 19:28
 */
public interface BikeBuilder {

    void buildFrame();

    void buildSeat();

    void buildTire();

    Bike build();
}
