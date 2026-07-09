package com.ashish.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	
	public static void displayHeading() {
		System.out.println("===================================");
		System.out.println("JAVA CALCULATOR");
		System.out.println("===================================");
	}
	
	public static void displayMenu() {
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulus");
		System.out.println("6. Power");
		System.out.println("7. Maximum");
		System.out.println("8. Minimum");
		System.out.println("9. Average");
	
		System.out.println("10. Percentage");
		
		System.out.println("11. Square");
		System.out.println("12. Cube");
		System.out.println("13. Factorial");
		System.out.println("14. Prime Number");
		System.out.println("15. SquareRoot");
		System.out.println("16. Show History");
		
		System.out.println("17. Exit");
		
		System.out.print("Choose an option : ");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HistoryManager hm = new HistoryManager();
		FileManager fm = new FileManager();
		Operations op = new Operations();
		
		int choice = 0;
		int num1 = 0;
		int num2 = 0;
		
		do {
			displayHeading();
			
			displayMenu();
			
			try {
				choice = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("❌ Please enter a valid menu number.");
				sc.nextLine();
				continue;
			}
			
			if(choice >= 1 && choice <= 9)  {
				
				try {
					System.out.print("Enter First Number : ");
					num1 = sc.nextInt();
					
					System.out.print("Enter Second Number : ");
					num2 = sc.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("❌ Please enter a valid number.");
					sc.nextLine();
					continue;
				}
				
			} else if(choice == 10) {
				
				try {
					System.out.print("Enter Obtained Marks : ");
					num1 = sc.nextInt();
					System.out.print("Enter Total Marks : ");
					num2 = sc.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("❌ Please enter a valid number.");
					sc.nextLine();
					continue;
				}
				
			} else if (choice >= 11 && choice <= 15) {
				try {
					System.out.print("Enter first Number : ");
					num1 = sc.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("❌ Please enter a valid number.");
					sc.nextLine();
					continue;
				}
			}
			
			switch (choice) {
			case 1:
			    int answer = op.add(num1, num2);
			    
			    System.out.println("Answer : " + answer);

			    String record = num1 + " + " + num2 + " = " + answer;

			    hm.addRecord(record);
			    fm.saveHistory(record);
			    break;
			
			case 2: 
				answer = op.subtraction(num1, num2);
				System.out.println("Answer : " + answer);
				record = num1 + " - " + num2 + " = " + answer;

			    hm.addRecord(record);
			    fm.saveHistory(record);
				break;
				
			case 3: 
				answer = op.multiplication(num1, num2);
				System.out.println("Answer : " + answer);
				record = num1 + " * " + num2 + " = " + answer;
				hm.addRecord(record);
				fm.saveHistory(record);
				break;
				
			case 4: 
				try {
			        answer = op.division(num1, num2);
			        System.out.println("Answer : " + answer);
			        record = num1 + " / " + num2 + " = " + answer;
			        hm.addRecord(record);
			        fm.saveHistory(record);
			    } catch (ArithmeticException e) {
			        System.out.println("❌ Cannot divide by zero.");
			    }
				break;
				
			case 5: 
				answer = op.modulus(num1, num2);
				System.out.println("Answer : " + answer);
				record = num1 + " % " + num2 + " = " + answer;
				hm.addRecord(record);
				fm.saveHistory(record);
				break;
				
			case 6:
				answer = op.power(num1, num2);
				System.out.println("Answer : " + answer);
				record = num1 + " ^ " + num2 + " = " + answer;
				hm.addRecord(record);
				fm.saveHistory(record);
				break;
				
			case 7: 
				answer = op.maximum(num1, num2);
				System.out.println("Maximum Number : " + answer);
				record = "Max of " + num1 + " and " + num2 + " = " + answer;
				hm.addRecord(record);
				fm.saveHistory(record);
				break;
				
			case 8: 
				answer = op.minimum(num1, num2);
				System.out.println("Minimum Number : " + answer);
				record = "Min of " + num1 + " and " + num2 + " = " + answer;
				hm.addRecord(record);
				fm.saveHistory(record);
				break;
				
			case 9:
				answer = (int) op.average(num1, num2);
				System.out.println("Answer : " + answer);
				record = "Average of " + num1 + " and " + num2 + " = " + answer;
				hm.addRecord(record);
				fm.saveHistory(record);
				break;
				
			case 10: 
				answer = (int) op.percentage(num1, num2);
				System.out.println("Answer : " + answer + "%");
				record = "Percentage of " + (num1 + " / " + num2) + " * 100" + " = " + answer + "%";
				hm.addRecord(record);
				fm.saveHistory(record);
				break;
				
			case 11:
				answer = op.square(num1);
				System.out.println("Answer : " + answer);
				record = "Square of " + num1 + " * " + num1 + " = " + answer;
				hm.addRecord(record);
				fm.saveHistory(record);
				break;
				
			case 12:
				answer = op.cube(num1);
				System.out.println("Answer : " + answer);
				record = "Cube of " + num1 + " * " + num1 + " * " + num1 + " = " + answer;
				hm.addRecord(record);
				fm.saveHistory(record);
				break;
				
			case 13:
				answer = op.factorial(num1);
				System.out.println("Answer : " + answer);
				record = "Factorial of " + num1 + " = " + answer;
				hm.addRecord(record);
				fm.saveHistory(record);
				break;
				
			case 14:
				 boolean isPrime = op.primeNumber(num1);

				    if (isPrime) {
				        System.out.println(num1 + " is a Prime Number.");
				        record = num1 + " is Prime";
				        hm.addRecord(record);
				        fm.saveHistory(record);
				    } else {
				        System.out.println(num1 + " is Not Prime.");
				        record = num1 + " is Not Prime";
				        hm.addRecord(record);
				        fm.saveHistory(record);
				    }
				    break;
				
			case 15:
			    double sqyare = op.squareRoot(num1);

			    System.out.println("\n----- Square Root -----");

			    if (sqyare == -1) {
			        System.out.println("❌ Square root of a negative number is not possible.");
			    } else {
			        System.out.println("Answer : " + sqyare);
			        record = "√" + num1 + " = " + sqyare;
			        hm.addRecord(record);
			        fm.saveHistory(record);
			    }
				break;
				
			case 16:
			    hm.showHistory();
			    fm.showHistory();
			    break;

			case 17:
			    System.out.println("Exiting....");
			    break;
				
			default:
				System.out.println("Invalid Choice!");
				System.out.println("Please select a number between 1 and 6.");
			}
			
		} while(choice != 17);
		
		System.out.println("\nThank you for using Java Calculator.");
		
		sc.close();
	} 

}
