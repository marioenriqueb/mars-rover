package com.exercise.domain;

import com.exercise.domain.enumeration.ActionType;
import com.exercise.domain.enumeration.Direction;

/**
 * Created by mario on 25/04/2019.
 */
public class Movement extends Action {

    private Direction direction;

    public Movement(Direction direction) {
        this.direction = direction;
    }

    @Override
    public ActionType type() {
        return ActionType.MOVEMENT;
    }

    @Override
    public String description() {
        return this.direction.toString().toUpperCase();
    }
}
