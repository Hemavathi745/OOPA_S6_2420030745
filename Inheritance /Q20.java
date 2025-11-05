package inheritance;
// Q20
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
class Student extends Person {
    String studentID;
    Student(String name, int age, String studentID) {
        super(name, age);
        this.studentID = studentID;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentID);
    }
}
class GraduateStudent extends Student {
    String thesisTopic;
    GraduateStudent(String name, int age, String studentID, String thesisTopic) {
        super(name, age, studentID);
        this.thesisTopic = thesisTopic;
    }
    void submitThesis() {
        System.out.println("Graduate student " + name + " is submitting thesis on: " + thesisTopic);
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}
public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        GraduateStudent gradStudent = new GraduateStudent("Alice", 25, "G12345", "AI in Healthcare");
        gradStudent.displayInfo();
        gradStudent.submitThesis();
	}

}
