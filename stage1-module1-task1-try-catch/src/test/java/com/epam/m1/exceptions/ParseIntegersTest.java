package com.epam.m1.exceptions;

import static java.nio.file.Files.readAllLines;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ParseIntegersTest {

    @Test
    public void main_exceptionIsCaughtInTheWhileAndHandled_correctOutput() {
        // given
        final ByteArrayOutputStream sink = new ByteArrayOutputStream();
        PrintStream controlledOut = new PrintStream(sink);
        PrintStream defaultOut = System.out;
        System.setOut(controlledOut);
        // when
        ParseIntegers.main(new String[]{});
        controlledOut.flush();
        // then
        String actual = sink.toString().trim();
        List<String> results = Arrays.asList(actual.split("\n"));
        String sum =
                results.stream().filter(s -> s.contains("Sum")).findFirst().map(String::trim).orElse("");
        String justWords =
                results.stream().filter(s -> s.contains("JDK")).findFirst().map(String::trim).orElse("");
        assertEquals("Sum is 2066", sum);
        assertEquals(
                "Just words: JDK has released on September with new features, feature removals and feature deprecations.",
                justWords);
        System.setOut(defaultOut);
    }

    @Test
    public void
    main_parseIntIsUsedAndNumberFormatExceptionIsCaught_parseIntAndNumberFormatExceptionAreInTheCode()
            throws IOException {
        Files.walk(Paths.get("src/main/java"))
                .filter(Files::isRegularFile)
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(
                        sourcePath -> {
                            String result;
                            try {
                                result = String.join("\n", readAllLines(sourcePath, StandardCharsets.UTF_8));
                            } catch (IOException e) {
                                throw new IllegalStateException(e);
                            }
                            final String source = result;

                            assertTrue(
                                    "For parsing Integers should be used Integer.parseInt() method",
                                    source.contains("parseInt("));
                            assertTrue(
                                    "Parsing Exception should be handled", source.contains("NumberFormatException"));
                        });
    }
}

