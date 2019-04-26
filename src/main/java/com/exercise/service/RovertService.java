package com.exercise.service;

import com.exercise.exception.RovertException;
import com.exercise.web.response.RovertResponse;

public interface RovertService {
    public void move(String direction) throws RovertException;
    public void stand() throws RovertException;
    public void transmit(String text) throws RovertException;
    public RovertResponse status() throws RovertException;
}
