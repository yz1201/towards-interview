import java.util.*;

/**
 * @Author: yz1201
 * @Date: 2021/5/27 11:11
 */
public class MainTest2021052701 {
    public static void main(String[] args) {
//        System.out.println(UUID.randomUUID().toString().length());
//        System.out.println(UUID.randomUUID());
//
//        String a = "A5";
//        String b = "B1";
//
//        String s = "cafs0";
//        System.out.println(s.substring(0,4));


        List<String> ss = new ArrayList<>();
        ss.add("1");
        ss.add("2");
        ss.add("3");
        System.out.println(ss.remove(0));
        System.out.println(ss.remove(0));
        System.out.println(ss.remove(0));
//        System.out.println(ss.remove(0));

        Set<Character> set = new HashSet<>();
        set.add('C');
        System.out.println(set.remove('C'));

    }
}
