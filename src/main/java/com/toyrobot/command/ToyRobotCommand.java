package com.toyrobot.command;

public interface ToyRobotCommand {

	public void turnRight();
	public void turnLeft();
	public void moveRobot(int boardSize);
	public String placeRobot(String input);
	public String reportRobotPosition();
}
