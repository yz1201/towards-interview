package cn.dbdj1201.interview.test.examples;

/**
 * @Author: yz1201
 * @Date: 2022/12/9 8:42
 */
public class DebitCard {

    /**
     * 账户名名
     */
    private final String account;

    /**
     * 账户金额
     */
    private final int amount;

    public DebitCard(String account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public String getAccount() {
        return account;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "account='" + account + '\'' +
                ", amount=" + amount +
                '}';
    }
}
