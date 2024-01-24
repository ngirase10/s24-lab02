package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    public double height;
    public double width;
    
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }

    public double getArea() {
        return height * width;
    }
}
