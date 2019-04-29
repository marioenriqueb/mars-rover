package com.exercise.domain;

import com.exercise.domain.enumeration.ActionType;

public interface Action {
	public ActionType type();
	public String description();
}
