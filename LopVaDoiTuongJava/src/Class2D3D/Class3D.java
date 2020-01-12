package Class2D3D;
import java.util.Arrays;

class CLass3D extends Class2D {
    private float z;

    public CLass3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.position = new float[]{this.x, this.y, this.z};
    }

    public CLass3D(float z) {
        this.z = 0;
        this.position = new float[]{this.x, this.y, this.z};
    }

    public CLass3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
        this.position = new float[]{this.x, this.y, this.z};
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(this.x, this.y);
        this.z = z;
        this.position = new float[]{this.x, this.y, this.z};
    }

    public float[] getXYZ() {
        return this.position;
    }

    @Override
    public String toString() {
        return "CLass3D{" +
                "z=" + this.z +
                ", x=" + this.x +
                ", y=" + this.y +
                ", position=" + Arrays.toString(this.position) +
                '}';
    }
}