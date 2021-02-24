package com.toyrobot.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.toyrobot.exception.InvalidInputException;
import com.toyrobot.inputoutput.ToyRobotInputOutput;
import com.toyrobot.inputoutput.ToyRobotInputOutputImpl;
import com.toyrobot.simulate.ToyRobotSimulateImpl;

/**
 * This class contains the main method.
 * It is starting point of execution for the Toy Robot Simulator
 */
public class ToyRobotController {
	
	/**
	 * This is the main method.
	 * The toy robot simulation starts from this method.
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> input = new ArrayList<String>();
		int boardSize = 5;
		ToyRobotInputOutput inout = new ToyRobotInputOutputImpl();
		Scanner myReader = new Scanner(System.in); 
		boardSize = getUserInputBoardSize(myReader,boardSize);
		
		//Enter the input file location from command prompt
        System.out.println("Enter the file location:");
        String fileLocation = myReader.nextLine();
		input = inout.readInput(fileLocation);
		ToyRobotSimulateImpl toyrobotService = new ToyRobotSimulateImpl();
		toyrobotService.startRobot(input,boardSize);
	}
	
	/**
	 * This method is for receiving the board size from the user
	 * @param myReader Scanner object
	 * @param boardSize Default board size 5
	 * @return Board size entered by the user
	 */
	private static int getUserInputBoardSize(Scanner myReader,int boardSize) 
	{
		//Enter the board size from command prompt
		try{
		System.out.println("The default board size is 5. Would you like to continue with the default board size?(Y?N):");
		String continueWithCurrentBoardSize = myReader.nextLine();
		if("Y".equalsIgnoreCase(continueWithCurrentBoardSize) || "YES".equalsIgnoreCase(continueWithCurrentBoardSize)){
			return boardSize;
		}
		else if("N".equalsIgnoreCase(continueWithCurrentBoardSize) || "NO".equalsIgnoreCase(continueWithCurrentBoardSize)){
				System.out.println("Enter the board size:");
				String inputBoardSize = myReader.nextLine();
				
					boardSize = Integer.parseInt(inputBoardSize);
					if(boardSize <= 0)
						throw new InvalidInputException("Board Size should be greater than 0.");
		}
		else{
			throw new InvalidInputException("Please enter Y or N.");
		}
		}
		catch(InvalidInputException e){
			System.out.println(e);
        	System.exit(0);
        }
        catch(NumberFormatException e){
        	System.out.println(e);
        	System.out.println("Please enter a valid board size. It should be a positive integer value, for example, 15.");
        	System.exit(0);
        }
		return boardSize;
	}
}
