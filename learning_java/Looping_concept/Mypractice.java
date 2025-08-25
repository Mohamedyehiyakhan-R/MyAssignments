package learning_java.Looping_concept;

public class Mypractice {
public static void main(String[] args) {
	/*for (int i=1;i<100;i=i+1) {
		if(i%3==0 && i%5==0) {
			System.out.println(i);
		}
		else {
			//System.out.println("invalid");
		}
	} */
	//Star pattern programs
	for(int i=1;i<=5;i=i+1) {
		for(int j=1;j<=i;j=j+1) {
		System.out.print("*");	
		}
		System.out.println();
	} 
}
}
