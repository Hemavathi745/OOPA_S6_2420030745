package arrayList;
import java.util.*;

public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> students = new ArrayList<>();
        students.add("Ravi");
        students.add("Anita");
        students.add("Kiran");
        students.add(1, "Meena");
        System.out.println("Student List: " + students);
        students.remove("Anita");
        System.out.println("Is Kiran in the list? " + students.contains("Kiran"));
        System.out.println("Number of students: " + students.size());
        System.out.println("Updated Student List: " + students);

	}

}
