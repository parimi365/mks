/**
 * 
 */
package com.mk.mkedu.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author karthik.muthyam
 *
 */
@Component
@ConfigurationProperties
public class StudentFeeInfo {

	@Value("${lkg.1.term}")
	private String lkgFirstTerm;
}
 	