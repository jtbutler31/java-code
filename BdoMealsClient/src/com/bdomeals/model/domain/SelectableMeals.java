package com.bdomeals.model.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * Domain SelectableMeals Class used to create lists of meals
 * and list of ingredients of the given meal. The list is complied
 * from the corresponding ingredients listed on bdocodex.com
 * 
 * @author jason.butler
 *
 */
@Entity
@IdClass(SelectableMeals.class)
@Table(name="ListOfMeals")
public class SelectableMeals implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="mealName")
	private String mealName;

	@Id
	@Column(name="ingredient1Name")
	private String ingredient1Name; 

	@Id
	@Column(name="ingredient2Name")
	private String ingredient2Name;

	@Id
	@Column(name="ingredient3Name")
	private String ingredient3Name;

	@Id
	@Column(name="ingredient4Name")
	private String ingredient4Name;

	@Id
	@Column(name="ingredient5Name")
	private String ingredient5Name;
	
	@Override
	public boolean equals(Object object)
	{
        if (object == this) return true;
        if (object == null || getClass() != object.getClass()) return false;

        
        SelectableMeals other = (SelectableMeals) object;
        if (mealName == null ? other.mealName != null : !mealName.equals(other.mealName)) return false;
        if (ingredient1Name == null ? other.ingredient1Name != null : !ingredient1Name.equals(other.ingredient1Name)) return false;
        if (ingredient2Name == null ? other.ingredient2Name != null : !ingredient2Name.equals(other.ingredient2Name)) return false;
        if (ingredient3Name == null ? other.ingredient3Name != null : !ingredient3Name.equals(other.ingredient3Name)) return false;
        if (ingredient4Name == null ? other.ingredient4Name != null : !ingredient4Name.equals(other.ingredient4Name)) return false;
        if (ingredient5Name == null ? other.ingredient5Name != null : !ingredient5Name.equals(other.ingredient5Name)) return false;
       
        return true;
    }
        
	
	/**
	 * default constructor
	 */
	public SelectableMeals() {}
	
	
	/**
	 * @param mealName
	 * @param ingredient1Name
	 * @param ingredient2Name
	 * @param ingredient3Name
	 * @param ingredient4Name
	 * @param ingredient5Name
	 */
	
	
	public SelectableMeals(String mealName, String ingredient1Name, String ingredient2Name, String ingredient3Name, String ingredient4Name,
			String ingredient5Name) {
			
			super ();
			this.mealName= mealName;
			this.ingredient1Name = ingredient1Name;
			this.ingredient2Name = ingredient2Name;
			this.ingredient3Name = ingredient3Name;
			this.ingredient4Name = ingredient4Name;
			this.ingredient5Name = ingredient5Name;
		}
	
	/**
	 * @return the meal name
	 */
	public String getMealName() {
		return mealName;
	}



	/**
	 * @param mealName
	 */
	public void setMealName(String mealName) {
		this.mealName = mealName;
	}



	/**
	 * @return ingredient 1 name
	 */
	public String getIngredient1Name() {
		return ingredient1Name;
	}



	/**
	 * @param ingredient1Name
	 */
	public void setIngredient1Name(String ingredient1Name) {
		this.ingredient1Name = ingredient1Name;
	}



	/**
	 * @return ingredient 2 name
	 */
	public String getIngredient2Name() {
		return ingredient2Name;
	}



	/**
	 * @param ingredient2Name
	 */
	public void setIngredient2Name(String ingredient2Name) {
		this.ingredient2Name = ingredient2Name;
	}



	/**
	 * @return ingredient 3 name
	 */
	public String getIngredient3Name() {
		return ingredient3Name;
	}



	/**
	 * @param ingredient3Name
	 */
	public void setIngredient3Name(String ingredient3Name) {
		this.ingredient3Name = ingredient3Name;
	}



	/**
	 * @return ingredient 4 name
	 */
	public String getIngredient4Name() {
		return ingredient4Name;
	}



	/**
	 * @param ingredient4Name
	 */
	public void setIngredient4Name(String ingredient4Name) {
		this.ingredient4Name = ingredient4Name;
	}



	/**
	 * @return ingredient 5 name
	 */
	public String getIngredient5Name() {
		return ingredient5Name;
	}



	/**
	 * @param ingredient5Name
	 */
	public void setIngredient5Name(String ingredient5Name) {
		this.ingredient5Name = ingredient5Name;
	}
		
	
	/**
	 * @return true if all the fields hold values
	 */
	public boolean validateMeals() {
		if (mealName == null)
			return false;
		if (ingredient1Name == null)
			return false;
		if (ingredient2Name == null)
			return false;
		if (ingredient3Name == null)
			return false;
		if (ingredient4Name == null)
			return false;
		if (ingredient5Name == null)
			return false;

		return true;
	}

	public String toString()
	{
	  StringBuffer strBfr = new StringBuffer();
	  strBfr.append("\nMeal Name : ");
	  strBfr.append(mealName);
	  strBfr.append("\nIngredient 1 Name: ");
	  strBfr.append(ingredient1Name);
	  strBfr.append("\nIngredient 2 Name: ");
	  strBfr.append(ingredient2Name);
	  strBfr.append("\nIngredient 3 Name: ");
	  strBfr.append(ingredient3Name);
	  strBfr.append("\nIngredient 4 Name: ");
	  strBfr.append(ingredient4Name);
	  strBfr.append("\nIngredient 5 Name: ");
	  strBfr.append(ingredient5Name);
	
	  return strBfr.toString();
	}


}
	
		
		