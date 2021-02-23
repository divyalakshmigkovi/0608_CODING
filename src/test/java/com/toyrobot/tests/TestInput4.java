package com.toyrobot.tests;

import java.util.ArrayList;

public class TestInput4 {
	public ArrayList<String> testInputs = new ArrayList<String>();

	public ArrayList<String> getInputs()
	{
		testInputs.add("PLACE 1,2,EAST");
		testInputs.add("MOVE");
		testInputs.add("MOVE");
		testInputs.add("LEFT");
		testInputs.add("MOVE");
		testInputs.add("REPORT");
		return testInputs;
	}
}
