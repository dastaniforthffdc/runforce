package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum SandboxLicenseType {


  
	/**
	 * Enumeration  : FULL
	 */
	FULL("FULL"),

  
	/**
	 * Enumeration  : PARTIAL
	 */
	PARTIAL("PARTIAL"),

  
	/**
	 * Enumeration  : DEVELOPER_PRO
	 */
	DEVELOPER_PRO("DEVELOPER_PRO"),

  
	/**
	 * Enumeration  : DEVELOPER
	 */
	DEVELOPER("DEVELOPER"),

  
	/**
	 * Enumeration  : ADVANCED_DEV
	 */
	ADVANCED_DEV("ADVANCED_DEV"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (SandboxLicenseType e : EnumSet.allOf(SandboxLicenseType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private SandboxLicenseType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
