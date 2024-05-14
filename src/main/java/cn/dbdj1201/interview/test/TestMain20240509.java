package cn.dbdj1201.interview.test;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

/**
 * @Author: yz1201
 * @Date: 2024/5/9 16:07
 */
@Slf4j
public class TestMain20240509 {

    static final Random random = new Random();
    static int period = 1;
    static final CyclicBarrier cyclicBarrier = new CyclicBarrier(5, () -> {
        switch (period) {
            case 1:
                log.info("第1阶段");
                break;
            case 2:
                log.info("第2阶段");
                break;
            case 3:
                log.info("第3阶段");
                break;
            case 4:
                log.info("第4阶段");
                break;
            case 5:
                log.info("第5阶段");
                break;
            default:
                log.info("ERROR");
                break;
        }
        period++;
    });


    static class StaffThread extends Thread {
        @Override
        public void run() {
            try {
                String staff = "员工【" + Thread.currentThread().getName() + "】";

                // 第一阶段：来公司集合
                log.info(staff + "从家出发了……");
                Thread.sleep(random.nextInt(5000));
                log.info(staff + "到达公司");

                // 协同，第一次等大家到齐
                cyclicBarrier.await();

                // 第二阶段：出发去公园
                log.info(staff + "出发去公园玩");
                Thread.sleep(random.nextInt(5000));
                log.info(staff + "到达公园门口集合");

                // 协同：第二次等大家到齐
                cyclicBarrier.await();

                // 第三阶段：去餐厅
                log.info(staff + "出发去餐厅");
                Thread.sleep(random.nextInt(5000));
                log.info(staff + "到达餐厅");

                // 协同：第三次等大家到齐
                cyclicBarrier.await();

                // 第四阶段：就餐
                log.info(staff + "开始用餐");
                Thread.sleep(random.nextInt(5000));
                log.info(staff + "用餐结束，回家");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        int len = 5;
        for (int i = 0; i < len; i++) {
            new StaffThread().start();
        }

    }
}


