package learning_java.oops_concepts.class_object;

public class Mobile {
					//Class
	/* String name="";
	String processor="";
	int price=0;
	int ram=0;
	String color="";
	public static void main(String[] args) {
		Mobile mob1= new Mobile();
		mob1.name="Samsung";
		mob1.price=50000;
		mob1.processor="9 Gen";
		mob1.color="black";
		
		System.out.println("Mobile: "+mob1.name+"\n"+"Price: "+mob1.price);
	Mobile mob2= new Mobile();
	
	mob2.name="Iphone";
	mob2.price=100000;
	mob2.processor="ios 15";
	mob2.color="Grey";
	System.out.println("Mobile: "+mob2.name+"\n"+"Price: "+mob2.price); 
	} */
	 void greetings() {
		 System.out.println("Good Morning!");
		 eat();
	 }
	  void eat() {
		  System.out.println("Have you eat BreaFast");
	  }
	 public static void main(String[] args) {
		Mobile obj1=new Mobile();
		obj1.greetings();
		
	}
}
