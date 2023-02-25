package com.epam.mjc.collections.map;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionValueFinderTest {
    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("EmptySourceList",
                        List.of(),
                        52,
                        false),

                Arguments.of("NotPresent",
                        List.of(2, -6, 19, 55, 11),
                        52,
                        false),

                Arguments.of("Present",
                        List.of(2, -6, 10, 19, 55, 11),
                        52,
                        true)
        );
    }

    @ParameterizedTest(name = "isFunctionValuePresent_{0}_Test")
    @MethodSource(value = "testCases")
    void isFunctionValuePresent(String name,
                                List<Integer> sourceList,
                                int requiredValue,
                                boolean isValuePresent) {

        FunctionValueFinder finder = new FunctionValueFinder();
        assertEquals(isValuePresent, finder.isFunctionValuePresent(sourceList, requiredValue));
    }
}
