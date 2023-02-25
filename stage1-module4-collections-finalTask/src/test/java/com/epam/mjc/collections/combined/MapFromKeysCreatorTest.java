package com.epam.mjc.collections.combined;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapFromKeysCreatorTest {
    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("EmptySourceMap",
                        Map.of(),
                        Map.of()),

                Arguments.of("FilledSourceMap",
                        Map.of("Monday", 1,
                                "Tuesday", 2,
                                "Wednesday", 3,
                                "Thursday", 4,
                                "Friday", 5),
                        Map.of(6, Set.of("Monday", "Friday"),
                                7, Set.of("Tuesday"),
                                8, Set.of("Thursday"),
                                9, Set.of("Wednesday"))));
    }

    @ParameterizedTest(name = "createMap_{0}_Test")
    @MethodSource(value = "testCases")
    void createMap(String name, Map<String, Integer> sourceMap, Map<Integer, Set<String>> expectedMapFromKeys) {

        MapFromKeysCreator creator = new MapFromKeysCreator();
        Map<Integer, Set<String>> actualMapFromKeys = creator.createMap(sourceMap);
        assertEquals(expectedMapFromKeys, actualMapFromKeys);
    }
}
