package com.BTL;

public class Point {
    private double x;
    private double y;
    public Point() {}
    public Point(double X, double Y) {
        x = X;
        y = Y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double X) {
        x = X;
    }
    public void setY(double Y) {
        y = Y;
    }
    @Override
    public String toString() {
        return "(" +  x + "," + y + ")";
    }
    public boolean equals(Object point){
        return this.x == ((Point) point).x && this.y == ((Point) point).y;
    }
}
