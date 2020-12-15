package com.bdomeals.view.calculatorjframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.bdomeals.controller.BdoMealsController;
import com.bdomeals.controller.IInterceptingController;
import com.bdomeals.model.domain.MealsCosts;
import com.bdomeals.model.domain.QuantityMeals;

/**
 * Controller for CalculatorJFrame
 * @author jason.butler
 *
 */
public class CalculatorJFrameController implements ActionListener {
	
	private CalculatorJFrame calculatorJFrame;
	QuantityMeals mealSelection;
	
	/**
	 * default constructor
	 */
	public CalculatorJFrameController () {}
	
	/**
	 * @param calculatorJFrame
	 */
	public CalculatorJFrameController (CalculatorJFrame calculatorJFrame) {
		
		this.calculatorJFrame = calculatorJFrame; 
		
		
		calculatorJFrame.getCalcButton().addActionListener(this);
	    calculatorJFrame.getCancelButton().addActionListener(this);
	}

	

	public void actionPerformed(ActionEvent event) 
	  {

	    System.out.println ("Inside CalculatorJFrameController::actionPerformed");
	    
	    if (event.getSource().equals(calculatorJFrame.getCalcButton()))
	     calc_actionPerformed(event);
	    else if (event.getSource().equals(calculatorJFrame.getCancelButton()))
	      cancel_actionPerformed(event);
	  }

	private void cancel_actionPerformed(ActionEvent event) {
		calculatorJFrame.setVisible(false);
		calculatorJFrame.dispose();
	}
	private void calc_actionPerformed(ActionEvent event) {
		
		MealsCosts mealsCosts = calculatorJFrame.getSelectedData();
		ArrayList<QuantityMeals> mealSelection;
	     
	    BdoMealsController bdoMealsController = new BdoMealsController();
	   
	 	
	 	 
	 	 if(bdoMealsController!=null) {
	 		 
	 	 ArrayList<QuantityMeals> mealInput = bdoMealsController.mealInputs("MealInputs");
	 	 mealSelection = mealInput;
		       
		 System.out.println(mealSelection);
		 
		 int mealInputValues = CalculatorJFrame.getMealSelectionTwo();
		      
		       long profit = (mealSelection.get(mealInputValues).getMealNameQuantity()*mealsCosts.getMeal()) - ((mealSelection.get(mealInputValues).getIngredient1NameQuantity()*mealsCosts.getIngredient1()) +
		    		   (mealSelection.get(mealInputValues).getIngredient2NameQuantity()*mealsCosts.getIngredient2()) +
		    		   (mealSelection.get(mealInputValues).getIngredient3NameQuantity()*mealsCosts.getIngredient3()) +
		    		   (mealSelection.get(mealInputValues).getIngredient4NameQuantity()*mealsCosts.getIngredient4()) +
		    		   (mealSelection.get(mealInputValues).getIngredient5NameQuantity()*mealsCosts.getIngredient5()));
		       JOptionPane.showMessageDialog(calculatorJFrame, "Profit = " +profit);
		       calculatorJFrame.setVisible(false);
		       calculatorJFrame.dispose();
		
		     } 
		    /* else if (bdoMealsController==null)
		     {
		    	 JOptionPane.showMessageDialog(calculatorJFrame , "MealInputs not loaded. Please try back later!");    
		         
		    } */
	   
	 	 
	 	 }
	}
	

