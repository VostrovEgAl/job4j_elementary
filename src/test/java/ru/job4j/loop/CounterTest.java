package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    public void when0To5Then15() {
            int x1 = 0;
            int y1 = 5;
            int result = Counter.sum(x1, y1);
            int expected = 15;
            assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when2To1Then0() {
        int x1 = 2;
        int y1 = 1;
        int result = Counter.sum(x1, y1);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}