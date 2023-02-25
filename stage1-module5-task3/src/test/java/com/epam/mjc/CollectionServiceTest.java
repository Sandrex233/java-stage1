package com.epam.mjc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class CollectionServiceTest {

    @Test
    void filterEvenNumbersTest() {
        List<Integer> numbers = List.of(1, 6, 10, 5, 100, 1005, 125);
        List<Integer> expected = List.of(6, 10, 100);

        List<Integer> result = new CollectionService().filterEvenNumbers(numbers);

        assertEquals(expected, result);
    }

    @Test
    void toUpperCaseCollectionTest() {
        List<String> list = List.of("Hello", "mjc", "school");
        List<String> expected = List.of("HELLO", "MJC", "SCHOOL");

        List<String> result = new CollectionService().toUpperCaseCollection(list);

        assertEquals(expected, result);
    }

    @Test
    void findMaxTest() {
        List<Integer> numbers = List.of(1, 6, 10, 5, 100, 1005, 125);
        Optional<Integer> expected = Optional.of(1005);

        Optional<Integer> result = new CollectionService().findMax(numbers);

        assertEquals(expected, result);
    }

    @Test
    void findMinTest() {
        List<Integer> numbers = List.of(1, 6, 10, 5, 100, 1005, 125);
        List<Integer> numbers2 = List.of(9192, 1255, 5857, 123, 2, 6);

        List<List<Integer>> lists = List.of(numbers, numbers2);

        Optional<Integer> expected = Optional.of(1);

        Optional<Integer> result = new CollectionService().findMin(lists);

        assertEquals(expected, result);
    }

    @Test
    void sumTest() {
        List<Integer> numbers = List.of(1, 6, 10, 5, 100, 1005, 125);
        Integer expected = 1252;

        Integer result = new CollectionService().sum(numbers);

        assertEquals(expected, result);
    }
}
