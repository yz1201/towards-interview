package cn.dbdj1201.interview.thread;

/**
 * @Author: yz1201
 * @Date: 2022/1/5 9:17
 */
public class SuperSubSyncQuestion {

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.m();
        System.out.println("1");
        new Thread(subClass::m).start();
//        new Thread(subClass::m);
    }
}

class SuperClass {

    public synchronized void m() {
        System.out.println("super call - " + this);
        System.out.println("super start");
        System.out.println("super end");
    }

}

class SubClass extends SuperClass {

    @Override
    public synchronized void m() {
        System.out.println("sub call - " + this);
        System.out.println("child start");
        super.m();
        System.out.println("child end");
    }
}
