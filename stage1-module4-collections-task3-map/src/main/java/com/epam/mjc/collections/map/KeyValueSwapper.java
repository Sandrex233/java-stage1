package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> newMap = new HashMap<>();
        Map<String, Integer> valueToKeyMap = new HashMap<>();

        for (Map.Entry<Integer, String> map : sourceMap.entrySet()) {
            if (!valueToKeyMap.containsKey(map.getValue()) || valueToKeyMap.get(map.getValue()) > map.getKey()) {
                valueToKeyMap.put(map.getValue(), map.getKey());
            }
        }
        for (Map.Entry<Integer, String> map : sourceMap.entrySet()) {
            int newKey = valueToKeyMap.get(map.getValue());
            newMap.put(map.getValue(), newKey);
        }
        return newMap;
    }
}
