package com.epam.mjc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.List;

public class InterfaceCreatorTest {

    @Test
    void divideByTest() {
        List<Integer> numbers = List.of(9, 12, 15, 999, 30);
        List<Integer> expected = List.of(3, 4, 5, 333, 10);

        List<Integer> result = new InterfaceCreator().divideBy(3).apply(numbers);

        assertEquals(expected, result);
    }
}
