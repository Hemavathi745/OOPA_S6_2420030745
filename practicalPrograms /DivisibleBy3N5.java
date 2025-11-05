package practicalPrograms;

import java.util.*; 

public class DivisibleBy3N5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " is divisible by both 3 and 5");
        }else { 
        System.out.println(num + " is not divisible by both 3 and 5");
        }
        sc.close();
	}

}
