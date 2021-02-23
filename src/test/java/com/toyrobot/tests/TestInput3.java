package com.toyrobot.tests;

import java.util.ArrayList;

public class TestInput3 {
	public ArrayList<String> testInputs = new ArrayList<String>();

	public ArrayList<String> getInputs()
	{
		testInputs.add("PLACE 0,0,NORTH");
		testInputs.add("LEFT");
		testInputs.add("REPORT");
		return testInputs;
	}

}
