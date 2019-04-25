package com.exercise.domain.enumeration;

import java.util.Arrays;

/**
 * The ActionType enumeration.
 */
public enum Direction {
    L("left"),
    R("right"),
    U("up"),
    D("down");

    private String code;

    private Direction(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }

    public static Direction byCode(String code) {
        return Arrays.stream(Direction.values())
                .filter(e -> e.code.equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(String.format("Unsupported type %s.", code)));
    }
}
