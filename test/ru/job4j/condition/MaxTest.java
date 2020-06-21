package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        assertThat(Max.max(1, 2), is(2));
    }

    @Test
    public void whenMax10To2Then10() {
        assertThat(Max.max(10, 2), is(10));
    }

    @Test
    public void whenMax5To5Then5() {
        assertThat(Max.max(5, 5), is(5));
    }
}