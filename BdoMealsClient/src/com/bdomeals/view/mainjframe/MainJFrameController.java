package com.bdomeals.view.mainjframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.bdomeals.view.selectionjframe.SelectionJFrame;

/**
 * Controller for the Main Gui
 * @author jason.butler
 *
 */
public class MainJFrameController implements ActionListener {

	private MainJFrame mainJFrame;

	/**
	 * default constructor
	 */
	public MainJFrameController() {
	}
	
	/**
	 * used to check if you want to load use case
	 * @param mainJFrame
	 */
	public MainJFrameController (MainJFrame mainJFrame) 
	{
		this.mainJFrame = mainJFrame;
		
		mainJFrame.getLoadMenuItem().addActionListener(this);
		
		mainJFrame.setVisible(true);

	}
	  public void actionPerformed(ActionEvent event) 
	  {

	    System.out.println ("Inside MainJFrameController::actionPerformed");
	    
	    if (event.getSource().equals(mainJFrame.getLoadMenuItem()))
	        menuReadSelection_actionPerformed(event);
	    
}

	private void menuReadSelection_actionPerformed(ActionEvent event) {
	
		 @SuppressWarnings("unused")
		SelectionJFrame selectionJFrame = new SelectionJFrame();
		
	}
}
