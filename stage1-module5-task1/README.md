# Tasks

## 1. Create Predicate

Implement the program which return `Predicate<List<String>>`. Predicate should check all values of the list and return true if all of them start with letter in upper case only.

`public Predicate<List<String>> isValuesStartWithUpperCase() { return x -> {};}`

## 2. Create Consumer

Implement the program which return `Consumer<List<Integer>>`. Consumer should find all even values and add them to the end of list.

`public Consumer<List<Integer>> addEvenValuesAtTheEnd() {return x -> {};}`

### Example

#### Input

`[48, 13, 100, 5, 222, 3]`

#### Output

`[48, 13, 100, 5, 222, 3, 48, 100, 222]`

## 3. Create Supplier

Implement the program which have a method with one argument `List<String>` and return `Supplier<List<String>>`. Supplier should filter out collection according rules below.

- String must start with the letter in upper case;
- String must end with '.';
- String must contain more than 3 words;

`public Supplier<List<String>> filterCollection(List<String> values) {return () -> {return values...};}`

### Example

- `"This is a good way to learn Java Functional Interfaces."` - correct string.
- `"this is a good way to learn Java Functional Interfaces."` - incorrect string.

#### Input

`["hello world in Java.", "MJC is a great school."]`

#### Output

`["MJC is a great school."]`

## 4. Create Function

Implement the program which return `Function<List<String>, Map<String, Integer>>`. Function should create a map where key is a value of the list and the value is size of the key.

`public Function<List<String>, Map<String, Integer>> stringSize() {return x -> {return ...};}`

### Example

#### Input

`["Hello", "MJC"]`

#### Output

`[{Hello, 5}. {MJC, 3}]`

## 5. Create Bi-Function

Implement the program which return `BiFunction<List<Integer>, List<Integer>, List<Integer>>`. Function should return new List which store values from first and second lists.

`public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
return (list1, list2) -> {return new ArrayList()...}`

### Example

#### Input

Array 1 - `[2, 4, 5, 10]`

Array 2 - `[3, 1, 10, 5]`

#### Output

`[2, 4, 5, 10, 3, 1, 10, 5]`
