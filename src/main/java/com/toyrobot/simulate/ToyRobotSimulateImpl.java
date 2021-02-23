package com.toyrobot.simulate;

import java.util.ArrayList;
import java.util.regex.Pattern;

import com.toyrobot.command.ToyRobotCommand;
import com.toyrobot.command.ToyRobotCommandImpl;
import com.toyrobot.constants.Constants;
import com.toyrobot.inputoutput.ToyRobotInputOutput;
import com.toyrobot.inputoutput.ToyRobotInputOutputImpl;

public class ToyRobotSimulateImpl implements ToyRobotSimulate{
	
	public String startRobot(ArrayList<String> input, int boardSize)
	{
		boolean robotPlaced = false;
		String reportPosition = Constants.ROBOT_NOT_PLACED;
		ToyRobotInputOutput inout = new ToyRobotInputOutputImpl();
		ToyRobotCommand command = new ToyRobotCommandImpl();
		String currentRobotDirection = "";
		
		for (int i=0; i<input.size(); i++) {
			if(positionPatterMatch(input.get(i)) == true){
				currentRobotDirection = command.placeRobot(input.get(i));
				robotPlaced = currentRobotDirection.equalsIgnoreCase("") ? false : true;
				reportPosition = "";
			}
			if(robotPlaced == true && input.get(i).equalsIgnoreCase(Constants.MOVE))
				command.moveRobot(boardSize);
			if(robotPlaced == true && input.get(i).equalsIgnoreCase(Constants.LEFT))
				command.turnLeft();
			if(robotPlaced == true && input.get(i).equalsIgnoreCase(Constants.RIGHT))
				command.turnRight();
			if(input.get(i).equalsIgnoreCase(Constants.REPORT)){
				reportPosition = command.reportRobotPosition();
				inout.writeOutput(reportPosition);
				}
		}
		
		return reportPosition;
	}
	
	private boolean positionPatterMatch(String input)
	{
		boolean positionPatternCheck = Pattern.matches("PLACE\\s[+]?[0-9]+,[+]?[0-9]+,(?:NORTH|SOUTH|EAST|WEST)",input);
		return positionPatternCheck;
	}
}
