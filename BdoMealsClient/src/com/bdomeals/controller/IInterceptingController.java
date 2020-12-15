package com.bdomeals.controller;

import java.util.ArrayList;

import com.bdomeals.model.domain.QuantityMeals;
import com.bdomeals.model.domain.SelectableMeals;

public interface IInterceptingController {

	ArrayList<SelectableMeals> mealList(String commandString);
	ArrayList<QuantityMeals> mealInputs(String commandString);
	
}
