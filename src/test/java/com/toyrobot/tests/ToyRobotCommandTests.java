package com.toyrobot.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.toyrobot.command.ToyRobotCommand;
import com.toyrobot.command.ToyRobotCommandImpl;

public class ToyRobotCommandTests {
	
ToyRobotCommand command = new ToyRobotCommandImpl();
	
	@Test
	public void placeRobotTest(){
		
		assertEquals("NORTH",command.placeRobot("PLACE 0,0,NORTH"));
		assertEquals("SOUTH",command.placeRobot("PLACE 0,1,SOUTH"));
		assertEquals("EAST",command.placeRobot("PLACE 1,0,EAST"));
		assertEquals("WEST",command.placeRobot("PLACE 1,1,WEST"));
	}
}
