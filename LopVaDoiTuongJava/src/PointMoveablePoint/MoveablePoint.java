package PointMoveablePoint;

import java.util.Arrays;
class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    private float[] speed;
    private float[] object;

    public MovablePoint() {
        this.xSpeed = 0;
        this.ySpeed = 0;
        this.speed = new float[]{this.xSpeed, this.ySpeed};
        this.object = new float[]{this.x, this.y, this.xSpeed, this.ySpeed};
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.speed = new float[]{this.xSpeed, this.ySpeed};
        this.object = new float[]{this.x, this.y, this.xSpeed, this.ySpeed};
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.speed = new float[]{this.xSpeed, this.ySpeed};
        this.object = new float[]{this.x, this.y, this.xSpeed, this.ySpeed};
    }

    public float getxSpeed() {
        return this.xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return this.ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        this.speed = new float[]{this.xSpeed, this.ySpeed};
        return this.speed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] move() {
        this.x += this.xSpeed;
        this.y += this.ySpeed;
        return this.object;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                ", speed=" + Arrays.toString(this.speed) +
                ", position=" + Arrays.toString(this.position) +
                '}';
    }
}