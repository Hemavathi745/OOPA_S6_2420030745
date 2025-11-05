package tasks_remaning;

class Person {
    void display() {
        System.out.println("This is a person.");
    }
}

class Admin extends Person {
    @Override
    void display() {
        System.out.println("I am an Admin.");
    }
}

class Student extends Person {
    @Override
    void display() {
        System.out.println("I am a Student.");
    }
}

class Faculty extends Person {
    @Override
    void display() {
        System.out.println("I am a Faculty member.");
    }
}

public class Task_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Admin();
        Person p2 = new Student();
        Person p3 = new Faculty();

        p1.display(); 
        p2.display(); 
        p3.display(); 
	}

}
