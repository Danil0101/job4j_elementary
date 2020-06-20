package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenSquarePSixKTwoThenTwo() {
        Assert.assertEquals(2, SqArea.square(6, 2), 0.01);
    }

    @Test
    public void whenSquarePTenKFourThenFour() {
        Assert.assertEquals(4, SqArea.square(10, 4), 0.01);
    }
}