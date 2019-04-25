package com.exercise.domain;

import com.exercise.domain.enumeration.ActionType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class Action {
	public abstract ActionType type();
	public abstract String description();
}
