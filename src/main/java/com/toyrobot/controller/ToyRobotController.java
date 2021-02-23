package com.toyrobot.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.toyrobot.exception.InvalidInputException;
import com.toyrobot.inputoutput.ToyRobotInputOutput;
import com.toyrobot.inputoutput.ToyRobotInputOutputImpl;
import com.toyrobot.simulate.ToyRobotSimulateImpl;

public class ToyRobotController {
	public static void main(String[] args) {
		ArrayList<String> input = new ArrayList<String>();
		ToyRobotInputOutput inout = new ToyRobotInputOutputImpl();
		Scanner myReader = new Scanner(System.in); 
		int boardSize = 0;
		
		//Enter the board size from command prompt
		System.out.println("Enter the board size:");
		String inputBoardSize = myReader.nextLine();
		try{
			boardSize = Integer.parseInt(inputBoardSize);
			if(boardSize <= 0)
				throw new InvalidInputException("Board Size should be greater than 0");
		}
		catch(InvalidInputException e){
        	System.out.println(e);
        	System.exit(0);
        }
        catch(NumberFormatException e){
        	System.out.println("Board size should be an integer. Please enter valid board size.");
        	System.exit(0);
        }
		
		//Enter the input file location from command prompt
        System.out.println("Enter the file location:");
        String fileLocation = myReader.nextLine();
		input = inout.readInput(fileLocation);
		
        
		ToyRobotSimulateImpl toyrobotService = new ToyRobotSimulateImpl();
		toyrobotService.startRobot(input,boardSize);
	}
}
