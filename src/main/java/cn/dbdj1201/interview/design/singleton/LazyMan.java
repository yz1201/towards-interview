package cn.dbdj1201.interview.design.singleton;

/**
 * @Author: yz1201
 * @Date: 2021/1/7 8:25
 */
public class LazyMan {

    private static volatile LazyMan lazyMan = null;
    private static final Object LOCK = new Object();

    private LazyMan() {
    }

    public static LazyMan getInstance() {

        if (lazyMan == null) {
            synchronized (LOCK) {
                if (lazyMan == null) {
                    lazyMan = new LazyMan();
                }
            }
        }

        return lazyMan;
    }
}
