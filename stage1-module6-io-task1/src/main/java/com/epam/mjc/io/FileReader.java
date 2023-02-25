package com.epam.mjc.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;


public class FileReader {
    public Profile getDataFromFile(File file) {
        Profile newProfile = new Profile();
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(file))) {
            String st;
            while ((st = br.readLine()) != null) {
                String[] parts = st.split(":");
                String key = parts[0].trim();
                String value = parts[1].trim();
                switch (key) {
                    case "Name":
                        newProfile.setName(value);
                        break;
                    case "Age":
                        newProfile.setAge(Integer.parseInt(value));
                        break;
                    case "Email":
                        newProfile.setEmail(value);
                        break;
                    case "Phone":
                        newProfile.setPhone(Long.parseLong(value));
                        break;
                    default:
                        /* default clause */
                        break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return newProfile;
    }
}
