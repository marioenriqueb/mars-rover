package com.exercise.service.impl;

import com.exercise.dao.RovertDao;
import com.exercise.domain.enumeration.Direction;
import com.exercise.exception.RovertException;
import com.exercise.service.RovertService;
import com.exercise.web.response.RovertResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RovertServiceImpl implements RovertService {

	private RovertDao dao;

	public RovertServiceImpl(RovertDao dao) {
		this.dao = dao;
	}

	@Override
	public void move(String direction) throws RovertException {
		this.dao.move(Direction.byCode(direction));
	}

	@Override
	public void stand() throws RovertException {
		this.dao.stand();
	}

	@Override
	public void transmit(String text) throws RovertException {
		this.dao.transmit(text);
	}

	@Override
	public RovertResponse status() throws RovertException {
		return new RovertResponse(this.dao.status());
	}
}
