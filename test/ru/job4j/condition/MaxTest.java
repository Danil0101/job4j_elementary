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
    public void whenFirst10Second2Third15Then15() {
        assertThat(Max.max(10, 2, 15), is(15));
    }

    @Test
    public void whenFirst5Second20Third10Fourth6Then20() {
        assertThat(Max.max(5, 20, 10, 6), is(20));
    }
}