package com.epam.mjc.collections.combined;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeveloperProjectFinderTest {
    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("EmptyProjectsMap",
                        Map.of(),
                        "Robert",
                        List.of()),

                Arguments.of("NoProjects",
                        Map.of("AXE", Set.of("Helen", "Bob", "Marian", "Tom"),
                                "MazPay", Set.of("James", "John"),
                                "SeaV", Set.of("John", "Angelina", "David"),
                                "DelFo", Set.of("Patricia", "Jessica", "Mark", "Paul"),
                                "ReaNon", Set.of("George", "Kyle", "Brandon", "Austin")),
                        "Robert",
                        List.of()),

                Arguments.of("HaveProjects",
                        Map.of("AXE", Set.of("Helen", "Bob", "Marian", "Tom"),
                                "MazPay", Set.of("James", "John", "Robert"),
                                "SeaV", Set.of("John", "Robert", "Angelina", "David"),
                                "DelFo", Set.of("Patricia", "Jessica", "Mark", "Paul"),
                                "ReaNon", Set.of("George", "Kyle", "Robert", "Brandon", "Austin")),
                        "Robert",
                        List.of("ReaNon", "MazPay", "SeaV"))
        );
    }

    @ParameterizedTest(name = "findDeveloperProject_{0}_Test")
    @MethodSource(value = "testCases")
    void findDeveloperProjectTest(String name,
                                  Map<String, Set<String>> projects,
                                  String developer,
                                  List<String> expectedDeveloperProjects) {

        DeveloperProjectFinder finder = new DeveloperProjectFinder();
        List<String> actualDeveloperProjects = finder.findDeveloperProject(projects, developer);
        assertEquals(expectedDeveloperProjects, actualDeveloperProjects);
    }
}
