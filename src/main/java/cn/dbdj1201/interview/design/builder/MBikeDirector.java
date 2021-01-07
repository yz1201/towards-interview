package cn.dbdj1201.interview.design.builder;

import lombok.Data;

/**
 * @Author: yz1201
 * @Date: 2021/1/7 19:33
 */
@Data
public class MBikeDirector {
    private MBikeBuilder mBikeBuilder;


    public MBikeDirector() {
    }

    public MBikeDirector(MBikeBuilder mBikeBuilder) {
        this.mBikeBuilder = mBikeBuilder;
    }

    public Bike getInstance() {
        mBikeBuilder.buildFrame();
        mBikeBuilder.buildSeat();
        mBikeBuilder.buildTire();
        return this.mBikeBuilder.build();
    }

}
