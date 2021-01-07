package cn.dbdj1201.interview.singleton;

/**
 * @Author: yz1201
 * @Date: 2021/1/7 8:25
 */
public class Hungary {

    private static final Hungary HUNGARY = new Hungary();

    private Hungary() {
    }

    public static Hungary getInstance() {
        return HUNGARY;
    }
}
