package cn.dbdj1201.interview.design.decorate;

/**
 * @Author: dbdj1201
 * @Date: 2020-09-13 18:25
 */
public class PlayerDecorator extends Player {

    Player player;

    public PlayerDecorator(Player player) {
        this.player = player;
    }

    public void sing() {
        this.player.sing();
    }
}
