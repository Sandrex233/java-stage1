package com.epam.mjc.collections.set;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetCombinationCreatorTest {
    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("WithAllEmptySets",
                        new HashSet<>(),
                        new HashSet<>(),
                        new HashSet<>(),
                        Set.of()),

                Arguments.of("WithNonEmptyIntersectionOfFirstAndSecondSetsAndEmptyThirdSet",
                        new HashSet<>(Set.of("Java", "SortedSet", "Map", "Collections", "Iterable", "Set", "NavigableSet")),
                        new HashSet<>(Set.of("Queue", "SortedSet", "NavigableSet", "List", "Set", "Iterator", "Comparator")),
                        new HashSet<>(),
                        Set.of("SortedSet", "NavigableSet", "Set")),

                Arguments.of("WithNonEmptyIntersectionOfFirstAndSecondSetsAndThirdSetOnlyNonUniqueElements",
                        new HashSet<>(Set.of("Java", "SortedSet", "Map", "Collections", "Iterable", "Set", "NavigableSet")),
                        new HashSet<>(Set.of("Queue", "SortedSet", "NavigableSet", "List", "Set", "Iterator", "Comparator")),
                        new HashSet<>(Set.of("Java", "Iterable", "Comparator")),
                        Set.of("SortedSet", "NavigableSet", "Set")),

                Arguments.of("WithEmptyIntersectionOfFirstAndSecondSetsAndThirdSetWithUniqueElements",
                        new HashSet<>(Set.of("Java", "SortedSet", "Map", "Collections", "Iterable", "Set", "NavigableSet")),
                        new HashSet<>(Set.of("Queue", "List", "Iterator", "Comparator")),
                        new HashSet<>(Set.of("TreeSet", "HashSet", "LinkedHashSet", "Collections", "Iterable")),
                        Set.of("TreeSet", "HashSet", "LinkedHashSet")),

                Arguments.of("WithNonEmptyIntersectionOfFirstAndSecondSetsAndNonEmptyThirdSet",
                        new HashSet<>(Set.of("Java", "SortedSet", "Map", "Collections", "Iterable", "Set", "NavigableSet")),
                        new HashSet<>(Set.of("Queue", "SortedSet", "NavigableSet", "List", "Set", "Iterator", "Comparator")),
                        new HashSet<>(Set.of("TreeSet", "HashSet", "LinkedHashSet", "Collections", "Iterable")),
                        Set.of("SortedSet", "NavigableSet", "Set", "TreeSet", "HashSet", "LinkedHashSet"))
        );
    }

    @ParameterizedTest(name = "createSetCombination_{0}_Test")
    @MethodSource(value = "testCases")
    void createSetCombinationTest(String name,
                                  Set<String> firstSet,
                                  Set<String> secondSet,
                                  Set<String> thirdSet,
                                  Set<String> expectedSetCombination) {

        SetCombinationCreator setCombinationCreator = new SetCombinationCreator();
        Set<String> actualSetCombination = setCombinationCreator.createSetCombination(firstSet, secondSet, thirdSet);
        assertEquals(expectedSetCombination, actualSetCombination);
    }
}
