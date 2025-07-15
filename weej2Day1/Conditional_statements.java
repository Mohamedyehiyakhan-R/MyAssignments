package weej2Day1;

import java.util.Scanner;

public class Conditional_statements {
	public static void main(String[] args) {
		System.out.println("~~~~~~~Eligibility for vote~~~~~~~ \n");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String name=input.nextLine();
		System.out.println("Enter your age: ");
		int age=input.nextInt();
		if(age>=18) {
			System.out.println("Hello, "+name+" you are eligible for vote.");
		}
		else {
	 System.out.println("Hello, "+name+" you are not eligible for vote!");}
	 }

}
