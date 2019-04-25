package com.exercise.dao;

import com.exercise.domain.Action;
import com.exercise.domain.enumeration.Direction;

import java.util.List;

public interface RovertDao {

    public void move(Direction direction);
    public void stand();
    public void transmit(String text);
    public String[] status();

}