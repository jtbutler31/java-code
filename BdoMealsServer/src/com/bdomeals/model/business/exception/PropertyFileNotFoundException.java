package com.bdomeals.model.business.exception;

/**
 * @author jason.butler
 *
 */
public class PropertyFileNotFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * exception thrown in the event the property file is not found
	 * @param inMessage
	 * @param inNestedException
	 */
	public PropertyFileNotFoundException(final String inMessage, final Throwable inNestedException)
    {
        super(inMessage, inNestedException);
    }
	

}
