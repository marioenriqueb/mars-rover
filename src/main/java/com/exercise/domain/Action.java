package com.exercise.domain;

import com.exercise.domain.enumeration.ActionType;

public interface Action {
	ActionType type();
	String description();
}
