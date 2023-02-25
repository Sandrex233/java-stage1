package com.epam.mjc;

import java.util.List;

@FunctionalInterface
public interface Operation<T> {

    List<T> apply(List<T> arg);
}
