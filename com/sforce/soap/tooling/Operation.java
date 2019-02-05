package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum Operation {


  
	/**
	 * Enumeration  : RetrieveTokens
	 */
	RetrieveTokens("RetrieveTokens"),

  
	/**
	 * Enumeration  : ErrorOnNewerVersion
	 */
	ErrorOnNewerVersion("ErrorOnNewerVersion"),

  
	/**
	 * Enumeration  : SkipOnSameVersion
	 */
	SkipOnSameVersion("SkipOnSameVersion"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (Operation e : EnumSet.allOf(Operation.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private Operation(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
