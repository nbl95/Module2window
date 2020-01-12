package PointMoveablePoint;

import java.util.Arrays;

public class Point {
    public float x;
    public float y;
    public float [] position;

    public Point(float x, float y   ){
        this.x = x;
        this.y = y;
        this.position = new float[]{this.x,this.y};
    }

    public Point(){
        this.x = 0;
        this.y = 0;
        this.position = new float[]{this.x , this.y};

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getPosition() {
        return position;
    }

    public void setPosition(float[] position) {
        this.position = position;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
        this.position = new float[]{this.x, this.y};

    }
    public float[] getXY(){
        this.position = new float[]{this.x , this.y};
        return this.position;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", position=" + Arrays.toString(position) +
                '}';
    }
}
