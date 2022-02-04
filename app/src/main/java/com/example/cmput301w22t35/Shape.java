package com.example.cmput301w22t35;

public abstract class Shape {
    protected Integer x;
    protected Integer y;
    protected String color = "$PUT_YOUR_CHOICE_OF_COLOR";
    
    Shape(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
}
