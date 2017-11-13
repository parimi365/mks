/**
 * 
 */
package com.mks.mvc.core.pcf;

/**
 * this is the interface to load and retrive the properties from pr
 * @author karthik.muthyam
 *
 */
public interface IpropertyProvider {
	boolean loadpropertyfile(String componentPropertyFilePath);

	String retriveProperty(String propertyKey);
}
