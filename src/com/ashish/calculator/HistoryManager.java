package com.ashish.calculator;

public class HistoryManager {
	 private String[] history = new String[100];
	 private int historyIndex = 0;
	 
	 public void addRecord(String record) {
		 history[historyIndex] = record;
		 historyIndex++;
	 }
	 
	 public void showHistory() {

		 for(int i = 0; i < historyIndex; i++) {
			 System.out.println(history[i]);
		 }
	 }
}
