# Tasks

## 1. Create HashSet

Implement the program which gets `List<Integer>` as parameter and creates a `HashSet<Integer>` following the rule:

* If the element `x` from `List<Integer>` is even, then add to the `HashSet` values: `x`, `x/2`, `(x/2)/2`
  ... `((x/2)/2)../2)` (dividing by 2 until the last inserted element is an odd number)
* If the element `x` from `List<Integer>` is odd, then add to the `HashSet`values:`x` and `2x`

```
public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
    }
}
```

### Example

**Input**

```
sourceList = [2, -1, 3, 8, -5, 12]
```

**Output**

```
[2, 1, -1, -2, 3, 6, 8, 4, -5, -10, 12]
```

## 2. Create Set of squares

Implement the program which creates `TreeSet<Integer>` of squares of elements from `List<Integer>` and returns a `subset
of this set`, consisting of elements in the range `[lowerBound, upperBound]`. To get subset use method
from `Interface NavigableSet<E>`.

```
public class SubsetOfSquaresCreator {
  public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
  }
}
```

### Example

**Input**

```
sourceList = [2, -1, 5, -7, 4, 6, -9, 8]
lowerBound = 25
upperBound = 49
```

**Output**

```
[25, 36, 49]
```

## 3. Create a combination of sets

Implement the program which creates `Set<String>` of 3 `Sets`. Result `Set` should consist of the following elements:

* elements that belong to the first and the second `Sets` at once and not belong to the third `Set`
* elements that belong only to the third `Set`.

```
public class SetCombinationCreator {
  public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
  }
}
```

### Example

**Input**

```
firstSet = ["Java", "Collection",  "framework", "interface", "class", "Queue"]
secondSet = ["Queue", "iterator", "Java", "Collection","comparator"]
thirdSet= ["Java", "Set", "Map", "List"]
```

**Output**

```
["Collection", "Queue", "Set", "Map", "List"]
```
