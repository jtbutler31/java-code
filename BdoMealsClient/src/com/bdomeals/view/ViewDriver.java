package com.bdomeals.view;

import javax.swing.UIManager;

import com.bdomeals.view.mainjframe.MainJFrame;
import com.bdomeals.view.mainjframe.MainJFrameController;

/**
 * @author jason.butler
 *
 */
public class ViewDriver {
	
	/**
	 * used to setup UI
	 */
	public ViewDriver() 
    {
       try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
       }
       catch (Exception e) {
         e.printStackTrace();
       }
        MainJFrame mainJFrame = new MainJFrame();
       
        //
        @SuppressWarnings("unused")
		MainJFrameController mainJFrameController = 
                new MainJFrameController(mainJFrame);
        
    }
    
 
 /**
 * @param args
 */
public static void main(String[] args) {
   new ViewDriver();
 }
    

}
