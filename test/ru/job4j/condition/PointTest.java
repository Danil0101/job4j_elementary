package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenDistanceX1Y1Y2ZeroX2TwoThenTwo() {
        Assert.assertEquals(2, Point.distance(0, 0, 2, 0), 0.001);
    }

    @Test
    public void whenDistanceX1Y1TenX2Y2FiftyThenFiftySix() {
        Assert.assertEquals(56.568, Point.distance(10, 10, 50, 50), 0.001);
    }
}