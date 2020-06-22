package com.BTL;

public class Diagram implements Drawable{
    private Iterable<Drawable> diagrams;
    public Diagram(Iterable<Drawable> diagrams) {
        this.diagrams = diagrams;
    }

    @Override
    public void draw() {

    }
}
