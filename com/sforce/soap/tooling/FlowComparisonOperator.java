package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum FlowComparisonOperator {


  
	/**
	 * Enumeration  : EqualTo
	 */
	EqualTo("EqualTo"),

  
	/**
	 * Enumeration  : NotEqualTo
	 */
	NotEqualTo("NotEqualTo"),

  
	/**
	 * Enumeration  : GreaterThan
	 */
	GreaterThan("GreaterThan"),

  
	/**
	 * Enumeration  : LessThan
	 */
	LessThan("LessThan"),

  
	/**
	 * Enumeration  : GreaterThanOrEqualTo
	 */
	GreaterThanOrEqualTo("GreaterThanOrEqualTo"),

  
	/**
	 * Enumeration  : LessThanOrEqualTo
	 */
	LessThanOrEqualTo("LessThanOrEqualTo"),

  
	/**
	 * Enumeration  : StartsWith
	 */
	StartsWith("StartsWith"),

  
	/**
	 * Enumeration  : EndsWith
	 */
	EndsWith("EndsWith"),

  
	/**
	 * Enumeration  : Contains
	 */
	Contains("Contains"),

  
	/**
	 * Enumeration  : IsNull
	 */
	IsNull("IsNull"),

  
	/**
	 * Enumeration  : WasSet
	 */
	WasSet("WasSet"),

  
	/**
	 * Enumeration  : WasSelected
	 */
	WasSelected("WasSelected"),

  
	/**
	 * Enumeration  : WasVisited
	 */
	WasVisited("WasVisited"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (FlowComparisonOperator e : EnumSet.allOf(FlowComparisonOperator.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private FlowComparisonOperator(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
