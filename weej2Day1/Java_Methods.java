package weej2Day1;

public class Java_Methods {
	public static void main(String[] args) {
		String name="yehiyakhan";
		int len=name.length();
		System.out.println("The length is "+len);
		
		char a=name.charAt(3);
		System.out.println(a);
		
		char[] caname=name.toCharArray();
		for(int i=caname.length-1;i>=0;i--) {
			char c=caname[i];
			System.out.print(c);
		}
		// Lowercase to Uppercase:
		String upper=name.toUpperCase();
		System.out.println("\n"+name+"--->"+upper);
		
		//Uppercase to  Lowercase
		String lower =upper.toLowerCase();
		System.out.println(upper+"--->"+lower);
		
		//Equals
		String str1="hello";
		String str2="hi";
		System.out.println(str1.equals(str2));
		}
	}

	
