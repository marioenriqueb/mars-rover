package com.exercise.dao;

import com.exercise.domain.enumeration.Direction;

public interface RovertDao {

    public void move(Direction direction);
    public void stand();
    public void transmit(String text);
    public String[] status();

}