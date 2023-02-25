package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> mySet = new HashSet<>();
        for (int x : sourceList){
            if(x % 2 == 0){
                int y = x;
                while (y % 2 == 0){
                    mySet.add(y);
                    y /= 2;
                }
                mySet.add(y);
            } else {
                mySet.add(x);
                mySet.add(x*2);
            }
        }
        return mySet;
    }
}
