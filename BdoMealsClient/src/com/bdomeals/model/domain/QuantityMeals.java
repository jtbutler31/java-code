package com.bdomeals.model.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * Domain QuantityMeals Class that sets the quantity of the corresponding
 * meals ingredients to their quantity in the recipe according to bdocodex.com
 * used in future calculator use case
 * 
 * @author jason.butler
 *
 */

@Entity
@IdClass(QuantityMeals.class)
@Table(name="QuantityOfInputs")
public class QuantityMeals implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="mealNameQuantity")
	private int mealNameQuantity;

	@Id
	@Column(name="ingredient1NameQuantity")
	private int ingredient1NameQuantity; 
	
	@Id
	@Column(name="ingredient2NameQuantity")
	private int ingredient2NameQuantity;

	@Id
	@Column(name="ingredient3NameQuantity")
	private int ingredient3NameQuantity;

	@Id
	@Column(name="ingredient4NameQuantity")
	private int ingredient4NameQuantity;

	@Id
	@Column(name="ingredient5NameQuantity")
	private int ingredient5NameQuantity;
	
	/**
	 * Default constructor
	 */
	public QuantityMeals () {}
	
	/**
	 * @param mealNameQuantity
	 * @param ingredient1NameQuantity
	 * @param ingredient2NameQuantity
	 * @param ingredient3NameQuantity
	 * @param ingredient4NameQuantity
	 * @param ingredient5NameQuantity
	 */
	
	public QuantityMeals(int mealNameQuantity, int ingredient1NameQuantity, int ingredient2NameQuantity, int ingredient3NameQuantity,
					int ingredient4NameQuantity, int ingredient5NameQuantity)
	 {
			
			super ();
			this.setMealNameQuantity(mealNameQuantity);
			this.setIngredient1NameQuantity(ingredient1NameQuantity);
			this.setIngredient2NameQuantity(ingredient2NameQuantity);
			this.setIngredient3NameQuantity(ingredient3NameQuantity);
			this.setIngredient4NameQuantity(ingredient4NameQuantity);
			this.setIngredient5NameQuantity(ingredient5NameQuantity);
		
	 }

	/**
	 * @return quantity by meal name
	 */
	public int getMealNameQuantity() {
		return mealNameQuantity;
	}

	/**
	 * @param mealNameQuantity
	 */
	public void setMealNameQuantity(int mealNameQuantity) {
		this.mealNameQuantity = mealNameQuantity;
	}

	/**
	 * @return quantity for ingredient 1
	 */
	public int getIngredient1NameQuantity() {
		return ingredient1NameQuantity;
	}

	/**
	 * @param ingredient1NameQuantity
	 */
	public void setIngredient1NameQuantity(int ingredient1NameQuantity) {
		this.ingredient1NameQuantity = ingredient1NameQuantity;
	}

	/**
	 * @return quantity for ingredient 2
	 */
	public int getIngredient2NameQuantity() {
		return ingredient2NameQuantity;
	}

	/**
	 * @param ingredient2NameQuantity2
	 */
	public void setIngredient2NameQuantity(int ingredient2NameQuantity2) {
		this.ingredient2NameQuantity = ingredient2NameQuantity2;
	}

	/**
	 * @return quantity for ingredient 3
	 */ 
	public int getIngredient3NameQuantity() {
		return ingredient3NameQuantity;
	}

	/**
	 * @param ingredient3NameQuantity2
	 */
	public void setIngredient3NameQuantity(int ingredient3NameQuantity2) {
		this.ingredient3NameQuantity = ingredient3NameQuantity2;
	}

	/**
	 * @return quantity for ingredient 4
	 */
	public int getIngredient4NameQuantity() {
		return ingredient4NameQuantity;
	}

	/**
	 * @param ingredient4NameQuantity2
	 */
	public void setIngredient4NameQuantity(int ingredient4NameQuantity2) {
		this.ingredient4NameQuantity = ingredient4NameQuantity2;
	}

	/**
	 * @return quantity for ingredient 5
	 */
	public int getIngredient5NameQuantity() {
		return ingredient5NameQuantity;
	}

	/**
	 * @param ingredient5NameQuantity2
	 */
	public void setIngredient5NameQuantity(int ingredient5NameQuantity2) {
		this.ingredient5NameQuantity = ingredient5NameQuantity2;
	}	
	
	/**
	 * @return true if quantities of the values are not equal to zero.
	 */
	public boolean validate() {
		if (mealNameQuantity == 0)
			return false;
		if (ingredient1NameQuantity == 0)
			return false;
		if (ingredient2NameQuantity == 0)
			return false;
		if (ingredient3NameQuantity == 0)
			return false;
		if (ingredient4NameQuantity == 0)
			return false;
		if (ingredient5NameQuantity == 0)
			return false;

		return true;
	}
	@Override
	public boolean equals(Object object)
	{
        if (object == this) return true;
        if (object == null || getClass() != object.getClass()) return false;

        
        QuantityMeals other = (QuantityMeals) object;
        if (mealNameQuantity == 0 ? other.mealNameQuantity != 0 : !(mealNameQuantity == (other.mealNameQuantity))) return false;
        if (ingredient1NameQuantity == 0 ? other.ingredient1NameQuantity != 0 : !(ingredient1NameQuantity == (other.ingredient1NameQuantity))) return false;
        if (ingredient2NameQuantity == 0 ? other.ingredient2NameQuantity != 0 : !(ingredient2NameQuantity == (other.ingredient2NameQuantity))) return false;
        if (ingredient3NameQuantity == 0 ? other.ingredient3NameQuantity != 0 : !(ingredient3NameQuantity == (other.ingredient3NameQuantity))) return false;
        if (ingredient4NameQuantity == 0 ? other.ingredient4NameQuantity != 0 : !(ingredient4NameQuantity == (other.ingredient4NameQuantity))) return false;
        if (ingredient5NameQuantity == 0 ? other.ingredient5NameQuantity != 0 : !(ingredient5NameQuantity == (other.ingredient5NameQuantity))) return false;
       
        return true;
    }
        
	/**
	 * @param quantityMeals
	 * @return true if quantity values are all equal
	 */
	public boolean equals(QuantityMeals quantityMeals) 
	{
		if (mealNameQuantity != quantityMeals.mealNameQuantity) 
			return false;
		if (ingredient1NameQuantity != quantityMeals.ingredient1NameQuantity)
			return false;
		if (ingredient2NameQuantity != quantityMeals.ingredient2NameQuantity)
			return false;
		if (ingredient3NameQuantity != quantityMeals.ingredient3NameQuantity) 
			return false;
		if (ingredient4NameQuantity != quantityMeals.ingredient4NameQuantity)
			return false;
		if (ingredient5NameQuantity != quantityMeals.ingredient5NameQuantity)
			return false;
		
		return true;
	}

	
	
}
