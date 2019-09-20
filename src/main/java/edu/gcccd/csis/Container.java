package edu.gcccd.csis;

public class Container {
    private Circle circle;
    private Rectangle rectangle;
    public Circle getCircle() {
        return circle;
    }
    public void setCircle(Circle circle) {
        this.circle = circle;
    }
    public Rectangle getRectangle() {
        return rectangle;
    }
    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }
    public int size() {
        int num;
        if(circle == null && rectangle == null) {
            num = 0;
        }
        else if(circle == null || rectangle == null) {
            num = 1;
        }
        else {
            num = 2;
        }
        return num;
    }
}
