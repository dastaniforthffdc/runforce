package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum TraceFlagType {


  
	/**
	 * Enumeration  : USER_DEBUG
	 */
	USER_DEBUG("USER_DEBUG"),

  
	/**
	 * Enumeration  : DEVELOPER_LOG
	 */
	DEVELOPER_LOG("DEVELOPER_LOG"),

  
	/**
	 * Enumeration  : CLASS_TRACING
	 */
	CLASS_TRACING("CLASS_TRACING"),

  
	/**
	 * Enumeration  : PROFILING
	 */
	PROFILING("PROFILING"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (TraceFlagType e : EnumSet.allOf(TraceFlagType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private TraceFlagType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
