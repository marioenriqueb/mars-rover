package com.exercise.service;

import com.exercise.exception.TransactionException;
import com.exercise.web.response.RovertResponse;

public interface RovertService {
    public void move(String direction) throws TransactionException;
    public void stand() throws TransactionException;
    public void transmit(String text) throws TransactionException;
    public RovertResponse status() throws TransactionException;
}
