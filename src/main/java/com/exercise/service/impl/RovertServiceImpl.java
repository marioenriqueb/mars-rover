package com.exercise.service.impl;

import com.exercise.dao.RovertDao;
import com.exercise.domain.enumeration.Direction;
import com.exercise.exception.TransactionException;
import com.exercise.service.RovertService;
import com.exercise.web.response.RovertResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RovertServiceImpl implements RovertService {

	@Autowired
	private RovertDao dao;

	@Override
	public void move(String direction) throws TransactionException {
		this.dao.move(Direction.byCode(direction));
	}

	@Override
	public void stand() throws TransactionException {
		this.dao.stand();
	}

	@Override
	public void transmit(String text) throws TransactionException {
		this.dao.transmit(text);
	}

	@Override
	public RovertResponse status() throws TransactionException {
		return new RovertResponse(this.dao.status());
	}
}
