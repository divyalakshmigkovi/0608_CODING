package com.toyrobot.inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class is for reading the input and writing the output
 */
public class ToyRobotInputOutputImpl implements ToyRobotInputOutput{
	
	/**
	 * Reads the input from a file
	 * @param fileName Name of the input file
	 * @return Lines from the input file in the form of an ArrayList
	 */
	public ArrayList<String> readInput(String fileName) {
		// TODO Auto-generated method stub
        File myObj = new File(fileName);
        Scanner myReader;
		ArrayList<String> input = new ArrayList<>();
		try {
			myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        input.add(data.trim());
		      }
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.out.println("Please enter the correct file location, for example, E:\\Eclipse\\files\\Samples\\input.txt");
		}
		return input;
	}

	/**
	 * This method writs the output to console
	 * @param finalPosition Final position of the Robot
	 */
	public void writeOutput(String finalPosition) {
		System.out.println(finalPosition);
	}
}
