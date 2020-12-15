package com.bdomeals.model.business.manager;

import com.bdomeals.model.services.meallist.IMealList;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.*;
import com.bdomeals.model.business.exception.ServiceLoadException;
import com.bdomeals.model.domain.QuantityMeals;
import com.bdomeals.model.domain.SelectableMeals;
import com.bdomeals.model.services.exception.MealInputsException;
import com.bdomeals.model.services.exception.MealListException;
import com.bdomeals.model.services.factory.ServiceFactory;
import com.bdomeals.model.services.mealinputs.IMealInputs;

/**
 * @author jason.butler
 *
 */
public class BdoMealsManager extends ManagerSuperType{

	static private Logger log = LogManager.getLogger();
	private static BdoMealsManager _instance;

	
	private BdoMealsManager() {}

	/**
	 * @return BdoMealsManager instance
	 */
	public static synchronized BdoMealsManager getInstance() {
		if (_instance == null) {
			_instance = new BdoMealsManager();
		}
		return _instance;
	}
	
	/**
	 * @param commandString
	 * @param selectableMeals
	 * @param selection
	 */
	@Override
	public boolean performAction (String commandString) {
		
		boolean status = false;
        switch (commandString) {
            case "MealList":
                status = mealList(IMealList.NAME);
                break;
            case "MealInputs":
                status = mealInputs(IMealInputs.NAME);
                break;
        }
        return status;
		
	}
	
	/**
	 * @param commandString
	 * @return true if meal list is populated, false if it is null
	 * @throws MealListException 
	 */
	public boolean mealList(String commandString) {
		
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		IMealList iMealList;
		List<SelectableMeals> mealListLoaded;
		
		try {
			iMealList = (IMealList) serviceFactory
					.getService(commandString);
			mealListLoaded = iMealList.returnListOfMeals();
			if (mealListLoaded != null)
			{
				return true;
			}
			else
			{
				return false;
			}
		} catch (ServiceLoadException sle) {
			log.error("BdoMealsManager ServiceLoadException::mealList failed"); 
		} catch (MealListException mle) {
			log.error("BdoMealsManager MealListException::mealList failed"); 
		}
		return false;
		}
	
/**
 * @param commandString
 * @return true if inputs file is successfully loaded
 * @throws MealInputsException
 */
public boolean mealInputs(String commandString) {
		
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		IMealInputs iMealInputs;
		ArrayList<QuantityMeals> mealInputsLoaded;
		
		try {
			iMealInputs = (IMealInputs) serviceFactory
					.getService(commandString);
			mealInputsLoaded = iMealInputs.returnQuantityOfMeals();
			if (mealInputsLoaded != null)
			{
				return true;
			}
			else
			{
				return false;
			}
		} catch (ServiceLoadException sle) {
			log.error("BdoMealsManager ServiceLoadException::mealInputs failed");
			
		} 
		return false;
		}
}


