package com.epam.mjc.collections.list;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListSorterTest {
    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("EmptyList",
                        new ArrayList<>(),
                        List.of()),

                Arguments.of("NonEmptyList",
                        new ArrayList<>(List.of("7", "10", "6", "-7", "-2", "0", "-2", "-23")),
                        List.of("0", "-2", "-2", "6", "-7", "7", "10", "-23"))
        );
    }

    @ParameterizedTest(name = "sort_{0}_Test")
    @MethodSource(value = "testCases")
    void sortTest(String name,
                  List<String> sourceList,
                  List<String> expectedList) {

        ListSorter listSorter = new ListSorter();
        listSorter.sort(sourceList);
        assertEquals(expectedList, sourceList);
    }
}
