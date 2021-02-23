package com.toyrobot.inputoutput;

import java.util.ArrayList;

public interface ToyRobotInputOutput {
	public ArrayList<String> readInput(String fileName);
	public void writeOutput(String finalPosition);
}
