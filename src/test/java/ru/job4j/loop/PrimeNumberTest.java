package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeNumberTest {
    @SuppressWarnings("checkstyle:WhitespaceAfter")
    @Test
    public void when5() {
        int finish = 5;
        int result = PrimeNumber.calc(finish);
        int expected = 3;
        assertEquals(result, expected);
    }

    @Test
    public void when11() {
        int finish = 11;
        int result = PrimeNumber.calc(finish);
        int expected = 5;
        assertEquals(result, expected);
    }

    @Test
    public void when2() {
        int finish = 2;
        int result = PrimeNumber.calc(finish);
        int expected = 1;
        assertEquals(result, expected);
    }
}