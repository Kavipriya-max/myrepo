package com.tnsif.day3.oops;
import java.util.Scanner;

public class ScannerClass extends Encapsulation{

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the console
		        System.out.println("Enter your name:");
		        String str = sc.nextLine(); // Read user input
		        System.out.println("Your name is " + str);
		        sc.close(); // Close the scanner to free up resources
		    }
		}
	


