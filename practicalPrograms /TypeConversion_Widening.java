package practicalPrograms;

public class TypeConversion_Widening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50;
		long b=a; //int->long
		float c=b; //long->float
		
		System.out.println("Int value: "+a);
		System.out.println("Long value: "+b);
		System.out.println("Float value: "+c);
	}

}
