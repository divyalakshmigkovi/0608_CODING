package com.toyrobot.object;

public class ToyRobot {
	private int currentX;
	private int currentY;
	private String currentDirection;
	
	public ToyRobot() {
	}
	
	public ToyRobot(int currentX, int currentY, String currentDirection) {
		super();
		this.currentX = currentX;
		this.currentY = currentY;
		this.currentDirection = currentDirection;
	}
	
	public int getCurrentX() {
		return currentX;
	}
	public void setCurrentX(int currentX) {
		this.currentX = currentX;
	}
	public int getCurrentY() {
		return currentY;
	}
	public void setCurrentY(int currentY) {
		this.currentY = currentY;
	}
	public String getCurrentDirection() {
		return currentDirection;
	}
	public void setCurrentDirection(String currentDirection) {
		this.currentDirection = currentDirection;
	}
	@Override
	public String toString() {
		return "ToyRobot [currentX=" + currentX + ", currentY=" + currentY
				+ ", currentDirection=" + currentDirection + "]";
	}
	
}
