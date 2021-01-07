package cn.dbdj1201.interview.design.singleton;

/**
 * @Author: yz1201
 * @Date: 2021/1/7 8:58
 */
public enum SingletonEnum {

    INSTANCE;

    public static SingletonEnum getInstance() {
        return INSTANCE;
    }

}
