package com.bdomeals.view.selectionjframe;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * @author jason.butler
 *
 */
public class SelectionJFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Label for Balenos Meal
	 */
	public String balenosString = "Balenos Meal";
    /**
     * Label for Calpheon Meal
     */
    public String calpheonString = "Calpheon Meal";
    /**
     * Label for Kamasylvia Meal
     */
    public String kamasylviaString = "Kamasylvia Meal";
    /**
     * Label for Margoria Seafood Meal
     */
    public String margoriaString = "Margoria Seafood Meal";
    /**
     * Label for Mediah Meal
     */
    public String mediahString = "Mediah Meal";
    /**
     * Label for Serendia Meal
     */
    public String serendiaString = "Serendia Meal";
    /**
     * Label for Special Arehaza Meal
     */
    public String arehazaString = "Special Arehaza Meal";
    /**
     * Label for Special Drieghanese Meal
     */
    public String drieghaneseString = "Special Drieghanese Meal";
    /**
     * Label for Valencia Meal
     */
    public String valenciaString = "Valencia Meal";
    
    @SuppressWarnings("unused")
	private SelectionJFrameController selectionJFrameController;

	/**
	 * Used to run initialization of frame
	 */
    public SelectionJFrame() {
        
		initComponents();
		
		selectionJFrameController = new SelectionJFrameController(this);
        
        this.setSize(550,150);                
        this.setVisible(true); 
    }
    
	private void initComponents() {
		
		jPanel1 = new JPanel();
		balenosButton=new javax.swing.JButton();;
        calpheonButton=new javax.swing.JButton();;
        kamasylviaButton=new javax.swing.JButton();;
        margoriaButton=new javax.swing.JButton();;
        mediahButton=new javax.swing.JButton();;
        serendiaButton=new javax.swing.JButton();;
        arehazaButton=new javax.swing.JButton();;
        drieghaneseButton=new javax.swing.JButton();;
        valenciaButton=new javax.swing.JButton();;
		
		setTitle("Bdo Meals Selector and Calculator");
		  
		jPanel1.setLayout(new FlowLayout());
		
		balenosButton = new JButton(balenosString);
	    getBalenosButton().setActionCommand(balenosString);
	    jPanel1.add(getBalenosButton());
	 
	    calpheonButton = new JButton(calpheonString);
	    getCalpheonButton().setActionCommand(calpheonString);
	    jPanel1.add(getCalpheonButton());
	 
	    kamasylviaButton = new JButton (kamasylviaString);
	    getKamasylviaButton().setActionCommand(kamasylviaString);
	    jPanel1.add(getKamasylviaButton());
	 
	    margoriaButton = new JButton(margoriaString);
	    getMargoriaButton().setActionCommand(margoriaString);
	    jPanel1.add(getMargoriaButton());
	 
	    mediahButton = new JButton(mediahString);
	    getMediahButton().setActionCommand(mediahString);
	    jPanel1.add(getMediahButton());
	 
	    serendiaButton = new JButton(serendiaString);
	    getSerendiaButton().setActionCommand(serendiaString);
	    jPanel1.add(getSerendiaButton());
	        
	    arehazaButton = new JButton(arehazaString);
	    getArehazaButton().setActionCommand(arehazaString);
	    jPanel1.add(getArehazaButton());
	 
	    drieghaneseButton = new JButton(drieghaneseString);
	    getDrieghaneseButton().setActionCommand(drieghaneseString);
	    jPanel1.add(getDrieghaneseButton());
	    
	    valenciaButton = new JButton(valenciaString);
	    getValenciaButton().setActionCommand(valenciaString);
	    jPanel1.add(getValenciaButton());    
	    
	    getContentPane().add(jPanel1);
	    pack();
}
	
	
	
	


	/**
	 * @return balenosButton
	 */
	public javax.swing.JButton getBalenosButton() {
		return balenosButton;
	}






	/**
	 * @return calpheonButton
	 */
	public javax.swing.JButton getCalpheonButton() {
		return calpheonButton;
	}






	/**
	 * @return kamasylviaButton
	 */
	public javax.swing.JButton getKamasylviaButton() {
		return kamasylviaButton;
	}






	/**
	 * @return margoriaButton
	 */
	public javax.swing.JButton getMargoriaButton() {
		return margoriaButton;
	}






	/**
	 * @return mediahButton
	 */
	public javax.swing.JButton getMediahButton() {
		return mediahButton;
	}






	/**
	 * @return serendiaButton
	 */
	public javax.swing.JButton getSerendiaButton() {
		return serendiaButton;
	}






	/**
	 * @return arehazaButton
	 */
	public javax.swing.JButton getArehazaButton() {
		return arehazaButton;
	}






	/**
	 * @return drieghaneseButton
	 */
	public javax.swing.JButton getDrieghaneseButton() {
		return drieghaneseButton;
	}






	/**
	 * @return valenciaButton
	 */
	public javax.swing.JButton getValenciaButton() {
		return valenciaButton;
	}

	/**
	 * @param args
	 */
	public static void main(String args[]) {
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                @SuppressWarnings("unused")
					SelectionJFrame selectableMealsJFrame = new SelectionJFrame();
	            }
	        });
	    }




	private javax.swing.JPanel jPanel1;
	private javax.swing.JButton balenosButton;
	private javax.swing.JButton calpheonButton;
	private javax.swing.JButton kamasylviaButton;
	private javax.swing.JButton margoriaButton;
	private javax.swing.JButton mediahButton;
	private javax.swing.JButton serendiaButton;
	private javax.swing.JButton arehazaButton;
	private javax.swing.JButton drieghaneseButton;
	private javax.swing.JButton valenciaButton;
	
}
