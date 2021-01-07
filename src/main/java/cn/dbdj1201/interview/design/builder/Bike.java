package cn.dbdj1201.interview.design.builder;

import lombok.Data;

/**
 * @Author: yz1201
 * @Date: 2021/1/7 19:26
 */
@Data
public class Bike {

    private String frame;
    private String seat;
    private String tire;

    public String getFrame() {
        return frame;
    }
    public void setFrame(String frame) {
        this.frame = frame;
    }
    public String getSeat() {
        return seat;
    }
    public void setSeat(String seat) {
        this.seat = seat;
    }
    public String getTire() {
        return tire;
    }
    public void setTire(String tire) {
        this.tire = tire;
    }
}
