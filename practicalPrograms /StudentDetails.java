package practicalPrograms;

import java.util.*;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		System.out.println("Enter your roll number: ");
		int rollNo=sc.nextInt();
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		System.out.println("Enter your gender(F/M): ");
		char gender=sc.next().charAt(0);
		System.out.println("Enter your percentage: ");
		float percentage=sc.nextFloat();
		System.out.printf("Name: %s\nRoll No: %d\nAge: %d\nGender: %c\nPercentage: %.2f", name, rollNo, age, gender, percentage);
		sc.close();
	}

}
