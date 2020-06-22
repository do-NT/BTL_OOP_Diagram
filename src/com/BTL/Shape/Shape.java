package com.BTL.Shape;
import com.BTL.Drawable;
public abstract class Shape implements Drawable {
    public abstract double getPerimeter();
    public abstract double getArea();
    public abstract boolean equals(Object obj);
    public abstract void draw();
}
