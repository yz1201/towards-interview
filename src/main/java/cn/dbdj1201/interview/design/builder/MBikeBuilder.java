package cn.dbdj1201.interview.design.builder;

/**
 * @Author: yz1201
 * @Date: 2021/1/7 19:29
 */
public class MBikeBuilder implements BikeBuilder {

    private Bike bike = new Bike();

    @Override
    public void buildFrame() {
        this.bike.setFrame("aha");
    }

    @Override
    public void buildSeat() {
        this.bike.setSeat("asd");
    }

    @Override
    public void buildTire() {
        this.bike.setTire("asdas");
    }

    @Override
    public Bike build() {
        return this.bike;
    }
}
