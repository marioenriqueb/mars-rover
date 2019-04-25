package com.exercise.domain;

import com.exercise.domain.enumeration.ActionType;

/**
 * Created by mario on 25/04/2019.
 */
public class Transmit extends Action {

    private String text;

    public Transmit(String text) {
        this.text = text;
    }

    @Override
    public ActionType type() {
        return ActionType.TRANSMIT;
    }

    @Override
    public String description() {
        return "[" + text + "]";
    }
}
