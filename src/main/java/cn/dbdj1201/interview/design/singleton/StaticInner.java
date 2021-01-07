package cn.dbdj1201.interview.design.singleton;

/**
 * @Author: yz1201
 * @Date: 2021/1/7 8:49
 */
public class StaticInner {

    private StaticInner() {
    }

    private static class OuterGoods {
//        private static StaticInner getInstance() {
//            return new StaticInner();
//        }

        private static final StaticInner INSTANCE = new StaticInner();
    }

    public static StaticInner getInstance() {
        return OuterGoods.INSTANCE;
    }
}
