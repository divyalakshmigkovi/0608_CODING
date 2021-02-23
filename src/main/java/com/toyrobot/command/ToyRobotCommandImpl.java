package com.toyrobot.command;

import com.toyrobot.constants.Constants;
import com.toyrobot.object.ToyRobot;

public class ToyRobotCommandImpl implements ToyRobotCommand{
	
private static ToyRobot bot;
	
	
	public String placeRobot(String input) {
		String position[] = input.split(Constants.SPACE);
		String corodinates[] = position[1].split(Constants.COMMA);
		bot = new ToyRobot();
		
		if(Integer.parseInt(corodinates[0])>=0 && Integer.parseInt(corodinates[1])>=0)
			{bot = new ToyRobot(Integer.parseInt(corodinates[0]), Integer.parseInt(corodinates[1]), corodinates[2]);
			return corodinates[2];
			}
		
		return "";
	}
	
	@Override
	public void turnRight() {
		int currentBotDirectionIndex = findDirectionIndex(bot.getCurrentDirection());
		currentBotDirectionIndex = currentBotDirectionIndex + 1;
		if(currentBotDirectionIndex > (Constants.DIRECTIONARRAY.length-1))
			currentBotDirectionIndex = currentBotDirectionIndex - (Constants.DIRECTIONARRAY.length);
		bot.setCurrentDirection(Constants.DIRECTIONARRAY[currentBotDirectionIndex]);
	}

	@Override
	public void turnLeft() {
		int currentBotDirectionIndex = findDirectionIndex(bot.getCurrentDirection());
		currentBotDirectionIndex = currentBotDirectionIndex - 1;
		if(currentBotDirectionIndex < 0)
			currentBotDirectionIndex = currentBotDirectionIndex + Constants.DIRECTIONARRAY.length;
		
		bot.setCurrentDirection(Constants.DIRECTIONARRAY[currentBotDirectionIndex]);
	}

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

	public String reportRobotPosition() {
		
		String reportPosition =  "";
	//	System.out.println("reportRobotPosition called:"+reportPosition);
		try{
			reportPosition = bot.getCurrentX() +Constants.COMMA+ bot.getCurrentY() +Constants.COMMA+ bot.getCurrentDirection();
		}
		catch(NullPointerException e){
			reportPosition = Constants.ROBOT_NOT_PLACED;
		}
		
		return reportPosition;
	}

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
