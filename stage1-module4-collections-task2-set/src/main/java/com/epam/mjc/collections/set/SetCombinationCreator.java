package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> mySet = new HashSet<>(firstSet);
        mySet.retainAll(secondSet);
        mySet.removeAll(thirdSet);

        Set<String> thirdSetOnly = new HashSet<>(thirdSet);
        thirdSetOnly.removeAll(firstSet);
        thirdSetOnly.removeAll(secondSet);

        mySet.addAll(thirdSetOnly);

        return mySet;
    }
}
