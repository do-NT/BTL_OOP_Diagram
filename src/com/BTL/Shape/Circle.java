package com.BTL.Shape;

import com.BTL.Point;

public class Circle extends Shape{

    private Point center;
    private double radius;
    static final double PI = 3.1416;

    public Circle() {};
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public boolean equals(Object obj) {
        obj = (Circle) obj;
        return obj instanceof Circle &&
                this.radius == ((Circle) obj).radius &&
                this.center == ((Circle) obj).center;
    }

    @Override
    public void draw() {
        System.out.println("Center: " + center);
        System.out.println("Radius: " + radius);
    }
}
