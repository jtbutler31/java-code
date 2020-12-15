package com.bdomeals.controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.logging.log4j.*;

import com.bdomeals.model.business.exception.PropertyFileNotFoundException;
import com.bdomeals.model.domain.QuantityMeals;
import com.bdomeals.model.domain.SelectableMeals;
import com.bdomeals.model.services.manager.PropertiesManager;




public class BdoMealsController implements IInterceptingController {
	
	static private Logger log = LogManager.getLogger();
	private ArrayList<SelectableMeals> mealListLoaded = null;
	private ArrayList<QuantityMeals> quantityMeals = null;
	private static Properties properties;
	
	
	public ArrayList<SelectableMeals> mealList(String commandString)
	{
		
		Socket socket = null;
	    ObjectOutputStream out = null;
	    ObjectInputStream is = null;
		
		
	       System.out.println ("About to make a socket connection to the server");
	       PropertiesManager properties = new PropertiesManager();
	       try {
			properties.loadProperties("application.properties");
		} catch (PropertyFileNotFoundException e1) {
			// TODO Auto-generated catch block
			log.error("Property file not found");
		}
	       int port = Integer.parseInt(properties.getPropertyValue("server.port"));
	       
	       try {
			socket = new Socket(InetAddress.getLocalHost(), port);
			out = new ObjectOutputStream(socket.getOutputStream());
			out.flush();
		   out.writeObject (commandString);
	       out.writeObject (mealListLoaded);
	       

	       
	       is = new ObjectInputStream(socket.getInputStream());
	       commandString = (String) is.readObject();
	       mealListLoaded = (ArrayList<SelectableMeals>) is.readObject(); 
	       }	
	       catch (Exception e)
	    			{
	     				log.error (e.getClass()+": "+e.getMessage(), e);
	    			}
	    			
	    			finally
	    			{
	    					
	    				try { 
	       
	   
	    					if (is != null) {
	    						is.close();
	    					}
	    					if (out != null) {
	    						out.close();
	    					}
	    					if (socket != null) {
	    						socket.close();
	    					}
	    				} catch (IOException e) {
							log.error (e.getClass()+": "+ e.getMessage(), e);
						}
				
	    				
	    			}
	       return mealListLoaded;
	}	
	public ArrayList<QuantityMeals> mealInputs(String commandString)
	{
		Socket socket = null;
		boolean status = false;
	    ObjectOutputStream out = null;
	    ObjectInputStream is = null;
	   
		
	    System.out.println ("About to make a socket connection to the server");
	    
	    try
	    {
	       
	        
	       socket = new Socket(InetAddress.getLocalHost(), 8189);

	       
	       out = new ObjectOutputStream(socket.getOutputStream());
	       out.flush();

	      
	       out.writeObject (commandString);
	       out.writeObject (quantityMeals);
	       

	      
	       is = new ObjectInputStream(socket.getInputStream());
	       commandString = (String)is.readObject();
	       quantityMeals = (ArrayList<QuantityMeals>) is.readObject(); 
	       
	     
	         
	   }	
	   catch (Exception e)
				{
	 				log.error (e.getClass()+": "+e.getMessage(), e);
				}
				
				finally
				{
						
					try {
									if (is != null) {
									is.close();
									}
									if (out != null) {
									out.close();
									}
									if (socket != null) {
									socket.close();
									}
							} catch (IOException e) {
								log.error (e.getClass()+": "+ e.getMessage(), e);
							}
				}
		return quantityMeals;
	}
}
