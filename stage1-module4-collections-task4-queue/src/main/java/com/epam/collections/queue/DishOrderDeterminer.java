package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> order = new ArrayList<>();
        Queue<Integer> dishes = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            dishes.add(i);
        }
        while (!dishes.isEmpty()) {
            for (int i = 0; i < everyDishNumberToEat-1; i++) {
                dishes.add(dishes.remove());
            }
            order.add(dishes.remove());
        }
        return order;
    }
}
