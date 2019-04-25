package com.exercise.dao.impl;

import com.exercise.dao.RovertDao;
import com.exercise.domain.Action;
import com.exercise.domain.ChargeBatteries;
import com.exercise.domain.Movement;
import com.exercise.domain.Transmit;
import com.exercise.domain.enumeration.Direction;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class RovertDaoImpl implements RovertDao {

	private List<Action> movements;

	@PostConstruct
	public void init() {
		this.movements = new ArrayList<>();
	}


	@Override
	public void move(Direction direction) {
		this.movements.add(new Movement(direction));
	}

	@Override
	public void stand() {
		this.movements.add(new ChargeBatteries());
	}

	@Override
	public void transmit(String text) {
		this.movements.add(new Transmit(text));
	}

	@Override
	public String[] status() {
		return this.movements.stream().map(action -> action.description()).toArray(String[]::new);
	}
}
