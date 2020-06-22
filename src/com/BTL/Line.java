package com.BTL;
import com.BTL.Drawable;
public class Line implements Drawable{
    private Point startPoint, endPoint;
    public Line(){};
    public Line(Point a, Point b) {
        startPoint = a;
        startPoint = b;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }
    public boolean equals(Object line) {
        //line = (Line) line;
        return this.startPoint == ((Line) line).startPoint && this.endPoint == ((Line) line).endPoint;
    }
    @Override
    public void draw() {
        System.out.println(startPoint + " " + endPoint);
    }
}
