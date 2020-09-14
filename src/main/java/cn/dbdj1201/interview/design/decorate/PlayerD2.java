package cn.dbdj1201.interview.design.decorate;

/**
 * @Author: dbdj1201
 * @Date: 2020-09-13 18:27
 */
public class PlayerD2 extends PlayerDecorator {
    public PlayerD2(Player player) {
        super(player);
    }

    public void sing() {
        this.speak();
        super.sing();
    }

    private void speak() {
        System.out.println("讲故事");
    }
}
