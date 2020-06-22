package com.BTL.Shape;

import com.BTL.Point;

public class Rectangle extends Shape{
    private Point leftTop;
    private double height;
    private double width;
    Rectangle() {};
    Rectangle(Point left, double H, double W) {
        leftTop = left;
        height = H;
        width = W;
    }

    public Point getLeftTop() {
        return leftTop;
    }

    public void setLeftTop(Point leftTop) {
        this.leftTop = leftTop;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (height + width) * 2;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public boolean equals(Object obj) {
        obj = (Rectangle) obj;
        return leftTop == ((Rectangle) obj).leftTop &&
                width == ((Rectangle) obj).width &&
                height == ((Rectangle) obj).height;
    }
    @Override
    public void draw() {
        System.out.println("LeftTop: " + leftTop);
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
    }

}
