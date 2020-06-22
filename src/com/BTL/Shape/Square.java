package com.BTL.Shape;

import com.BTL.Point;

public class Square extends Rectangle{
    Square(Point leftTop, double edge) {
        super(leftTop, edge, edge);
    }
    public double getSide() {
        return getHeight();
    }
    @Override
    public void draw(){
        System.out.println("LeftTop: " + getLeftTop());
        System.out.println("Side: " + getSide());
    }
}
