package com.example.scott.fruitmachine;

/**
 * Created by scott on 03/11/2017.
 */

public enum Symbols {
    BAR (5),
    BANANA (10),
    WATERMELON (15),
    STRAWBERRY (20),
    CHERRY (25),
    SEVEN (30),
    LEMON (35),
    BIGWIN (50);

    private final int value;

    Symbols(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
