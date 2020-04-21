package day1;

import java.util.Scanner;

public class LabOne {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean goAgain;
		do {//Prompt the user to enter values of length and width of the classroom.
		System.out.println("Enter length:");
		double length = scnr.nextDouble();
		
		System.out.println("Enter width:");
		double width = scnr.nextDouble();
		
		//Display the area and perimeter of that classroom.
		System.out.println("The area is " + (length * width));
		System.out.println("The perimeter is " + ((length *2) + (width * 2)));
		
		System.out.println("Would you like to continue (Y/N)");
		goAgain = scnr.next().startsWith("Y");}
		while (goAgain);
		
	
		//Ask if the user wants to continue (keep measuring rooms!).
		scnr.close();

	}

}
