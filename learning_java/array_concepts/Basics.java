package learning_java.array_concepts;

import java.util.*;
public class Basics {
public static void main(String[] args) {
	Scanner scan= new Scanner (System.in);
	//System.out.println("Enter 5 numbers:");
//	int[] arr= {3,4,2,6,5};
//	int sum= arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
//	System.out.println("Sum of numbers are: "+sum);
	
/*	String[] lang= new String[5];
	lang[0]="tamil";
	System.out.println(lang[0]);
	lang[1]="english";
	System.out.println(lang[1]);
	lang[2]="hindi";
	System.out.println(lang[2]);
	lang[3]="spanish";
	System.out.println(lang[3]);
	lang[4]="malayalam";
	System.out.println(lang[4]);*/
	/*
	int[] scores= new int[5];
	System.out.println("Enter your scores: ");
	scores[0]=scan.nextInt();
	scores[1]=scan.nextInt();
	scores[2]=scan.nextInt();
	scores[3]=scan.nextInt();
	scores[4]=scan.nextInt();
	int tot=scores[0]+scores[1]+scores[2]+scores[3]+scores[4];
	System.out.println("total scores are "+ tot); */
		
	/* ----- PRINT TWO TABLE BY USING FOR LOOP -----
	for(int i=1;i<=10;i=i+1) {
		System.out.println("2 x "+i+" = "+i*2);
	} */
		//----- PRINT TABLES FOR GIVEN NUMBER BY USING FOR LOOP -----
	System.out.println("Enter the number: ");
	int num=scan.nextInt();
	System.out.println(num+"th"+" ~~~~~TABLE~~~~~\n");
	for(int i=1;i<=10;i+=1) {
		System.out.println(num+" X "+i+" = "+i*num);
	}
}
}
