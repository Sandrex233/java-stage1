package com.epam.mjc.collections.map;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordRepetitionMapCreatorTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("FromEmptySentence",
                        "",
                        Map.of()),

                Arguments.of("FromSentenceWithoutRepetition",
                        "Java Map can store pairs of keys and values.",
                        Map.of("java", 1,
                                "map", 1,
                                "can", 1,
                                "store", 1,
                                "pairs", 1,
                                "of", 1,
                                "keys", 1,
                                "and", 1,
                                "values", 1)),

                Arguments.of("FromSentenceWithRepetition",
                        "hello word in lOwEr cAsE, HELLO WORD in UpPeR CaSe.",
                        Map.of("hello", 2,
                                "word", 2,
                                "in", 2,
                                "lower", 1,
                                "case", 2,
                                "upper", 1))
        );
    }

    @ParameterizedTest(name = "createWordRepetitionMap_{0}_Test")
    @MethodSource(value = "testCases")
    void createWordRepetitionMap(String name,
                                 String sentence,
                                 Map<String, Integer> expectedWordRepetitionMap) {

        WordRepetitionMapCreator wordRepetitionMapCreator = new WordRepetitionMapCreator();
        Map<String, Integer> actualWordRepetitionMap = wordRepetitionMapCreator.createWordRepetitionMap(sentence);
        assertEquals(expectedWordRepetitionMap, actualWordRepetitionMap);
    }
}
