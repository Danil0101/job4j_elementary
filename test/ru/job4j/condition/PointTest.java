package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenDistanceX1Y1Y2ZeroX2TwoThenTwo() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        Assert.assertEquals(2, a.distance(b), 0.001);
    }

    @Test
    public void whenDistanceX1Y1TenX2Y2FiftyThenFiftySix() {
        Point a = new Point(10, 10);
        Point b = new Point(50, 50);
        Assert.assertEquals(56.568, a.distance(b), 0.001);
    }
}