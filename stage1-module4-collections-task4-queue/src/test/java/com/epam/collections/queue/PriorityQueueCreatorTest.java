package com.epam.collections.queue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PriorityQueueCreatorTest {
    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("BothListsEmpty",
                        List.of(),
                        List.of(),
                        List.of()),

                Arguments.of("FirstListEmptySecondFilled",
                        List.of(),
                        List.of("Objects", "are", "processed", "based", "on", "their", "priority"),
                        List.of("their", "processed", "priority", "on", "based", "are", "Objects")),

                Arguments.of("FirstFilledSecondEmpty",
                        List.of("The", "Java", "PriorityQueue", "class"),
                        List.of(),
                        List.of("class", "The", "PriorityQueue", "Java")),

                Arguments.of("BothListsFilled",
                        List.of("The", "Java", "PriorityQueue", "class"),
                        List.of("Objects", "are", "processed", "based", "on", "their", "priority"),
                        List.of("their", "processed", "priority", "on", "class", "based", "are", "The", "PriorityQueue", "Objects", "Java"))
        );
    }

    @ParameterizedTest(name = " createPriorityQueue_{0}_Test")
    @MethodSource(value = "testCases")
    void createPriorityQueueTest(String name,
                                 List<String> firstList,
                                 List<String> secondList,
                                 List<String> expectedPriorityQueueValues) {

        PriorityQueueCreator creator = new PriorityQueueCreator();
        PriorityQueue<String> actualQueue = creator.createPriorityQueue(firstList, secondList);
        assertEquals(expectedPriorityQueueValues.size(), actualQueue.size());
        expectedPriorityQueueValues.forEach(expectedQueueValue -> assertEquals(expectedQueueValue, actualQueue.poll()));
    }
}
