# Tasks

## 1. PriorityQueue creator

Implement the program which gets two `List<String>` and merged them into `PriorityQueue<String>` alphabetically in
reverse order.

```
public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
    }
}
```

**Input**

```
firstList = ["Java", "PriorityQueue", "class"]
secondList = ["It", "is", "different", "from", "standard", "queues", "where", "FIFO"]
```

**Output**

```
["where", "standard", "queues", "is", "from", "different", "class",  "PriorityQueue", "Java", "It", "FIFO"]
```

## 2. ArrayDeque creator

Two players have two `Queue<Integer>` of cards with the same even sizes(>=2). They want to combine all the cards
together into an `ArrayDeque<Integer>` according to the following rule.

_First, both take turns adding two cards to the `ArrayDeque<Integer>`. Then, with each move, the player:_

* _takes the top card from the `ArrayDeque<Integer>` and adds this card to the end of his `Queue<Integer>`_
* _then puts two cards from the beginning of his `Queue<Integer>` into the `ArrayDeque<Integer>`_.

_The moves go until the both players' `Queue<Integer>` of cards are not empty._

Implement the program which gets two `Queue<Integer>` and creates `ArrayDeque<Integer>` in accordance with the rules of
the game.

```
public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
    }
}
```

**Input**

```
firstQueue = [1, 5, 7, 6]
secondQueue = [2, 5, 8, 3]
```

**Output**

```
[1, 5, 2, 7, 8, 5, 6, 3]
```

## 3. Dish order determiner

On the round table stands `numberOfDishes` dishes numbered in ascending order `from 1 to numberOfDishes`. A man wants to
try all the dishes according to the following rule:

* _He will eat every `everyDishNumberToEat` dish until he has eaten everything_.

Implement the program which gets number of dishes as parameter `numberOfDishes`, dish number to eat as
parameter `everyDishNumberToEat` and returns a `List<Integer>` of dish numbers in which all dishes will be eaten.

```
public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue;
    }
}
```

### Example

**Input**

```
numberOfDishes = 10
everyDishNumberToEat = 3

dishes: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
```

**Output**

```
[3, 6, 9, 2, 7, 1, 8, 5, 10, 4]
```

