package edu.gcccd.csis;

public class Rectangle {
    private double width;
    private double height;
    private static long numOfRectangles;
    Rectangle(double w, double h) {
        width = w;
        height = h;
        numOfRectangles++;
    }
    Rectangle() {
        numOfRectangles++;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double w) {
        width = w;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double h) {
        height = h;
    }
    public double getArea() {
        double area = width * height;
        return area;
    }
    public double getCircumference() {
        double circumference = (2 * width) +  (2 * height);
        return circumference;
    }
    public boolean isSquare() {
        boolean isSquare;
        if ((width == 0 || height == 0) || (height != width))
            isSquare = false;
        else
            isSquare = true;
        return isSquare;
    }
}
