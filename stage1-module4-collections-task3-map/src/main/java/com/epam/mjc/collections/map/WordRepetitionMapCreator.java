package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : sentence.toLowerCase().split("\\W+")) {
            if (sentence.length() > 0) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }

        return map;
    }
}
