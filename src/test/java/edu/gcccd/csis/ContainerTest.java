package edu.gcccd.csis;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerTest {
    Container Con1 = new Container();
    Container Con2 = new Container();
    Container Con3 = new Container();
    Container Con4 = new Container();
    Circle C1 = new Circle("green", 8.0);
    Rectangle R1 = new Rectangle(4.0, 7.0);

    @Test
    public void getCircle() {
        Assert.assertEquals(null, Con1.getCircle());
    }

    @Test
    public void setCircle() {
        Con1.setCircle(C1);
        Assert.assertNotEquals(null, Con1.getCircle());
    }

    @Test
    public void getRectangle() {
        Assert.assertEquals(null, Con1.getRectangle());
    }

    @Test
    public void setRectangle() {
        Con1.setRectangle(R1);
        Assert.assertNotEquals(null, Con1.getRectangle());
    }

    @Test
    public void size() {
        Con1.setCircle(C1);
        Con1.setRectangle(R1);
        Con2.setCircle(C1);
        Con3.setRectangle(R1);
        Assert.assertEquals(2, Con1.size());
        Assert.assertEquals(1, Con2.size());
        Assert.assertEquals(1, Con3.size());
        Assert.assertEquals(0, Con4.size());
    }
}