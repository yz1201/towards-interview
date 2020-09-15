package cn.dbdj1201.interview.design.decorate;

/**
 * @Author: dbdj1201
 * @Date: 2020-09-13 18:23
 */
public class PlayerDecorator1 extends PlayerDecorator {


    public PlayerDecorator1(Player player) {
        super(player);
    }

    public void sing() {
        this.playSth();
        super.sing();
    }

    private void playSth() {
        System.out.println("播放喜羊羊");
    }
}
