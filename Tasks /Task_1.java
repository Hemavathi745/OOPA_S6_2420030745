package tasks;

import java.util.*;

class Student {
    String name;
    int rollno;
    int[] marks;

    void setter(String name, int rollno, int[] marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    void getter() {
        System.out.println("Name of the Student: " + name);
        System.out.println("Rollno of the Student: " + rollno);
        System.out.println("Marks of the Student:  ");
        for (int marks : marks) {
            System.out.print(marks + " ");
        }
    }
}

public class Task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter Name of Student: ");
	        String name = sc.next();

	        System.out.println("Enter Rollno of Student: ");
	        int rollno = sc.nextInt();

	        System.out.print("Enter number of subjects: ");
	        int n = sc.nextInt();
	        int[] marks = new int[n];

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter mark for subject " + (i + 1) + ": ");
	            marks[i] = sc.nextInt();
	        }

	        Student st = new Student();
	        st.setter(name, rollno, marks);
	        st.getter();
	        sc.close();
	}

}
