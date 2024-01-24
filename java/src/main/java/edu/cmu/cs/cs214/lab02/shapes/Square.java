package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    private double sideLen;

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }
    
    public double getWidth() {
        return sideLen;
    }

    public double getHeight() {
        return sideLen;
    }

    public double getArea() {
        return sideLen * sideLen;
    }
}
