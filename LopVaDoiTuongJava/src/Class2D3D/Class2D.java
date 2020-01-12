package Class2D3D;

import java.util.Arrays;

public class Class2D {
    public float x;
    public float y;
    public float[] position;

    public Class2D() {
        this.x = 0;
        this.y = 0;
        this.position = new float[]{this.x, this.y};
    }

    public Class2D(float x, float y) {
        this.x = x;
        this.y = y;
        this.position = new float[]{this.x, this.y};
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getPosition() {
        return this.position;
    }

    public void setPosition(float[] position) {
        this.position = position;
    }
    public  void setXY(float x,float y){
        this.x = x;
        this.y = y;
        this.position = new float[]{this.x, this.y};
    }
    public float[] getXY(){
        return this.position ;
    }

    @Override
    public String toString() {
        return "Class2D{" +
                "x=" + this.x +
                ", y=" + this.y +
                ", position=" + Arrays.toString(this.position) +
                '}';
    }
}