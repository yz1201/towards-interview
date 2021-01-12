package cn.dbdj1201.interview.design.templateMethod;

/**
 * @Author: yz1201
 * @Date: 2021/1/12 18:42
 */
public abstract class Cook {

    void cook(String food) {
        System.out.println("before prepare");
        doCook(food);
        System.out.println("after prepare");
    }

    protected abstract void doCook(String food);
}
