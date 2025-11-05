package practicalPrograms;

import java.util.*;

public class AsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a character: ");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		int ascii=(int)ch;
		int intvalue=ascii;
		System.out.println("Given Character: "+ch);
		System.out.println("Ascii value: "+ascii);
		System.out.println("Integer value of the ascii: "+intvalue);
		
		sc.close();
	}

}
