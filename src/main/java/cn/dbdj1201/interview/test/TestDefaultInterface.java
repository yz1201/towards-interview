package cn.dbdj1201.interview.test;

/**
 * @Author: yz1201
 * @Date: 2022/4/21 16:44
 */
public class TestDefaultInterface {
}

interface Test1{
    default void  test(){
        System.out.println("test1");
    }
}
interface Test2{
    default void  test(){
        System.out.println("test1");
    }
}

class TestClazz implements Test1,Test2{
    @Override
    public void test() {
        Test1.super.test();
    }

//    @Override
//    public void test() {
//        Test1.super.test();
//    }
}
