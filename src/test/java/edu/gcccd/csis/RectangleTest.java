package edu.gcccd.csis;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    Rectangle R1 = new Rectangle(4.0, 7.0);
    Rectangle R2 = new Rectangle();
    Rectangle R3 = new Rectangle(20.0, 20.0);

    @Test
    public void setWidth() {
        Assert.assertEquals(4.0, R1.getWidth(), 0.00001);
        R1.setWidth(3.0);
        Assert.assertEquals(3.0, R1.getWidth(), 0.00001);
    }

    @Test
    public void setHeight() {
        Assert.assertEquals(7.0, R1.getHeight(), 0.00001);
        R1.setHeight(7.5);
        Assert.assertEquals(7.5, R1.getHeight(), 0.00001);
    }

    @Test
    public void getArea() {
        Assert.assertEquals(4.0 * 7.0, R1.getArea(), 0.00001);
        Assert.assertEquals(0.0 * 0.0, R2.getArea(), 0.00001);
        Assert.assertEquals(20.0 * 20.0, R3.getArea(), 0.00001);
    }

    @Test
    public void getCircumference() {
        Assert.assertEquals((2 * 4.0) +  (2 * 7.0), R1.getCircumference(), 0.00001);
        Assert.assertEquals((2 * 0.0) +  (2 * 0.0), R2.getCircumference(), 0.00001);
        Assert.assertEquals((2 * 20.0) +  (2 * 20.0), R3.getCircumference(), 0.00001);
    }

    @Test
    public void isSquare() {
        Assert.assertFalse(R1.isSquare());
        Assert.assertFalse(R2.isSquare());
        Assert.assertTrue(R3.isSquare());
    }
}