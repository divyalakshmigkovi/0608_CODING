package com.toyrobot.tests;

import java.util.ArrayList;

/**
 * Test scenario input2
 */
public class TestInput2 {
	public ArrayList<String> testInputs = new ArrayList<String>();

	public ArrayList<String> getInputs()
	{
		testInputs.add("PLACE 0,0,NORTH");
		testInputs.add("MOVE");
		testInputs.add("REPORT");
		return testInputs;
	}
}
