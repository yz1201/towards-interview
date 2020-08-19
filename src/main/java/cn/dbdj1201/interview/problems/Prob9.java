package cn.dbdj1201.interview.problems;

/**
 * @author yz1201
 * @date 2020-08-13 22:20
 **/
public class Prob9 {

    public static void main(String[] args) {
        /*面试题 9：斐波那契数列*/
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
        System.out.println(fib(6));
        System.out.println(fib(7));
    }

    private static int fib(int num) {
        if (num < 1) {
            return 0;
        }

        if (num == 1 || num == 2) {
            return 1;
        }
        return fib(num - 1) + fib(num - 2);
    }
}
