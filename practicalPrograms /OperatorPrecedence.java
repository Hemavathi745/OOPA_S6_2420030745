package practicalPrograms;

public class OperatorPrecedence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 10 + 2 * 5;        
	        int b = (10 + 2) * 5;   
	        int c = 100 / 5 + 2 * 3 - 4; 
	        System.out.println("10 + 2 * 5 = " + a);
	        System.out.println("(10 + 2) * 5 = " + b);
	        System.out.println("100 / 5 + 2 * 3 - 4 = " + c);
	        // Explanation:
	        // * and / have higher precedence than + and -
	        // Evaluation is left to right for operators with same precedence
	}

}
