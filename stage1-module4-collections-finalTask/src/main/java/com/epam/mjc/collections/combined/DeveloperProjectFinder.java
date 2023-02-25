package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();
        for (String project : projects.keySet()) {
            Set<String> developers = projects.get(project);
            if (developers.contains(developer)) {
                result.add(project);
            }
        }
        Collections.sort(result, new ProjectComparator());
        return result;
    }

    private class ProjectComparator implements Comparator<String> {
        @Override
        public int compare(String p1, String p2) {
            if (p1.length() != p2.length()) {
                return p2.length() - p1.length();
            } else {
                return p2.compareTo(p1);
            }
        }
    }
}
