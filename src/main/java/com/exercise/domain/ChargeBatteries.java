package com.exercise.domain;

import com.exercise.domain.enumeration.ActionType;

/**
 * Created by mario on 25/04/2019.
 */
public class ChargeBatteries implements Action {

    @Override
    public ActionType type() {
        return ActionType.CHARGE;
    }

    @Override
    public String description() {
        return "C";
    }
}
