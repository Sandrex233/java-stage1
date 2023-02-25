package com.epam.mjc;

import junit.framework.TestCase;
import org.junit.Test;

public class MethodParserTest extends TestCase {

    private MethodParser parser = new MethodParser();

    @Test
    public void testParseFunction() {
        MethodSignature signature = parser.parseFunction("private void log(String logString, LogLevel level, Context context)");
        assertEquals(signature.getAccessModifier(), "private");
        assertEquals(signature.getReturnType(), "void");
        assertEquals(signature.getMethodName(), "log");
        assertEquals(signature.getArguments().size(), 3);
        assertArgument(signature.getArguments().get(0), "String", "logString");
        assertArgument(signature.getArguments().get(1), "LogLevel", "level");
        assertArgument(signature.getArguments().get(2), "Context", "context");
    }

    @Test
    public void testParseFunctionNoAccessModifier() {
        MethodSignature signature = parser.parseFunction("String repeat(String value, int times)");
        assertNull(signature.getAccessModifier());
        assertEquals(signature.getReturnType(), "String");
        assertEquals(signature.getMethodName(), "repeat");
        assertEquals(signature.getArguments().size(), 2);
        assertArgument(signature.getArguments().get(0), "String", "value");
        assertArgument(signature.getArguments().get(1), "int", "times");
    }

    @Test
    public void testParseFunctionNoArguments() {
        MethodSignature signature = parser.parseFunction("public float mark()");
        assertEquals(signature.getAccessModifier(), "public");
        assertEquals(signature.getReturnType(), "float");
        assertEquals(signature.getMethodName(), "mark");
        assertEquals(signature.getArguments().size(), 0);
    }

    private void assertArgument(MethodSignature.Argument argument, String type, String name) {
        assertEquals(argument.getType(), type);
        assertEquals(argument.getName(), name);
    }
}