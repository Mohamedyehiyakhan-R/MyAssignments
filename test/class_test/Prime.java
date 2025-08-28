package class_test;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		//create object for scanner class
		Scanner scan = new Scanner(System.in);
		
		//create boolean variable
		boolean result=true;
		System.out.println("Enter Any Number: ");
		
		//Get an input from the user
		int num=scan.nextInt();
		
		//Defining the logic
		if(num<=1) {
			result = false;
		}
		else {
			for(int i=2;i<=num/2;i=i+1) {
				if(num%2==0) {
					result = false;
				}
			}
		}
		
		//Verify and Print the result
		if(result) {
			System.out.println(num+" is a Prime Number..");
		}
		else {
			System.out.println(num+" is Not a Prime Number..");
		}

	}

}
