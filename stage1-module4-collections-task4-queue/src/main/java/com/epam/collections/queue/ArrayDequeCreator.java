package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        // Keep taking turns until both players' queues are empty
        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            // Player 1's turn
            ad.add(firstQueue.remove());
            firstQueue.add(firstQueue.remove());
            ad.add(firstQueue.remove());

            // Player 2's turn
            ad.add(secondQueue.remove());
            secondQueue.add(secondQueue.remove());
            ad.add(secondQueue.remove());
        }

        // If any player's queue is not empty, add the remaining cards to the combined cards deque
        while (!firstQueue.isEmpty()) {
            ad.add(firstQueue.remove());
        }
        while (!secondQueue.isEmpty()) {
            ad.add(secondQueue.remove());
        }

        return ad;
    }
}
