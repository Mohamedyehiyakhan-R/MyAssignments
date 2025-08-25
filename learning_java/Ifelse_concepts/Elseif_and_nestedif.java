package learning_java.Ifelse_concepts;

import java.util.Scanner;

public class Elseif_and_nestedif {
	public static void main(String[] args) {
		System.out.println("Bismillah");
		Scanner scan=new Scanner(System.in);
		
		// ~~~~~~~~~~~~~~~ELSE IF~~~~~~~~~~~~~~~
 int number = 69;
if(number>=35 && number<60) {
	System.out.println("Bronze medal");
}
else if (number>=60 && number<90) {
	System.out.println("Silver medal");
}
else if(number>=90) {
	System.out.println("Gold medal");
} 
		// ~~~~~~~~~~NESTED IF~~~~~~~~~~ if the first 'if' gets false it willn't enter in to inside if 
/*boolean kfc=true;
boolean chicken=true;
boolean pepsi=true;
if(kfc==true) {
	System.out.println("Enter into kfc");
	if(chicken==false) {
		System.out.println("Eat chicken");
		if(pepsi=true) {
			System.out.println("Eeeyyaaabbb --> Digest Sound!");
		}
	}
} */
												//TERNARY OPERATOR

				//  Syntax --> variable= (condition)? valueIfTrue:valueIfFalse

		/*boolean rain=true;
		String res=rain?"take umbrella":"Enjoy sunlight";
		System.out.println(res);
		System.out.println("Enter 1st number");
		int a=scan.nextInt();
		System.out.println("Enter 2nd number");
		int b=scan.nextInt();
		String output = a>b?"First number is greater ":"Second number is greater";
		System.out.println(output); */
    }
  }
