package cn.dbdj1201.interview.test.simple;

/**
 * @Author: yz1201
 * @Date: 2022/12/28 14:52
 */
public class T12282022 {

    public static void main(String[] args) {
        String s = new StringBuilder().append("ja").append("va").toString();
        s.intern();

        String a = new String("java");
        String b = new String("java");

        System.out.println(a == b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
