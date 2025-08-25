package learning_java.Ifelse_concepts;
import java.util.Scanner;

public class About_ifelse {
	public static void main(String[] args) throws InterruptedException {
			Scanner scan = new Scanner(System.in);
			
			//---------> If else concepts
												// 1st program -->  Basic
			
			System.out.println("Choose any one rain or no rain ?");
			String input = scan.nextLine();
			String rain="rain";
				if(input.equalsIgnoreCase(input) && input.equals(rain)) {
					System.out.println("Please take an umbrella my friend!");
				}
				else if(input.equalsIgnoreCase(input) && input.equals("no rain")) {
					System.out.println("Enjoy the sunlight my friend!");
				} 
				else {
					System.out.println("Please respond to the question I asked, not beyond that ");
					Thread.sleep(4000);
					System.out.println("Hope you understand...");
				}
				
												//  2nd Program -->To find which number is greater?
				/*int num1 = 40;
				int num2 = 7;
				
				/* if(num1>num2) {
					System.out.println("Number 1 is greater");
				}
				else {
				System.out.println("Number 2 is greater");
				} */
				
												// 3rd Program --> To find both numbers are same
				
				/*System.out.println("Enter first number: ");
				int num1 = scan.nextInt();
				System.out.println("Enter first number: ");
				int num2 = scan.nextInt();
				if(num1==num2) {
					System.out.println("Both are equal");
				}
				else {
					System.out.println("Not equal!"); } */
			
												// 4th Program --> To Check the given number is Odd or Even
			/*
				System.out.println("Enter a number: ");
				int num=scan.nextInt();
				if(num % 2 ==0) {
					System.out.println("The number is Even ");
				}
				else {
					System.out.println("The number is odd");
				} */
			
												// 5th Program --> Logical operators...
			/*
			System.out.println("Enter a number: ");
			int numb1=scan.nextInt();
			if(numb1 % 3 ==0 && numb1 %5==0) {
				System.out.println("The number is div by 3 and 5 ");
			}
			else {
				System.out.println("The number is not div by 3 and 5");
			} */
		}
	}

