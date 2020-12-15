package com.bdomeals.view.mainjframe;



/**
 * Landing screen for app
 * @author jason.butler
 *
 */
public class MainJFrame extends javax.swing.JFrame {
	    
	  
		private static final long serialVersionUID = 3320197207777135961L;
		
	    /**
	     * used to setup landing screen
	     */
	    public MainJFrame() {
	        initComponents();
	        
	        this.setSize(350,300);                
	        this.setVisible(true); 
	    }
	    
	   
	 @SuppressWarnings("deprecation")
	private void initComponents() {

	  jMenuBar = new javax.swing.JMenuBar();
	  setJMenuBar(jMenuBar);
	  jFileMenu = new javax.swing.JMenu();
	  jLoadMenu = new javax.swing.JMenu();
	  jLoadMenuItem = new javax.swing.JMenuItem();
	  jPanel1 = new javax.swing.JPanel();
	  
	  jMenuBar.setNextFocusableComponent(jFileMenu);
	  jMenuBar.setOpaque(false);
	  
	  jFileMenu.setText("File");
	  jLoadMenu.setText("Load Selection Menu");
	  
	  jLoadMenuItem.setText("Load Selection...");
	  jLoadMenuItem.setActionCommand("Load Selection...");
	  jLoadMenu.add(jLoadMenuItem);
	  
	  jFileMenu.add(jLoadMenu);

	  jMenuBar.add(jFileMenu);

	  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	  setTitle("BdoMeals");
	  getContentPane().setLayout(null);
	  
	  getContentPane().add(jPanel1);
	  
	  pack();
	 }
	 /**
	 * @return Load menu item
	 */
	public javax.swing.JMenuItem getLoadMenuItem()
	    {
	        return jLoadMenuItem;
	    }    

	
	 /**
	 * @param args
	 */
	public static void main(String args[]) {
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                @SuppressWarnings("unused")
					MainJFrame mainJFrame = new MainJFrame();
	           
	            }
	        });
	 }
	 
	 private javax.swing.JMenu jLoadMenu;
	 private javax.swing.JMenuItem jLoadMenuItem;
	 private javax.swing.JMenu jFileMenu;
	 private javax.swing.JMenuBar jMenuBar;
	 private javax.swing.JPanel jPanel1;
}

