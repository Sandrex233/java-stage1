package com.epam.mjc.collections.list;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListCreatorTest {
    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("EmptySourceList",
                        List.of(),
                        new ArrayList<>()),

                Arguments.of("FromListWithTwoElements",
                        List.of("Hello", "Word"),
                        new ArrayList<>()),

                Arguments.of("FromListWithThreeElements",
                        List.of("I", "love", "you"),
                        new ArrayList<>(List.of("you", "you"))),

                Arguments.of("FromListWithFourElements",
                        List.of("Java", "is", "the", "best"),
                        new ArrayList<>(List.of("the", "the"))),

                Arguments.of("FromListWithSixElements",
                        List.of("List", "can", "consist", "of", "different", "objects"),
                        new ArrayList<>(List.of("consist", "consist", "objects", "objects")))
        );
    }

    @ParameterizedTest(name = "createArrayList_{0}_Test")
    @MethodSource(value = "testCases")
    void createArrayListTest(String name,
                             List<String> sourceList,
                             ArrayList<String> expectedArrayList) {

        ArrayListCreator arrayListCreator = new ArrayListCreator();
        ArrayList<String> actualArrayList = arrayListCreator.createArrayList(sourceList);
        assertEquals(expectedArrayList, actualArrayList);
    }
}
