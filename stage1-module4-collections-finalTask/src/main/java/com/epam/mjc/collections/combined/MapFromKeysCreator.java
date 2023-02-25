package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> newMap = new HashMap<>();

        for (String key : sourceMap.keySet()) {
            Set<String> set = newMap.getOrDefault(key.length(), new HashSet<>());
            set.add(key);
            newMap.put(key.length(), set);
        }
        return newMap;
    }
}
