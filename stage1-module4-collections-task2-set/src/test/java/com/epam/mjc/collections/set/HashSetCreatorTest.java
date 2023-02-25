package com.epam.mjc.collections.set;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashSetCreatorTest {
    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("FromEmptyList",
                        List.of(),
                        Set.of()),

                Arguments.of("FromListWithOddElement",
                        List.of(5),
                        Set.of(5, 10)),

                Arguments.of("FromListWithEvenElement",
                        List.of(16),
                        Set.of(1, 2, 4, 8, 16)),

                Arguments.of("FromListWithOddAndEvenElement",
                        List.of(3, 8, 5, 6, 10, 2, 7, 12),
                        Set.of(3, 8, 4, 2, 1, 5, 10, 7, 14, 12, 6))
        );
    }

    @ParameterizedTest(name = "createHashSet_{0}_Test")
    @MethodSource(value = "testCases")
    void createHashSetTest(String name,
                           List<Integer> sourceList,
                           Set<Integer> expectedHashSet) {

        HashSetCreator hashSetCreator = new HashSetCreator();
        HashSet<Integer> actualHashSet = hashSetCreator.createHashSet(sourceList);
        assertEquals(expectedHashSet, actualHashSet);
    }
}
