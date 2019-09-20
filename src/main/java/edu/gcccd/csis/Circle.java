package edu.gcccd.csis;

public class Circle {
    private double radius;
    private String color;
    private static long numOfCircles;
    Circle(String c, double r) {
        color = c;
        radius = r;
        numOfCircles++;
    }
    Circle(String c) {
        this(c, 1.0);
    }
    public String getColor() {
        return color;
    }
    public void setColor(String c) {
        color = c;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
    public double getCircumference() {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }
}

