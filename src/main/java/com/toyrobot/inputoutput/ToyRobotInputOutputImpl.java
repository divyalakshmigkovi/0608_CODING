package com.toyrobot.inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ToyRobotInputOutputImpl implements ToyRobotInputOutput{
	

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
			System.out.println("Invalid file name. Please enter a valid file name.");
			System.out.println("eg. E:\\Eclipse\\files\\input.txt");
		}
		return input;
	}

	public void writeOutput(String finalPosition) {
		System.out.println(""+finalPosition);
	/*	try {
		      FileWriter myWriter = new FileWriter("src/main/resources/output.txt");
		      System.out.println(""+finalPosition);
		      myWriter.write("");
		      if(finalPosition!= null){
		      myWriter.write(finalPosition);
		      }
		      myWriter.close();
		    } catch (IOException e) {
		      e.printStackTrace();
		    } */
	}
}
