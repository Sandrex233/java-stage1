package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class MethodParser {

    /**
     * Parses string that represents a method signature and stores all it's members into a {@link MethodSignature} object.
     * signatureString is a java-like method signature with following parts:
     * 1. access modifier - optional, followed by space: ' '
     * 2. return type - followed by space: ' '
     * 3. method name
     * 4. arguments - surrounded with braces: '()' and separated by commas: ','
     * Each argument consists of argument type and argument name, separated by space: ' '.
     * Examples:
     * accessModifier returnType methodName(argumentType1 argumentName1, argumentType2 argumentName2)
     * private void log(String value)
     * Vector3 distort(int x, int y, int z, float magnitude)
     * public DateTime getCurrentDateTime()
     *
     * @param signatureString source string to parse
     * @return {@link MethodSignature} object filled with parsed values from source string
     */
    public MethodSignature parseFunction(String signatureString) {
        // Split the signatureString at the opening parenthesis '('
        String[] parts = signatureString.split("\\(");

        // The first part contains the access modifier (if present), return type, and method name
        String[] nameAndReturnType = parts[0].split("\\s+");

        // Initialize variables to store the access modifier, return type, and method name
        String accessModifier = null;
        String returnType = "void";
        String methodName = nameAndReturnType[nameAndReturnType.length - 1];

        // If there is more than one element in nameAndReturnType, the second-to-last element is the return type
        // and the first element (if present) is the access modifier
        if (nameAndReturnType.length > 1) {
            returnType = nameAndReturnType[nameAndReturnType.length - 2];
            accessModifier = nameAndReturnType.length > 2 ? nameAndReturnType[0] : null;
        }

        // Initialize a list to store the method arguments
        List<MethodSignature.Argument> arguments = new ArrayList<>();

        // If there is more than one part (i.e. if there are arguments), split the second part at the closing parenthesis ')'
        if (parts.length > 1) {
            String[] args = parts[1].split("\\)");

            if (args.length > 0) {
                // The first (and only) element of args is the argument list, split by commas
                String[] argStrings = args[0].split(",");
                for (String argString : argStrings) {
                    // Split each argument string into its type and name, and add it to the arguments list
                    String[] argParts = argString.trim().split("\\s+");
                    arguments.add(new MethodSignature.Argument(argParts[0], argParts[1]));
                }
            }
        }

        // Create a new MethodSignature object with the method name and argument list
        MethodSignature methodSignature = new MethodSignature(methodName, arguments);

        // Set the access modifier and return type (if present)
        methodSignature.setReturnType(returnType);
        methodSignature.setAccessModifier(accessModifier);

        // Return the MethodSignature object
        return methodSignature;
    }
}
