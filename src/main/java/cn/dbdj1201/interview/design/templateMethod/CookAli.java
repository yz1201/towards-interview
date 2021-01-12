package cn.dbdj1201.interview.design.templateMethod;

/**
 * @Author: yz1201
 * @Date: 2021/1/12 18:45
 */
public class CookAli extends Cook {
    @Override
    protected void doCook(String food) {
        System.out.println("cook food - " + food);
    }
}
