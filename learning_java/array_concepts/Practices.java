package learning_java.array_concepts;

import java.util.Scanner;

public class Practices {
 public static void main(String[] args) {
//	int [] [] matrix= {
//			{1,2,3},{4,5,6}
//			};
//	System.out.println(matrix[1][2]);
	 Scanner scan= new Scanner(System.in);
	 // Chatgpt Questions 
	 
	 //Ques 1 Take 5 number as input and print them
	 
	 /*int[] arr= new int[5];
	 System.out.println("Enter 5 numbers: ");
	 for(int i=0;i<5;i=i+1) {
		arr[i] = scan.nextInt();
	 }	
	 for(int j=0;j<5;j=j+1) {
			System.out.println(arr[j]);
		} */
	 
	//Ques 1 Find the sum of all elements in an array
	 /*int[] arr= new int[5];
	 System.out.println("Enter 5 numbers: ");
	 int sum=0;
	 for(int i=0;i<5;i=i+1) {
		arr[i] = scan.nextInt();
	 }	
	 for(int j=0;j<5;j=j+1) {
		 sum=sum+arr[j];
		}
	 System.out.println("Sum is "+sum); */
	 
	 //Ques 3 Find the largest and smallest number in an array
	 int[] array= {
			 1,77,64,30,7
	 };
	int lar=array[0];
	int small=array[0];
	for(int i=0;i<array.length;i=i+1) {
		if(array[i]>lar) {
			lar=array[i];
		}
		if(array[i]<small) {
			small=array[i];
			}
	}
	 System.out.println("largest number is "+lar);
	 System.out.println("smallest number is "+small);
}
}
