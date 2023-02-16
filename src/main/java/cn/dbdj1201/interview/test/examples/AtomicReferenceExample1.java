package cn.dbdj1201.interview.test.examples;
import java.util.concurrent.TimeUnit;
import static java.util.concurrent.ThreadLocalRandom.current;
/**
 * @Author: yz1201
 * @Date: 2022/12/9 8:43
 */
public class AtomicReferenceExample1 {

    /**
     * volatile关键字修饰，每次对DebitCard对象引用的写入操作都会被其他线程看到
     * 创建初始DebitCard，账号金额为0元
     */
    static volatile DebitCard debitCard = new DebitCard("zhangsan", 0);

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread("T-" + i){
                @Override
                public void run() {
                    
                    synchronized (AtomicReferenceExample1.class){
                        final DebitCard dc = debitCard;
                        // 基于全局DebitCard的金额增加10元并且产生一个新的DebitCard
                        DebitCard newDC = new DebitCard(dc.getAccount(),
                                dc.getAmount() + 10);
                        // 输出全新的DebitCard
                        System.out.println(newDC);
                        // 修改全局DebitCard对象的引用
                        debitCard = newDC;
                        try {
                            TimeUnit.MILLISECONDS.sleep(current().nextInt(20));
//                        TimeUnit.MILLISECONDS.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }.start();
        }
    }
}
