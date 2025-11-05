package practicalPrograms;

public class PrimitiveTypes {

	public static void main(String[] args) {
		byte b = 100;
		short s=200;
		int i = 123;
		long l = 1234567890L;
		float f = 3.14f;
		double d = 19.99;
		char c = 'A';
		boolean bool = true;

		System.out.println("Sizes using wrapper classes: ");
		System.out.println("Byte: " + Byte.BYTES + " bytes"+" - Byte value: "+b);
		System.out.println("Short: " + Short.BYTES + " bytes"+" - Short value: "+s);
		System.out.println("Integer: " + Integer.BYTES + " bytes"+" - Int value: "+i);
		System.out.println("Long: " + Long.BYTES + " bytes"+" - Long value: "+l);
		System.out.println("Float: " + Float.BYTES + " bytes"+" - Float value: "+f);
		System.out.println("Double: " + Double.BYTES + " bytes"+" - Double value: "+d);
		System.out.println("Character: " + Character.BYTES + " bytes"+" - Char value: "+c);
		System.out.println("Boolean: Implementation dependent as size not defined"+" - Boolean value: "+bool);
	}
}
