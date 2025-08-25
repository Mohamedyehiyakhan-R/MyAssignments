package learning_java.Looping_concept;

import java.util.Scanner;

public class Forloop {
public static void main(String[] args) {
	// Syntax  ---> for(initialization;range;increment/decrement)
	Scanner scan = new Scanner(System.in);
	// Program 1
	/*System.out.println("enter starting number: ");
	int num1=scan.nextInt();
	System.out.println("enter ending number: ");
	int num2=scan.nextInt();
	for(int i=num1;i<=num2;i=i+1) {
		System.out.println(i);
	}*/
	int count1=0;
	int  count2=0;
	
	for (int i=1;i<=10;i=i+1) {
		if(i%2==0) {
			System.out.println("Even number is "+i);
			count1=count1+1;
		}
		else {
			System.out.println("odd number is "+i);
			count2=count2+1;
		}
	}
	System.out.println("Even count = "+count1);
	System.out.println("Odd count = "+count2);
}
}
