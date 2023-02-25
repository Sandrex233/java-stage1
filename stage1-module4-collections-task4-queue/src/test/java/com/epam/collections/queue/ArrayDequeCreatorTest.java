package com.epam.collections.queue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayDequeCreatorTest {
    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("QueuesWithTwoElements",
                        new LinkedList<>(List.of(1, 4)),
                        new LinkedList<>(List.of(5, 6)),
                        List.of(1, 4, 5, 6)),

                Arguments.of("QueuesWith6Elements",
                        new LinkedList<>(List.of(1, 3, 5, 4, 7, 9)),
                        new LinkedList<>(List.of(4, 2, 8, 5, 8, 3)),
                        List.of(1, 3, 4, 5, 8, 7, 8, 2, 4, 3, 5, 9))
        );
    }

    @ParameterizedTest(name = "createArrayDeque_{0}_Test")
    @MethodSource(value = "testCases")
    void createArrayDequeTest(String name,
                              Queue<Integer> firstQueue,
                              Queue<Integer> secondQueue,
                              List<Integer> expectedArrayDequeValues) {

        ArrayDequeCreator creator = new ArrayDequeCreator();
        ArrayDeque<Integer> actualArrayDeque = creator.createArrayDeque(firstQueue, secondQueue);
        assertEquals(expectedArrayDequeValues.size(), actualArrayDeque.size());
        expectedArrayDequeValues.forEach(
                expectedQueueValue -> assertEquals(expectedQueueValue, actualArrayDeque.poll()));
    }
}
