package com.bdomeals.view.calculatorjframe;

import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import java.awt.Toolkit;
import javax.swing.BoxLayout;
import com.bdomeals.model.domain.MealsCosts;
import com.bdomeals.model.domain.SelectableMeals;

/**
 * UI to display text boxes associated with costs of given meal components
 * @author jason.butler
 *
 */
public class CalculatorJFrame extends javax.swing.JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private CalculatorJFrameController calculatorJFrameController;
	@SuppressWarnings("unused")
	private SelectableMeals mealChoice;
	@SuppressWarnings("unused")
	private MyDocumentFilter documentFilter;
	private static int mealSelectionTwo;
	
	/**
	 * @param mealChoice
	 * @param mealSelectionTwo
	 */
	@SuppressWarnings("static-access")
	public CalculatorJFrame (SelectableMeals mealChoice, int mealSelectionTwo) {
		
		this.mealChoice = mealChoice;
		this.mealSelectionTwo = mealSelectionTwo;
		initComponents(mealChoice);
		calculatorJFrameController = new CalculatorJFrameController(this);
		
		this.setSize(450,400);                
        this.setVisible(true); 
		}
	

	private void initComponents(SelectableMeals mealChoice) {
		
		jPanel1 = new javax.swing.JPanel();
		calcButton = new javax.swing.JButton();
		cancelButton = new javax.swing.JButton();
		labelMealName = new javax.swing.JLabel();
		labelIngredient1Name = new javax.swing.JLabel();
		labelIngredient2Name = new javax.swing.JLabel();
		labelIngredient3Name = new javax.swing.JLabel();
		labelIngredient4Name = new javax.swing.JLabel();
		labelIngredient5Name = new javax.swing.JLabel();
		textFieldMealName = new javax.swing.JTextField();
		textFieldIngredient1Name = new javax.swing.JTextField();
		textFieldIngredient2Name = new javax.swing.JTextField();
		textFieldIngredient3Name = new javax.swing.JTextField();
		textFieldIngredient4Name = new javax.swing.JTextField();
		textFieldIngredient5Name = new javax.swing.JTextField();
		
		//adding document filter to filter out non digits
		((AbstractDocument)textFieldMealName .getDocument()).setDocumentFilter(new MyDocumentFilter());     
		((AbstractDocument)textFieldIngredient1Name.getDocument()).setDocumentFilter(new MyDocumentFilter());     
		((AbstractDocument)textFieldIngredient2Name.getDocument()).setDocumentFilter(new MyDocumentFilter());     
		((AbstractDocument)textFieldIngredient3Name.getDocument()).setDocumentFilter(new MyDocumentFilter());     
		((AbstractDocument)textFieldIngredient4Name.getDocument()).setDocumentFilter(new MyDocumentFilter());     
		((AbstractDocument)textFieldIngredient5Name.getDocument()).setDocumentFilter(new MyDocumentFilter());     
		
		jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.Y_AXIS));
		setTitle("Costs");
		
		labelMealName.setText(mealChoice.getMealName());
		jPanel1.add(labelMealName);
		
		textFieldMealName.setText("");
		jPanel1.add(textFieldMealName);
		
		labelIngredient1Name.setText(mealChoice.getIngredient1Name());
		jPanel1.add(labelIngredient1Name);
		
		textFieldIngredient1Name.setText("");
		jPanel1.add(textFieldIngredient1Name);
		
		labelIngredient2Name.setText(mealChoice.getIngredient2Name());
		jPanel1.add(labelIngredient2Name);
		
		textFieldIngredient2Name.setText("");
		jPanel1.add(textFieldIngredient2Name);
		
		labelIngredient3Name.setText(mealChoice.getIngredient3Name()); 
		jPanel1.add(labelIngredient3Name);
		
		textFieldIngredient3Name.setText("");
		jPanel1.add(textFieldIngredient3Name);
		
		labelIngredient4Name.setText(mealChoice.getIngredient4Name()); 
		jPanel1.add(labelIngredient4Name);
		
		textFieldIngredient4Name.setText("");
		jPanel1.add(textFieldIngredient4Name);
		
		labelIngredient5Name.setText(mealChoice.getIngredient5Name()); 
		jPanel1.add(labelIngredient5Name);
		
		textFieldIngredient5Name.setText("");
		jPanel1.add(textFieldIngredient5Name);
		
		calcButton.setText("Calculate Profit");
		jPanel1.add(calcButton);
		
		cancelButton.setText("Cancel");
		jPanel1.add(cancelButton);
		
		
	   
		
		getContentPane().add(jPanel1);
	}
	
	 /**
	 * @return long values of text field data
	 */
	public MealsCosts getSelectedData()
	 {
		 long longMeal = Long.parseLong(textFieldMealName.getText());
		 long longIngredient1Name = Long.parseLong(textFieldIngredient1Name.getText());
		 long longIngredient2Name = Long.parseLong(textFieldIngredient2Name.getText());
		 long longIngredient3Name = Long.parseLong(textFieldIngredient3Name.getText());
		 long longIngredient4Name = Long.parseLong(textFieldIngredient4Name.getText());
		 long longIngredient5Name = Long.parseLong(textFieldIngredient5Name.getText());
		 
		 MealsCosts mealsCosts = new MealsCosts (longMeal, longIngredient1Name, longIngredient2Name,
				 								longIngredient3Name, longIngredient4Name, longIngredient5Name);
	        return mealsCosts;
	}
	private javax.swing.JPanel jPanel1;
	private javax.swing.JButton calcButton;
	private javax.swing.JButton cancelButton;
	private javax.swing.JLabel labelMealName;
	private javax.swing.JLabel labelIngredient1Name;
	private javax.swing.JLabel labelIngredient2Name;
	private javax.swing.JLabel labelIngredient3Name;
	private javax.swing.JLabel labelIngredient4Name;
	private javax.swing.JLabel labelIngredient5Name;
	private javax.swing.JTextField textFieldMealName;
	private javax.swing.JTextField textFieldIngredient1Name;
	private javax.swing.JTextField textFieldIngredient2Name;
	private javax.swing.JTextField textFieldIngredient3Name;
	private javax.swing.JTextField textFieldIngredient4Name;
	private javax.swing.JTextField textFieldIngredient5Name;
	
	
	/**
	 * @return calcButton
	 */
	public javax.swing.JButton getCalcButton() {
		return calcButton;
	}
	
	/**
	 * @return cancelButton
	 */
	public javax.swing.JButton getCancelButton() {
		return cancelButton;
	}
	
	/**
	 * @return the array element of the selection
	 */
	public static int getMealSelectionTwo() {
		return mealSelectionTwo;
	}

	/**
	 * @param mealSelectionTwo
	 */
	public void setMealSelectionTwo(int mealSelectionTwo) {
		CalculatorJFrame.mealSelectionTwo = mealSelectionTwo;
	}

class MyDocumentFilter extends DocumentFilter
{   
    @Override
    public void insertString(DocumentFilter.FilterBypass fp
            , int offset, String string, AttributeSet aset)
                                throws BadLocationException
    {
        int len = string.length();
        boolean isValidInteger = true;

        for (int i = 0; i < len; i++)
        {
            if (!Character.isDigit(string.charAt(i)))
            {
                isValidInteger = false;
                break;
            }
        }
        if (isValidInteger)
            super.insertString(fp, offset, string, aset);
        else
            Toolkit.getDefaultToolkit().beep();
    }

    @Override
    public void replace(DocumentFilter.FilterBypass fp, int offset
                    , int length, String string, AttributeSet aset)
                                        throws BadLocationException
    {
        int len = string.length();
        boolean isValidInteger = true;

        for (int i = 0; i < len; i++)
        {
            if (!Character.isDigit(string.charAt(i)))
            {
                isValidInteger = false;
                break;
            }
        }
        if (isValidInteger)
            super.replace(fp, offset, length, string, aset);
        else
            Toolkit.getDefaultToolkit().beep();
    }
}
}