package com.exercise.domain.enumeration;

import com.exercise.exception.RovertException;

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

    Direction(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }

    public static Direction byCode(String code) throws RovertException {
        return Arrays.stream(Direction.values())
                .filter(e -> e.code.equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new RovertException(String.format("Unsupported type %s.", code)));
    }
}
