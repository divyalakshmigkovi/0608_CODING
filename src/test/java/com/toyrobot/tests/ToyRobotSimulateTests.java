package com.toyrobot.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.toyrobot.simulate.ToyRobotSimulateImpl;

public class ToyRobotSimulateTests {
	
	ToyRobotSimulateImpl testSimulate = new ToyRobotSimulateImpl();
	  
	  @Test
	  public void startRobotTest()
	  {
		  assertEquals("0,0,EAST",testSimulate.startRobot(new TestInput1().getInputs(), 15));
		  assertEquals("0,1,NORTH",testSimulate.startRobot(new TestInput2().getInputs(), 5));
		  assertEquals("0,0,WEST",testSimulate.startRobot(new TestInput3().getInputs(), 5));
		  assertEquals("3,3,NORTH",testSimulate.startRobot(new TestInput4().getInputs(), 5));
		  assertEquals("1,1,NORTH",testSimulate.startRobot(new TestInput5().getInputs(), 5));
	  }
	  
}
