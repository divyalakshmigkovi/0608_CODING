package com.toyrobot.tests;

import java.util.ArrayList;

/**
 * Test scenario input6
 */
public class TestInput6 {
	
	
	public ArrayList<String> testInputs = new ArrayList<String>();

	public ArrayList<String> getInputs()
	{
		testInputs.add("PLACE -1,-5,EAST");
		testInputs.add("RIGHT");
		testInputs.add("PLACE -1,5,NORTH");
		testInputs.add("MOVE");
		testInputs.add("PLACE 1,5,NORTH");
		testInputs.add("MOVE");
		testInputs.add("REPORT");
		return testInputs;
	}
}
