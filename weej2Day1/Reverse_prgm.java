package weej2Day1;

public class Reverse_prgm {
	public static void main(String[] args) {
		String name="ayihey";
		
		char[] caname=name.toCharArray();
		for(int i=caname.length-1;i>=0;i--)
		{
			char c=caname[i];
			System.out.print(c);
		}
		String uppercase=name.toUpperCase();
	}

}
