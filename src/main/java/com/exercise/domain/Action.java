package com.exercise.domain;

import com.exercise.domain.enumeration.ActionType;

public abstract class Action {
	public abstract ActionType type();
	public abstract String description();
}
