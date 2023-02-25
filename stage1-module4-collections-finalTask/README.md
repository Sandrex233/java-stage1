# Tasks

## 1. Lessons Getter

Implement the program which gets timetable and returns `set` of all lessons without duplicates. Timetable is
a `Map<String, List<String>>`, where the `key` - the day of the week and the `value` - `List<String> `of lessons
for that day.

```
public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable){
    }
}
```

### Example

**Input**

```
Modnay - English
Tuesday - Mathematics
Wednesday - English, Chemistry
Thursday - Literature, Mathematics
Friday - Physics
```

**Output**

```
English, Mathematics, Chemistry, Literature, Physics
```

## 2. Map from keys Creator

Implement the program which gets `Map<String, Integer>` as parameter and returns a new `Map<Integer, Set<String>>`,
where `key` - the lengths of the key from the source map, `value` - `Set<String>` of keys with corresponding length.

```
public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap){
    }
}
```

### Example

**Input**

```
one - 1
two - 2
three - 3
five - 4
ten - 10
```

**Output**

```
3 - one, two, ten
4 - five
5 - three
```

## 3. Developer Project Finder

Implement the program which gets `Map<String, List<String>>` of projects and its developers and the required
developer as parameters and returns a `List<String>` of projects for requested developer in descending order of project
name length. If the names of the projects are of the same length, then sort alphabetically in reverse order.

```
public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer){

    }
}
```

### Example

**Input**

```
Projects:
CSO - Ivan, Anna, Lidia, Antony
VVaS - Mary, Ben, Max, 
LJA - Oleg, Ivan, Alex
 
 Developer: Ivan
```

**Output**

```
CSO, LJA
```
