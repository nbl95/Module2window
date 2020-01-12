package PointMoveablePoint;
import java.awt.Point;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(5, 6);
        MovablePoint movablePoint = new MovablePoint(10, 10, 5, 6);
        System.out.println(point.toString());
        System.out.println(movablePoint.toString());
    }

}