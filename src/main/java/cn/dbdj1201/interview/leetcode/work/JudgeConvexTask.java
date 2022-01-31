package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Objects;

/**
 * @Author: yz1201
 * @Date: 2022/1/31 19:36
 */
@Slf4j
public class JudgeConvexTask {

    public static void main(String[] args) {
        // 0 0 
    }

    /**
     * 当内积第一次不为0时，奠定了整个图形的向量旋转方向，之后如果有旋转方向跟这个方向不一致的，就不是凸多边形
     */
    static Boolean turnRight = null;

    static class Vector {
        int start;
        int end;

        Vector(int start, int end) {
            this.start = start;
            this.end = end;
        }

        int cross(Vector v) {
            return this.start * v.end - v.start * this.end;
        }
    }

    public static boolean isConvex(List<List<Integer>> points) {
        int len = points.size();
        if (len == 3) {
            return true;
        }


        Vector v1;
        Vector v2;

        //i=0和i=len-1时单独处理
        v1 = new Vector(points.get(0).get(0) - points.get(len - 1).get(0),
                points.get(0).get(1) - points.get(len - 1).get(1));

        v2 = new Vector(points.get(1).get(0) - points.get(0).get(0),
                points.get(1).get(1) - points.get(0).get(1));

        if (reVerseCross(v1, v2)) {
            return false;
        }

        v1 = new Vector(points.get(len - 1).get(0) - points.get(len - 2).get(0),
                points.get(len - 1).get(1) - points.get(len - 2).get(1));

        v2 = new Vector(points.get(0).get(0) - points.get(len - 1).get(0),
                points.get(0).get(1) - points.get(len - 1).get(1));

        if (reVerseCross(v1, v2)) {
            return false;
        }

        for (int i = 1; i < points.size() - 1; i++) {
            v1 = new Vector(points.get(i).get(0) - points.get(i - 1).get(0),
                    points.get(i).get(1) - points.get(i - 1).get(1));

            v2 = new Vector(points.get(i + 1).get(0) - points.get(i).get(0),
                    points.get(i + 1).get(1) - points.get(i).get(1));

            if (reVerseCross(v1, v2)) {
                return false;
            }
        }


        return true;
    }

    static boolean reVerseCross(Vector v1, Vector v2) {

        if (Objects.isNull(turnRight)) {
            if (v1.cross(v2) < 0) {
                turnRight = true;
            }
            if (v1.cross(v2) > 0) {
                turnRight = false;
            }
        }

        System.out.println(turnRight);

        if (!Objects.isNull(turnRight)) {
            if (turnRight && v1.cross(v2) > 0) {
                return true;
            }
            return !turnRight && v1.cross(v2) < 0;
        }

        return false;
    }

}
