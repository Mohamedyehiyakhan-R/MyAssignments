package learning_java.Looping_concept;

import java.util.Scanner;

public class Do_while {
	public static void main(String[] args) {
		
		//	what is do while?
		/* 
		--> A do-while loop is similar to the while loop, but with one main difference:

~ In while, the condition is checked before the loop runs.
~ In do-while, the condition is checked after the loop runs.
This means the loop body executes at least once, even if the condition is false. */
		 
	//SYNTAX -->  
		/*do {
	    // Code to execute
	} while (condition);
	*/
		Scanner scan= new Scanner(System.in);
		int age=0;
		System.out.println("your age should be >= 18");
		do {
			System.out.println("Enter your age:");
			age=scan.nextInt();
		}while(age<18);
	System.out.println("your age is "+age+" you are eligible for vote");
	}
}
