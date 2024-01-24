package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getWidth() {
        return 2 * radius;
    }

    public double getHeight(){
        return 2 * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
