package learning_java.Ifelse_concepts;

import java.util.Scanner;

public class Practice_prgms {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
												//Ques 1
		
		/*System.out.println("Enter score7");
		int score=scan.nextInt();
		if(score<50) {
			System.out.println("You need you to improve.. friend");
		}
		else if(score>=50 && score <=70) {
			System.out.println("Great job! friend");
		}
		else if(score>70) {
			System.out.println("Excelent! friend");
		}*/
													//Ques 2
		
		/*System.out.println("Enter subject marks:");
		int sub1=scan.nextInt();
		int sub2=scan.nextInt();
		int sub3=scan.nextInt();
		int sub4=scan.nextInt();
		int sub5=scan.nextInt();
		int avg=sub1+sub2+sub3+sub4+sub5;
		int favg=avg/5;
		if(favg<35) {
			System.out.println("Your Average is "+favg+" Additional class is required");
		}
		else {
			System.out.println("Your Average is "+favg+" You are good to go");
		} */
		
														//Ques 3
		/*
		System.out.println("What is the color of the traffic light? ");
		String clr1=scan.nextLine();
		if (clr1.equals("red")) {
			System.out.println("Please stop!");
		}
		else if(clr1.equals("yellow")) {
			System.out.println("Get ready!");
		}
		else if(clr1.equals("green")) {
			System.out.println("Go!");
		} */
		
														// Ques 4
		/* System.out.println("Enter salary: ");
		int salary = scan.nextInt();
		System.out.println("Enter age: ");
		int age= scan.nextInt();
		int loan=0;
		if(salary>=20000 ||  age<25) {
			System.out.println("Yor are eligible to apply loan");
			System.out.println("\nEnter yourLoan amount?");
			loan=loan+scan.nextInt();
			if(loan<=50000) {
				System.out.println("Loan available");
			}
			else {
				System.out.println("Loan Amount is higher ");
			}
		}
		else {
			System.out.println("No loan odraa!");
		} */
							
			//Ques 5
		
		int[] arr= {2,4,6,8,};
		System.out.println(arr[4]);
	}

}
