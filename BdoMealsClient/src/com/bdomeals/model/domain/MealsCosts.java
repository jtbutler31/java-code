package com.bdomeals.model.domain;

/**
 * Domain Meals class that takes the ingredients and quantities from the other classes for
 * the purposes of the calculator use case which will be implemented in the future and show the value
 * of total craft amount
 * @author jason.butler
 *
 */
public class MealsCosts {

	private long meal;
	private long ingredient1;
	private long ingredient2;
	private long ingredient3;
	private long ingredient4;
	private long ingredient5;
	
	/**
	 * default constructor
	 */
	public MealsCosts() {}
	
	/**
	 * @param meal 
	 * @param ingredient1
	 * @param ingredient2
	 * @param ingredient3
	 * @param ingredient4
	 * @param ingredient5
	 */
	public MealsCosts(long meal, long ingredient1, long ingredient2, long ingredient3, long ingredient4, long ingredient5) {
		
		super ();
		this.meal = meal;
		this.ingredient1 = ingredient1;
		this.ingredient2 = ingredient2;
		this.ingredient3 = ingredient3;
		this.ingredient4 = ingredient4;
		this.ingredient5 = ingredient5;
	}

	/**
	 * @return meal
	 */
	public long getMeal() {
		return meal;
		
	}
	
	/**
	 * @param meal
	 */
	public void setMeal(long meal) {
		this.meal = meal;
	}
	
	
	/**
	 * @return ingredient1
	 */
	public long getIngredient1() {
		return ingredient1;
	}

	/**
	 * @param ingredient1
	 */
	public void setIngredient1(long ingredient1) {
		this.ingredient1 = ingredient1;
	}

	/**
	 * @return ingredient2
	 */
	public long getIngredient2() {
		return ingredient2;
	}

	/**
	 * @param ingredient2
	 */
	public void setIngredient2(long ingredient2) {
		this.ingredient2 = ingredient2;
	}

	/**
	 * @return ingredient3
	 */
	public long getIngredient3() {
		return ingredient3;
	}

	/**
	 * @param ingredient3
	 */
	public void setIngredient3(long ingredient3) {
		this.ingredient3 = ingredient3;
	}

	/**
	 * @return ingredient4
	 */
	public long getIngredient4() {
		return ingredient4;
	}

	/**
	 * @param ingredient4
	 */
	public void setIngredient4(long ingredient4) {
		this.ingredient4 = ingredient4;
	}

	/**
	 * @return ingredient5
	 */
	public long getIngredient5() {
		return ingredient5;
	}

	/**
	 * @param ingredient5
	 */
	public void setIngredient5(long ingredient5) {
		this.ingredient5 = ingredient5;
	}


	
	
	/**
	 * @return true as long as the ingredient values are not zero
	 */
	public boolean validate () 
	{
		if (meal == 0)
			return false;
		
		if (ingredient1 == 0) 
			return false;
		
		if (ingredient2 == 0) 
			return false;
		
		if (ingredient3 == 0) 
			return false;
		
		if (ingredient4 == 0) 
			return false;
	
		if (ingredient5 == 0) 
			return false;
		
	
		return true;
	}
	
	/**
	 * @param meals
	 * @return true if meals are equal to each other
	 */
	public boolean equals(MealsCosts meals) 
	{
		if (meal != meals.meal)
			return false;
		if (ingredient1 != meals.ingredient1) 
			return false;
		if (ingredient2 != meals.ingredient2) 
			return false;
		if (ingredient3 != meals.ingredient3) 
			return false;
		if (ingredient4 != meals.ingredient4)
			return false;
		if (ingredient5 != meals.ingredient5)
			return false;
		
		return true;
	}
	

}
