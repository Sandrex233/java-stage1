package com.epam.mjc.nio;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;


public class FileReader {
    public Profile getDataFromFile(File file) {
        Profile newProfile = new Profile();
        Path filePath = Paths.get(file.toURI());

        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String field = parts[0].trim();
                    String value = parts[1].trim();
                    switch (field) {
                        case "Name":
                            newProfile.setName(value);
                            break;
                        case "Age":
                            newProfile.setAge(Integer.valueOf(value));
                            break;
                        case "Email":
                            newProfile.setEmail(value);
                            break;
                        case "Phone":
                            newProfile.setPhone(Long.valueOf(value));
                            break;
                        default:
                            // unknown field
                    }
                }
            }
        } catch (IOException e) {
            Logger logger = Logger.getLogger("MyLogger");
            logger.severe("Error reading file: " + e.getMessage());
        }

        return newProfile;
    }
}
