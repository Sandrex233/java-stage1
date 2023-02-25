package com.epam.collections.queue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DishOrderDeterminerTest {
    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("WithNoDishes",
                        0,
                        3,
                        List.of()),

                Arguments.of("WithDishes",
                        11,
                        4,
                        List.of(4, 8, 1, 6, 11, 7, 3, 2, 5, 10, 9))
        );
    }

    @ParameterizedTest(name = "determineDishOrder_{0}_Test")
    @MethodSource(value = "testCases")
    void determineDishOrderTest(String name,
                                int numberOfDishes,
                                int everyDishNumberToEat,
                                List<Integer> expectedDishOrder) {

        DishOrderDeterminer determiner = new DishOrderDeterminer();
        List<Integer> actualDishOrder = determiner.determineDishOrder(numberOfDishes, everyDishNumberToEat);
        assertEquals(expectedDishOrder, actualDishOrder);
    }
}
