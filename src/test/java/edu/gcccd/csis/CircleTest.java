package edu.gcccd.csis;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    Circle C1 = new Circle("green", 8.0);
    Circle C2 = new Circle("yellow");

    @Test
    public void getColor() {
        Assert.assertEquals("green", C1.getColor());
    }

    @Test
    public void setColor() {
        Assert.assertEquals("yellow", C2.getColor());
        C2.setColor("purple");
        Assert.assertEquals("purple", C2.getColor());
    }

    @Test
    public void getRadius() {
        Assert.assertEquals(8.0, C1.getRadius(), 0.00001);
        Assert.assertEquals(1.0, C2.getRadius(), 0.00001);

    }

    @Test
    public void getArea() {
        Assert.assertEquals(Math.PI*8.0*8.0, C1.getArea(), 0.00001);
        Assert.assertEquals(Math.PI*1.0*1.0, C2.getArea(), 0.00001);
    }

    @Test
    public void getCircumference() {
        Assert.assertEquals(2*Math.PI*8.0, C1.getArea(), 0.00001);
        Assert.assertEquals(2*Math.PI*1.0, C2.getArea(), 0.00001);
    }
}