package practicalPrograms;

import java.util.*;

public class AveragePrecedence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbres: ");
		 double a = sc.nextDouble();
	     double b = sc.nextDouble();
	     double c = sc.nextDouble();
	     double avg = (a + b + c) / 3;
         System.out.println("Average = " + avg);
         //Since parenthesis are used first addition is done, then division
         sc.close();
	}

}
