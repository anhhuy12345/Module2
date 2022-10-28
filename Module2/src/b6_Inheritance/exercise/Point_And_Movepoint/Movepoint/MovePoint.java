package b6_Inheritance.exercise.Point_And_Movepoint.Movepoint;

import b6_Inheritance.exercise.Point_And_Movepoint.Point.Point;

import java.util.Arrays;

public class MovePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovePoint() {

    }

    public MovePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr = {this.xSpeed, this.ySpeed};
        return arr;
    }

    @Override
    public String toString() {
        return "MovePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", arr=" + Arrays.toString(getSpeed())+
                "\n, which a subclass of "
                +super.toString() +
                '}';
    }
    public MovePoint move() {
        super.setX(super.getX()+this.xSpeed);
        super.setY(super.getY()+this.ySpeed);
        return this;
    }
}
