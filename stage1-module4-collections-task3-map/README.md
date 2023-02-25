# Tasks

## 1. Word repetition Map

Implement the program which gets `String` sentence as parameter and creates a `Map<String,Integer>` of word repetition ,
where `key` - the word from sentence in lower case, `value` - the number of repetitions of this word, ignoring case.

```
public class WordRepetitionMapCreator {
  public Map<String, Integer> createWordRepetitionMap(String sentence) {
  }
}
```

### Example

**Input**

```
sentense in loWER caSE, SENTENCE IN UPper CAse.
```

**Output**

```
sentense - 2
in - 2
lower - 1
case - 2
upper - 1
```

## 2. Swap key and values

Implement the program which gets `Map<Integer, String>` as parameter and returns a `Map<String, Integer>` where the keys
and values are swapped. If in the source map `Map<Integer, String>` there are the same values for different keys, in the
new `Map<String, Integer>` this value should map to a smaller key value.

```
public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap){
    }
}
```

### Example

**Input**

```
1 - one
2 - two
3 - three
10 - one
```

**Output**

```
one - 1
two - 2
three - 3
```

## 3. Function value finder

Implement the program which gets `List<Integer>` and `required value` as parameter, creates `Map<Integer, Integer>` and
determines if `required value` is present among `Map values`.

The `key of Map` - element from `List<Integer>`, `value` - value of function `5x+2` for element from `List<Integer>`

```
public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue){
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
    }
}
```

### Example

**Input**

```
sourceList = [-1, 5, 4, 8]
value = 27
```

**Output**

```
true
```