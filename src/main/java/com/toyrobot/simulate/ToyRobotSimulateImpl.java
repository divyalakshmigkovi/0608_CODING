package com.toyrobot.simulate;

import java.util.ArrayList;
import java.util.regex.Pattern;

import com.toyrobot.command.ToyRobotCommand;
import com.toyrobot.command.ToyRobotCommandImpl;
import com.toyrobot.constants.Constants;
import com.toyrobot.inputoutput.ToyRobotInputOutput;
import com.toyrobot.inputoutput.ToyRobotInputOutputImpl;

/**
 *This class analyzes the input commands and redirects them to appropriate methods.
 */
public class ToyRobotSimulateImpl implements ToyRobotSimulate{
	
	/**
	 * This method analyzes the commands in the input file
	 * @param input Parsed contents of the input file
	 * @param boardSize Board Size 
	 * @return Resulting position of the robot
	 */
	public String startRobot(ArrayList<String> input, int boardSize)
	{
		boolean robotPlaced = false;
		String reportPosition = "";
		ToyRobotInputOutput inout = new ToyRobotInputOutputImpl();
		ToyRobotCommand command = new ToyRobotCommandImpl();
		String currentRobotDirection = "";
		
		for (int i=0; i<input.size(); i++) {
			if(positionPatterMatch(input.get(i)) == true){
				currentRobotDirection = command.placeRobot(input.get(i),boardSize);
				robotPlaced = currentRobotDirection.equalsIgnoreCase("") ? false : true;
			}
			if(robotPlaced == true && input.get(i).equalsIgnoreCase(Constants.MOVE))
				command.moveRobot(boardSize);
			if(robotPlaced == true && input.get(i).equalsIgnoreCase(Constants.LEFT))
				command.turnLeft();
			if(robotPlaced == true && input.get(i).equalsIgnoreCase(Constants.RIGHT))
				command.turnRight();
			if(robotPlaced == true && input.get(i).equalsIgnoreCase(Constants.REPORT)){
				reportPosition = command.reportRobotPosition();
				inout.writeOutput(reportPosition);
				}
		}
		
		return reportPosition;
	}
	
	/**
	 * This method checks if any command is a PLACE command in the correct format, for example, PLACE 0,0,NORTH
	 * @param input Input Command
	 * @return
	 */
	private boolean positionPatterMatch(String input)
	{
		boolean positionPatternCheck = Pattern.matches("PLACE\\s[+]?[0-9]+,[+]?[0-9]+,(?:NORTH|SOUTH|EAST|WEST)",input);
		return positionPatternCheck;
	}
}
