package com.toyrobot.tests;

import java.util.ArrayList;

/**
 * Test scenario input1
 */
public class TestInput1 {
	
	
	public ArrayList<String> testInputs = new ArrayList<String>();

	public ArrayList<String> getInputs()
	{
		testInputs.add("PLACE 0,0,EAST");
		testInputs.add("RIGHT");
		testInputs.add("REPORT");
		testInputs.add("LEFT");
		testInputs.add("REPORT");
		return testInputs;
	}
	  
}
