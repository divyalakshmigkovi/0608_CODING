package com.toyrobot.command;

public interface ToyRobotCommand {

	public void turnRight();
	public void turnLeft();
	public void moveRobot(int boardSize);
	public String placeRobot(String input,int boardSize);
	public String reportRobotPosition();
}
