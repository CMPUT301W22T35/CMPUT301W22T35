package com.example.cmput301w22t35;

public abstract class Shape {
    protected Integer x;
    protected Integer y;
    protected String color = "blue";
    
    Shape(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
}
