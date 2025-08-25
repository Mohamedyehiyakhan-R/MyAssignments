package learning_java.array_concepts;

import java.util.Scanner;

public class Array_forloop{
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		//Ques 1 --> Get 5 input values and Print them by using For loop
		System.out.println("Enter 5 numbers: ");
		int[] array= new int[5];
		for(int i=0;i<5;i=i+1) {
			array[i]=scan.nextInt();
		}
		for(int j=0;j<5;j=j+1) {
					System.out.println(array[j]);
			} 
		
		//Ques 2 --> Print 10 numbers from an Array usimh for loop
		/*int[] arr= {10,9,8,7,6,5,4,3,2,1};
		for(int i=0;i<10;i=i+1) {
			System.out.println(arr[i]);
		} */
		
		// Ques 3 --> 

		} 
}