package learning_java;

import java.util.*;

public class Javabasics {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name= scan.nextLine(); 
		int age = scan.nextInt();
		// In this line compiler usually skip becz it take a next line as input so we give this particular line
		scan.nextLine();
		String addr = scan.nextLine();
		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);  
	}
}
