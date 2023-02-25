# Tasks

## 1. Create ArrayList

Implement the program which gets `List<String>` as parameter and creates a new `ArrayList<String>`. `ArrayList<String>`
should consist of _duplicated_ words whose index in `List<String>` _is divisible by 3_ (indexes start from 1).

```
public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
    }
}
```

### Example

**Input**

```
[The, ArrayList, class, has, many, useful, methods]
```

**Output**

```
[class, class, useful, useful]
```

## 2. Create a LinkedList

Implement the program which will create `LinkedList<Integer>` from `List<Integer>` following the rule:

_If the number from the `List<Integer>` is odd, then insert this number at the beginning of the `LinkedList<Integer>`,
otherwise, insert the number at the end_ of the `LinkedList<Integer>`.

```
public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
    }
}
```

### Example

**Input**

```
[2, 14, 3, 6, 5, 7]
```

**Output**

```
[7, 5, 3, 2, 14, 6]
```

## 3. List sorting

Implement the program which gets the `List` and sorts it in _ascending order of function_ `5x^2+3`, where `x` is element
from `List`. If the function value is the same for multiple elements, those elements are sorted in ascending order.

`List` consists of int _numbers represented as a_ `String`. Use a `Comparator` for sorting.

```
public class ListSorter {
    public void sort(List<String> sourceList) {
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
    }
}
```

### Example

**Input**

```
["-5", "-12", "0", "20", "9", "-20", "37"]
```

**Output**

```
["0", "-5", "9", "-12", "-20", "20", "37"]
```
