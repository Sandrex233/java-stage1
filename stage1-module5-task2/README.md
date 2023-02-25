# Task

## Functional Interface

Implement a program which have your own functional interface according code below

```
@FunctionalInterface
public interface Operation<T> {
    List<T> apply(List<T> arg);
}
```

Implement a class `InterfaceCreator` with one method `Operation<Integer> divideBy(Integer divider)`. 
This method return your functional interface with logic where creates new list with 
values from the first list divided on divider of method.

### Example

#### Input

`[3, 6, 9]`

#### Output

`[1, 2, 3]`