package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        assertThat(MultiMax.max(1, 4, 2), is(4));
    }

    @Test
    public void whenFirstMax() {
        assertThat(MultiMax.max(5, 4, 2), is(5));
    }

    @Test
    public void whenThirdMax() {
        assertThat(MultiMax.max(5, 4, 12), is(12));
    }
}