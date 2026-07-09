package com.ashish.calculator;
import java.io.FileWriter; 
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileManager {

	public void saveHistory(String record) {
		try {
			FileWriter writer = new FileWriter("history.txt", true);
			writer.write(record + "\n");
			writer.close();
		} catch (IOException e) {
	        System.out.println("Error while saving history.");
		}
	}
	
	public void showHistory() {

	    try {

	        FileReader fileReader = new FileReader("history.txt");
	        BufferedReader reader = new BufferedReader(fileReader);

	        String line;

	        System.out.println("\n===== Calculator History =====");

	        while ((line = reader.readLine()) != null) {

	            System.out.println(line);

	        }

	        reader.close();

	    } catch (IOException e) {

	        System.out.println("No History Found.");

	    }

	}
	
}
