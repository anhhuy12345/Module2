package b6_Inheritance.exercise.Point2D_Point3D.Point3D;

import b6_Inheritance.exercise.Point2D_Point3D.Point2D.Point2D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    //constructor
    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    //setter getter
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = {this.getX(), this.getY(), this.z};
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                ", y=" + getZ() +
                "array of x, y , z =" + Arrays.toString(getXYZ()) +
                "}";


    }
}
