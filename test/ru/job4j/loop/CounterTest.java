package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        assertThat(Counter.sumByEven(1, 10), is(30));
    }

    @Test
    public void whenSumEvenNumbersFromOneToFiveThenSix() {
        assertThat(Counter.sumByEven(1, 5), is(6));
    }
}