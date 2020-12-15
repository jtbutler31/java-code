package com.bdomeals.view.selectionjframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import com.bdomeals.controller.BdoMealsController;
import com.bdomeals.model.domain.SelectableMeals;
import com.bdomeals.view.calculatorjframe.CalculatorJFrame;

/**
 * @author jason.butler
 *
 */
public class SelectionJFrameController implements ActionListener {
	
	
	private SelectionJFrame selectionJFrame;
	SelectableMeals mealChoice;
	
    /**
     * default constructor
     */
    public SelectionJFrameController () {}  
    
    
    /**
     * @param selectionJFrame
     */
    
  
    
    public SelectionJFrameController (SelectionJFrame selectionJFrame) {
    	
    	this.selectionJFrame= selectionJFrame;
    	
    	// action listeners for each button displayed
    	selectionJFrame.getBalenosButton().addActionListener(this);
    	selectionJFrame.getCalpheonButton().addActionListener(this);
    	selectionJFrame.getKamasylviaButton().addActionListener(this);
    	selectionJFrame.getMargoriaButton().addActionListener(this);
    	selectionJFrame.getMediahButton().addActionListener(this);
    	selectionJFrame.getSerendiaButton().addActionListener(this);
    	selectionJFrame.getArehazaButton().addActionListener(this);
    	selectionJFrame.getDrieghaneseButton().addActionListener(this);
    	selectionJFrame.getValenciaButton().addActionListener(this);   
    	
    	selectionJFrame.setVisible(true);
	}
   
    public void actionPerformed(ActionEvent event) 
    {

      System.out.println ("Inside SelectionJFrameController::actionPerformed");
      
      ArrayList<SelectableMeals> mealSelection;
      ArrayList<SelectableMeals> iMealList = null;
      Object[] options = {"Calculator",
              "Go Back",
              "Cancel"};
  
      BdoMealsController bdoMealsController = new BdoMealsController();	 
      if(bdoMealsController!=null) {
      iMealList = bdoMealsController.mealList("MealList");
      mealSelection = iMealList;
      
	// Displays Balenos Meal and its ingredients
	if(event.getSource().equals(selectionJFrame.getBalenosButton())) {
		
		
    	int calcChoice = JOptionPane.showOptionDialog(selectionJFrame, mealSelection.get(0), "Balenos Meal", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[2]);
    	if(calcChoice==JOptionPane.OK_OPTION) {
    		mealChoice = mealSelection.get(0);
    		getCalculator(mealChoice, 0); }
	}
	// Displays Calpheon Meal and its ingredients
      else if(event.getSource().equals(selectionJFrame.getCalpheonButton())){
	
    	int calcChoice = JOptionPane.showOptionDialog(selectionJFrame, mealSelection.get(1), "Calpheon Meal", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[2]);
    	if(calcChoice==JOptionPane.OK_OPTION) {
    		mealChoice = mealSelection.get(1);
    		getCalculator(mealChoice, 1); }
	}  
	// Displays Kamasylvia Meal and its ingredients
      else if(event.getSource().equals(selectionJFrame.getKamasylviaButton())){
		
    	int calcChoice = JOptionPane.showOptionDialog(selectionJFrame, mealSelection.get(2), "Kamasylvia Meal", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[2]);
    	if(calcChoice==JOptionPane.OK_OPTION) {
    		mealChoice = mealSelection.get(2);
    		getCalculator(mealChoice, 2); }
	}
	// Displays Margoria Seafoood Meal and its ingredients
      else if(event.getSource().equals(selectionJFrame.getMargoriaButton())){
		
    	int calcChoice = JOptionPane.showOptionDialog(selectionJFrame, mealSelection.get(3), "Margoria Seafood Meal", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[2]);
    	if(calcChoice==JOptionPane.OK_OPTION) {
    		mealChoice = mealSelection.get(3);
    		getCalculator(mealChoice, 3); }
	}
	// Displays Mediah Meal and its ingredients
      else if(event.getSource().equals(selectionJFrame.getMediahButton())){
		
    	int calcChoice = JOptionPane.showOptionDialog(selectionJFrame, mealSelection.get(4), "Mediah Meal", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[2]);
    	if(calcChoice==JOptionPane.OK_OPTION) {
    		mealChoice = mealSelection.get(4);
    		getCalculator(mealChoice, 4); }
	}
	// Displays Serendia Meal and its ingredients
      else if(event.getSource().equals(selectionJFrame.getSerendiaButton())){
		
    	int calcChoice = JOptionPane.showOptionDialog(selectionJFrame, mealSelection.get(5), "Serendia Meal", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[2]);
    	if(calcChoice==JOptionPane.OK_OPTION) {
    		mealChoice = mealSelection.get(5);
    		getCalculator(mealChoice, 5); }
	} 
	// Displays Special Arehaza Meal and its ingredients
      else if(event.getSource().equals(selectionJFrame.getArehazaButton())){
		
    	int calcChoice = JOptionPane.showOptionDialog(selectionJFrame, mealSelection.get(6), "Special Arehaza Meal", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[2]);
    	if(calcChoice==JOptionPane.OK_OPTION) {
    		mealChoice = mealSelection.get(6);
    		getCalculator(mealChoice, 6); }
	}	  
	// Displays Special Drieghanese Meal and its ingredients
      else if(event.getSource().equals(selectionJFrame.getDrieghaneseButton())){
    	
    	int calcChoice = JOptionPane.showOptionDialog(selectionJFrame, mealSelection.get(7), "Special Drieghanese Meal", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[2]);
    	if(calcChoice==JOptionPane.OK_OPTION) {
    		mealChoice = mealSelection.get(7);
    		getCalculator(mealChoice, 7); }
	}	  
	// Displays Valencia Meal and its ingredients
      else if(event.getSource().equals(selectionJFrame.getValenciaButton())) {
    	  
    	  int calcChoice = JOptionPane.showOptionDialog(selectionJFrame, mealSelection.get(8), "Valencia Meal", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[2]);
    	  if(calcChoice==JOptionPane.OK_OPTION) {
    		  mealChoice = mealSelection.get(8);
      		  getCalculator(mealChoice, 8); }
	}
    }
    }

	private void getCalculator(SelectableMeals mealChoice, int mealSelectionTwo) {
		
		@SuppressWarnings("unused")
		CalculatorJFrame calculatorJFrame = new CalculatorJFrame(mealChoice, mealSelectionTwo);
		
	}
}
      
      


