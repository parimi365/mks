/**
 * 
 */
package com.mks.mvc.core.pcf;

/**
 * @author karthik.muthyam
 *
 */
public interface IpropertyProvider {
	boolean loadpropertyfile(String componentPropertyFilePath);

	String retriveProperty(String propertyKey);
}
