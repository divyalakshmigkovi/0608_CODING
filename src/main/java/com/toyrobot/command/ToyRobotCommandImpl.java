package com.toyrobot.command;

import com.toyrobot.constants.Constants;
import com.toyrobot.object.ToyRobot;

/**
 * This class simulates the robot based on the input commands
 * @author Divya
 */
public class ToyRobotCommandImpl implements ToyRobotCommand{
	
	/**
	 * Stores the current position of the robot after each command
	 */
    private static ToyRobot bot;
	
	/**
	 * This method is called for a valid PLACE command. It checks if the coordinates are >=0 and <=(board size-1)
	 * @param input Place command
	 * @return Current direction of the robot
	 */
	public String placeRobot(String input, int boardSize) {
		String position[] = input.split(" ");
		String corodinates[] = position[1].split(",");
		bot = new ToyRobot();
		
		if(Integer.parseInt(corodinates[0])>=0 && Integer.parseInt(corodinates[1])>=0 && Integer.parseInt(corodinates[0])<=boardSize-1 && Integer.parseInt(corodinates[1])<=boardSize-1){
			bot = new ToyRobot(Integer.parseInt(corodinates[0]), Integer.parseInt(corodinates[1]), corodinates[2]);
			return corodinates[2];
			}
		
		return "";
	}
	
	/**
	 * This method is called for RIGHT command
	 */
	@Override
	public void turnRight() {
		int currentBotDirectionIndex = findDirectionIndex(bot.getCurrentDirection());
		currentBotDirectionIndex = currentBotDirectionIndex + 1;
		if(currentBotDirectionIndex > (Constants.DIRECTIONARRAY.length-1))
			currentBotDirectionIndex = currentBotDirectionIndex - (Constants.DIRECTIONARRAY.length);
		bot.setCurrentDirection(Constants.DIRECTIONARRAY[currentBotDirectionIndex]);
	}

	/**
	 * This method is called for LEFT command
	 */
	@Override
	public void turnLeft() {
		int currentBotDirectionIndex = findDirectionIndex(bot.getCurrentDirection());
		currentBotDirectionIndex = currentBotDirectionIndex - 1;
		if(currentBotDirectionIndex < 0)
			currentBotDirectionIndex = currentBotDirectionIndex + Constants.DIRECTIONARRAY.length;
		
		bot.setCurrentDirection(Constants.DIRECTIONARRAY[currentBotDirectionIndex]);
	}

	/**
	 * This method is called for MOVE command
	 */
	@Override
	public void moveRobot(int boardSize) {
		if(bot.getCurrentDirection().equalsIgnoreCase(Constants.NORTH)){
			bot.setCurrentY(bot.getCurrentY() + 1);
			if(bot.getCurrentY() > (boardSize-1))
				bot.setCurrentY(bot.getCurrentY() - 1);
		}
		if(bot.getCurrentDirection().equalsIgnoreCase(Constants.SOUTH)){
			bot.setCurrentY(bot.getCurrentY() - 1);
			if(bot.getCurrentY() < 0)
				bot.setCurrentY(bot.getCurrentY() + 1);
		}
		if(bot.getCurrentDirection().equalsIgnoreCase(Constants.EAST)){
			bot.setCurrentX(bot.getCurrentX() + 1);
			if(bot.getCurrentX() > (boardSize-1))
				bot.setCurrentX(bot.getCurrentX() - 1);
		}
		if(bot.getCurrentDirection().equalsIgnoreCase(Constants.WEST)){
			bot.setCurrentX(bot.getCurrentX() - 1);
			if(bot.getCurrentX() < 0)
				bot.setCurrentX(bot.getCurrentX() + 1);
		}
	}

	/**
	 * This method is called for REPORT command
	 * @return Current robot position
	 */
	public String reportRobotPosition() {
		
		String reportPosition =  "";
	//	System.out.println("reportRobotPosition called:"+reportPosition);
		try{
			reportPosition = bot.getCurrentX() +","+ bot.getCurrentY() +","+ bot.getCurrentDirection();
		}
		catch(NullPointerException e){
			reportPosition = "";
		}
		
		return reportPosition;
	}

	
	/**
	 * Finds the index of the current direction from DIRECTIONARRAY
	 * @param currentRobotDirection Current direction of the robot
	 * @return Index of the current direction in DIRECTIONARRAY
	 */
	private int findDirectionIndex(String currentRobotDirection)
	{
		int directionIndex = 0;
		for(int i=0;i<Constants.DIRECTIONARRAY.length;i++){
			if(Constants.DIRECTIONARRAY[i].equalsIgnoreCase(currentRobotDirection))
				directionIndex = i;
			}
		
		return directionIndex;
	}

}
