package com.example.cmput301w22t35;

public abstract class Rectangle extends Shape {
    protected Integer a;
    protected Integer b;

    Rectangle(Integer x, Integer y, Integer a, Integer b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }

    private Integer getTop() {
        return x + b;
    }
    //...
}
